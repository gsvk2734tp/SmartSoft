package ru.smart_soft.csv_parser.service.Utils;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.CsvToBean;
import au.com.bytecode.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import ru.smart_soft.csv_parser.model.Event;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CsvToBeanUtil {
    private HeaderColumnNameTranslateMappingStrategy<Event> strategy;

    public CsvToBeanUtil() {
        Map<String, String> mapping = new HashMap<>() {
            {
                put("ssoid", "UserId");
                put("ts", "time");
                put("grp", "group");
                put("type", "type");
                put("subtype", "subtype");
                put("url", "url");
                put("orgid", "orgId");
                put("formid", "formid");
                put("code", "ltpa");
                put("ltpa", "code");
                put("sudirresponse", "sudirresponse");
                put("ymdh", "dateTime");
            }
        };
        strategy = new HeaderColumnNameTranslateMappingStrategy<>();
        strategy.setType(Event.class);
        strategy.setColumnMapping(mapping);
    }

    public List<Event> convertToBean(Reader file) {
        CSVReader csvReader = new CSVReader(file, ';');
        CsvToBean csvToBean = new CsvToBean();
        return csvToBean.parse(strategy, csvReader);
    }
}
