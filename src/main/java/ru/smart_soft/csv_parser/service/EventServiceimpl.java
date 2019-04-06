package ru.smart_soft.csv_parser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.smart_soft.csv_parser.model.Event;
import ru.smart_soft.csv_parser.repository.EventRepository;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    public List<Event> findAll() {
        return null;
    }

    @Override
    public Map<String, Long> findTopFiveForm() {
        Map<String, Long> eventSumByIdForm = repository.findAll().stream()
                .filter(x -> !(x.getFormid().isEmpty()))
                .collect(Collectors.groupingBy(Event::getFormid, Collectors.counting()));

        return eventSumByIdForm.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
