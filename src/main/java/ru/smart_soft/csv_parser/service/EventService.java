package ru.smart_soft.csv_parser.service;

import ru.smart_soft.csv_parser.model.Event;

import java.util.Map;

public interface EventService {

    Event save(Event event);

    void deleteAll();

    Map<String, String> findAllLastHour();

    Map<String, Long> findTopFiveForm();

    Map<String, String> findAllUsersNotFinish();
}
