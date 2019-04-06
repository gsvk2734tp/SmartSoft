package ru.smart_soft.csv_parser.repository;

import ru.smart_soft.csv_parser.model.Event;

import java.util.List;

public interface EventRepository {

    Event save(Event event);

    void deleteAll();

    List<Event> findAll();

//    List<Event> findTopFiveForm();
}
