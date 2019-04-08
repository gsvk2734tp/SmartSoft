package ru.smart_soft.csv_parser.web;

import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class RootControllerTest extends AbstractControllerTest {

    @Test
    void testRoot() throws Exception {
        mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("mainPage"))
                .andExpect(forwardedUrl("/WEB-INF/JSP/mainPage.jsp"));
    }

    @Test
    void testHome() throws Exception {
        mockMvc.perform(get("/mainPage"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("mainPage"))
                .andExpect(forwardedUrl("/WEB-INF/JSP/mainPage.jsp"));
    }
}
