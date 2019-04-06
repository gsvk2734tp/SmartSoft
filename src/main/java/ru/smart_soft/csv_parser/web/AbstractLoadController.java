package ru.smart_soft.csv_parser.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.smart_soft.csv_parser.model.Event;
import ru.smart_soft.csv_parser.service.EventService;
import ru.smart_soft.csv_parser.service.Utils.CsvToBeanUtil;

import java.io.Reader;
import java.util.List;
import java.util.Map;

public class AbstractLoadController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private EventService service;

    Event save(Event event) {
        log.info("SAVE {}", event);
        service.save(event);
        return event;
    }

    void deleteAll() {
        log.info("DELETE ALL ROWS");
        service.deleteAll();
    }

    Map<String, String> findAllLastHour() {
        return service.findAllLastHour();
    }

    Map<String, Long> findTopFiveForm() {
        log.info("GET TOP 5 FORM");
        return service.findTopFiveForm();
    }

    void saveEventByCsvFile(Reader stream) {
        deleteAll();
        log.info("==========================================");
        log.info("START CONVERT CSV FILE");
        log.info("==========================================");
        CsvToBeanUtil converter = new CsvToBeanUtil();
        converter.convertToBean(stream).forEach(this::save);
    }

}
