package ru.smart_soft.csv_parser;

import com.google.common.collect.Maps;
import ru.smart_soft.csv_parser.model.Event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EventTestData {

    public static final Event EVENT1 = new Event("UserId1", "2499763594", "group1", "type1", "subtype1", "https://www.mos.ru/pgu/ru/application/guis/-47/#step_1", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT2 = new Event("UserId2", "2499763595", "group1", "type1", "subtype1", "https://www.mos.ru/pgu/ru/application/guis/-47/#step_1", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT3 = new Event("UserId3", "2499763596", "group1", "type1", "subtype1", "https://www.mos.ru/pgu/ru/application/guis/-47/#step_1", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT4 = new Event("UserId3", "2499763597", "group1", "type1", "subtype1", "https://www.mos.ru/pgu/ru/application/guis/-47/#step_1", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT5 = new Event("UserId3", "2499763598", "group1", "type1", "subtype1", "https://www.mos.ru/pgu/ru/application/guis/-47/#step_1", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT6 = new Event("UserId3", "1", "group1", "type1", "subtype1", "https://www.mos.ru/pgu/ru/application/guis/-47/#step_2", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT7 = new Event("UserId4", "2", "group1", "type1", "subtype1", "https://www.mos.ru/pgu/ru/application/guis/-47/#step_3", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT8 = new Event("UserId4", "3", "group1", "type1", "subtype1", "https://www.mos.ru/pgu/ru/application/guis/-47/#step_4", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT9 = new Event("UserId4", "4", "group1", "type1", "subtype1", "https://www.mos.ru/pgu/ru/application/guis/-47/#step_5", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT10 = new Event("UserId4", "5", "group1", "type1", "subtype1", "https://www.mos.ru/pgu/ru/application/guis/-47/#step_6", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");

    public static final Event NEW_EVENT = new Event("UserId10", "6", "group1", "type1", "subtype1", "https://www.mos.ru/pgu/ru/application/guis/-47/#step_2", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");

    public static final Map<String, String> LAST_HOUR_USERS_AND_URL = new HashMap<>();
    static {
        LAST_HOUR_USERS_AND_URL.put("UserId1", "https://www.mos.ru/pgu/ru/application/guis/-47/#step_1");
        LAST_HOUR_USERS_AND_URL.put("UserId2", "https://www.mos.ru/pgu/ru/application/guis/-47/#step_1");
        LAST_HOUR_USERS_AND_URL.put("UserId3", "https://www.mos.ru/pgu/ru/application/guis/-47/#step_1, https://www.mos.ru/pgu/ru/application/guis/-47/#step_1, https://www.mos.ru/pgu/ru/application/guis/-47/#step_1");
    }

    public static final Map<String, Long> TOP_FIVE_URL_COUNT = new HashMap<>();
    static {
        TOP_FIVE_URL_COUNT.put("https://www.mos.ru/pgu/ru/application/guis/-47/#step_1", 5L);
        TOP_FIVE_URL_COUNT.put("https://www.mos.ru/pgu/ru/application/guis/-47/#step_2", 2L);
        TOP_FIVE_URL_COUNT.put("https://www.mos.ru/pgu/ru/application/guis/-47/#step_3", 1L);
        TOP_FIVE_URL_COUNT.put("https://www.mos.ru/pgu/ru/application/guis/-47/#step_4", 1L);
        TOP_FIVE_URL_COUNT.put("https://www.mos.ru/pgu/ru/application/guis/-47/#step_5", 1L);
    }

    public static void assertTwoMap(Map actual, Map expected) {
        actual.forEach((a, b) -> System.out.println(a + " " + b));
        expected.forEach((a, b) -> System.out.println(a + " " + b));
        assertTrue(Maps.difference(actual, expected).areEqual());
    }

    public static void assertMatch(Event actual, Event expected) {
        assertThat(actual).isEqualToIgnoringGivenFields(expected, "id");
    }

    public static void assertMatch(Iterable<Event> actual, Event... expected) {
        assertMatch(actual, List.of(expected));
    }

    public static void assertMatch(Iterable<Event> actual, Iterable<Event> expected) {
        assertThat(actual).usingElementComparatorIgnoringFields("id").isEqualTo(expected);
    }
}
