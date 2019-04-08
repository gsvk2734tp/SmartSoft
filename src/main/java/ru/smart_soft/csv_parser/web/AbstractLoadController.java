package ru.smart_soft.csv_parser.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.smart_soft.csv_parser.model.Event;
import ru.smart_soft.csv_parser.service.EventService;
import ru.smart_soft.csv_parser.service.Utils.CsvToBeanUtil;

import java.io.Reader;
import java.util.Collections;
import java.util.Map;

public class AbstractLoadController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private EventService service;

    private void save(Event event) {
        log.info("Save {}", event);
        service.save(event);
    }

    private void deleteAll() {
        log.info("Delete all rows");
        service.deleteAll();
    }

    Map<String, String> findAllUsersNotFinish() {
        log.info("Get all users dont finish form");
        return checkEmpty(service.findAllUsersNotFinish());
    }

    Map<String, String> findAllLastHour() {
        log.info("Get all active users last hour");
        return checkEmpty(service.findAllLastHour());
    }

    Map<String, Long> findTopFiveForm() {
        log.info("Get top 5 url");
        Map<String, Long> map = service.findTopFiveForm();
        return map.isEmpty() ? Collections.emptyMap() : map;
    }

    void saveEventByCsvFile(Reader stream) {
        deleteAll();
        log.info("==========================================");
        log.info("Start convert CSV file");
        log.info("==========================================");
        CsvToBeanUtil converter = new CsvToBeanUtil();
        converter.convertToBean(stream).forEach(this::save);
    }

    Map<String, String> checkEmpty(Map map) {
        return map.isEmpty() ? Collections.emptyMap() : map;
    }
}
