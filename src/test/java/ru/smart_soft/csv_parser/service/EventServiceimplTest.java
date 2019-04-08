package ru.smart_soft.csv_parser.service;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static ru.smart_soft.csv_parser.EventTestData.*;

class EventServiceimplTest extends AbstractServiceTest {

    @Test
    void save() {
        service.save(NEW_EVENT);
        assertMatch(repository.findAll(), EVENT1, EVENT2, EVENT3, EVENT4, EVENT5, EVENT6, EVENT7, EVENT8, EVENT9, EVENT10, NEW_EVENT);
    }

    @Test
    void deleteAll() {
        service.deleteAll();
        assertMatch(repository.findAll(), Collections.EMPTY_LIST);
    }

    @Test
    void findAllLastHour() {
        assertTwoMap(service.findAllLastHour(), LAST_HOUR_USERS_AND_URL);
    }

    @Test
    void findTopFiveForm() {
        service.save(NEW_EVENT);
        assertTwoMap(service.findTopFiveForm(), TOP_FIVE_URL_COUNT);
    }

    @Test
    void findAllUsersNotFinish() {
        //TODO
    }
}