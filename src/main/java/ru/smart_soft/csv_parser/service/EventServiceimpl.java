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
public class EventServiceimpl implements EventService {
    private final EventRepository repository;

    @Autowired
    public EventServiceimpl(EventRepository repository) {
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
                .collect(groupingBy(Event::getUserId, Collectors.mapping(Event::getUrl, Collectors.joining(",\n"))));
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
                .filter(event -> event.getGroup().contains("dszn_"))
                .sorted(Comparator.comparing(Event::getTime))
                .collect(groupingBy(Event::getUserId, Collectors.mapping(Event::getSubtype, Collectors.joining(" "))));
        map.forEach((x, y) -> System.out.println(x + " " + y));
        return map.entrySet().stream()
                .filter(entry -> !(entry.getValue().endsWith("send")))
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> Arrays.stream(entry.getValue().split(" ")).reduce((a, b) -> b).orElse("false")));
    }
}
