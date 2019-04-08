package ru.smart_soft.csv_parser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.smart_soft.csv_parser.model.Event;
import ru.smart_soft.csv_parser.repository.EventRepository;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

@Service
public class EventServiceImpl implements EventService {
    private final EventRepository repository;

    @Autowired
    public EventServiceImpl(EventRepository repository) {
        this.repository = repository;
    }


    @Override
    public Event save(Event event) {
        return repository.save(event);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();

    }

    @Override
    public Map<String, String> findAllLastHour() {
        return repository.findAll().stream()
                .filter(event -> !(event.getUrl().isEmpty()))
                .filter(event -> (System.currentTimeMillis() / 1000 - Long.valueOf(event.getTime())) < 3600)
                .collect(groupingBy(Event::getUserId, Collectors.mapping(Event::getUrl, Collectors.joining(", "))));
    }

    @Override
    public Map<String, Long> findTopFiveForm() {
        Map<String, Long> eventSumByIdForm = repository.findAll().stream()
                .filter(event -> !(event.getUrl().isEmpty()))
                .collect(groupingBy(Event::getUrl, Collectors.counting()));

        return eventSumByIdForm.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    @Override
    public Map<String, String> findAllUsersNotFinish() {
        Map<String, String> map = repository.findAll().stream()
                .filter(event -> !(event.getUrl().isEmpty()))
                .filter(event -> !("unauthorized".equals(event.getUserId().toLowerCase())))
                .sorted(Comparator.comparing(Event::getTime))
                .collect(groupingBy(Event::getUserId, Collectors.mapping(Event::getSubtype, Collectors.joining(" "))));
        return map.entrySet().stream()
                .filter(this::isFinish)
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> Arrays.stream(entry.getValue().split(" ")).reduce((a, b) -> b).orElse("false")));
    }

    private boolean isFinish(Map.Entry<String, String> entry) {
        return !(entry.getValue().endsWith("send")
                || (entry.getValue().endsWith("sent"))
                || (entry.getValue().endsWith("success"))
                || (entry.getValue().endsWith("done")));
    }
}
