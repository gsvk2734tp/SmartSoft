package ru.smart_soft.csv_parser.service;

import org.springframework.data.domain.Sort;
import ru.smart_soft.csv_parser.model.Event;

import java.util.List;
import java.util.Map;

public interface EventService {

    Event save(Event event);

    void deleteAll();

    List<Event> findAll();

    Map<String, Long> findTopFiveForm();
}
