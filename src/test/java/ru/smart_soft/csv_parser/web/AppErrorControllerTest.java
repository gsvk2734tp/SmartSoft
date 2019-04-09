package ru.smart_soft.csv_parser.web;

import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class AppErrorControllerTest extends AbstractControllerTest {

    @Test
    void testError() throws Exception {
        mockMvc.perform(get("/error"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("error"))
                .andExpect(forwardedUrl("/WEB-INF/JSP/error.jsp"));
    }

    @Test
    void testNotFoundPage() throws Exception {
        mockMvc.perform(get("/notFoundPage"))
                .andDo(print())
                .andExpect(status().is4xxClientError());
    }
}
