package ru.smart_soft.csv_parser;

import ru.smart_soft.csv_parser.service.Utils.CsvToBeanUtil;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CsvToBeanUtil converter = new CsvToBeanUtil();
        converter.convertToBean(new FileReader("D:\\test_case.csv"))
                .forEach(System.out::println);
    }
}
