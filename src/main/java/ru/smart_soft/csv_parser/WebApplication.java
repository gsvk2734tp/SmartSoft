package ru.smart_soft.csv_parser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:spring/spring-db.xml", "classpath*:spring/spring-app.xml","classpath*:spring/spring-mvc.xml"})
public class WebApplication {

    private static Logger logger = LoggerFactory.getLogger(WebApplication.class);

    public static void main(String... args) throws Exception {
        SpringApplication.run(WebApplication.class, args);
        logger.info("Application started...");
    }
}