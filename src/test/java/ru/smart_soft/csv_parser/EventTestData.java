package ru.smart_soft.csv_parser;

import com.google.common.collect.Maps;
import ru.smart_soft.csv_parser.model.Event;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EventTestData {

    public static final Event EVENT1 = new Event("UserId1", "2499763594", "group1", "type1", "subtype1", "url1", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT2 = new Event("UserId2", "2499763595", "group1", "type1", "subtype1", "url1", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT3 = new Event("UserId3", "2499763596", "group1", "type1", "subtype1", "url1", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT4 = new Event("UserId3", "2499763596", "group1", "type1", "subtype1", "url2", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT5 = new Event("UserId3", "2499763596", "group1", "type1", "subtype1", "url3", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT6 = new Event("UserId3", "1", "group1", "type1", "subtype1", "url1", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT7 = new Event("UserId4", "2", "group1", "type1", "subtype1", "url1", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT8 = new Event("UserId4", "2", "group1", "type1", "subtype1", "url1", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT9 = new Event("UserId4", "2", "group1", "type1", "subtype1", "url1", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");
    public static final Event EVENT10 = new Event("UserId4", "2", "group1", "type1", "subtype1", "url1", "orgId1", "formid1", "ltpa1", "code1", "sudirresponse1", "dateTime1");

    public static final Map<String, String> NOT_FINISHED = new HashMap<>();
    static {
        NOT_FINISHED.put("UserId1", "url1");
        NOT_FINISHED.put("UserId2", "url1");
        NOT_FINISHED.put("UserId3", "url1 url2");
    }

    public static void assertTwoMap(Map actual, Map expected) {
        assertTrue(Maps.difference(actual, expected).areEqual());
    }

    public static void assertMatch(Event actual, Event expected) {
        assertThat(actual).isEqualToIgnoringGivenFields(expected, "registered", "meals");
    }

    public static void assertMatch(Iterable<Event> actual, Event... expected) {
        assertMatch(actual, List.of(expected));
    }

    public static void assertMatch(Iterable<Event> actual, Iterable<Event> expected) {
        assertThat(actual).usingElementComparatorIgnoringFields("id").isEqualTo(expected);
    }
}
