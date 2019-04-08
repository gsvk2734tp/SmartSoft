package ru.smart_soft.csv_parser.web;

import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class AppErrorControllerTest extends AbstractControllerTest {

    @Test
    void testError() throws Exception {
        mockMvc.perform(get("/errorPage"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("errorPage"))
                .andExpect(forwardedUrl("/WEB-INF/JSP/errorPage.jsp"));
    }

    @Test
    void testNotFoundPage() throws Exception {
        mockMvc.perform(get("/notFoundPage"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
}
