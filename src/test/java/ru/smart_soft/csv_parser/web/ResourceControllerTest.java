package ru.smart_soft.csv_parser.web;

import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import ru.smart_soft.csv_parser.web.AbstractControllerTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class ResourceControllerTest extends AbstractControllerTest {

    @Test
    void testResourcesCss() throws Exception {
        mockMvc.perform(get("/resources/css/mainPage.css"))
                .andDo(print())
                .andExpect(content().contentType(MediaType.valueOf("text/css")))
                .andExpect(status().isOk());
    }

    @Test
    void testResourcesJS() throws Exception {
        mockMvc.perform(get("/resources/js/mainPage.js"))
                .andDo(print())
                .andExpect(content().contentType(MediaType.valueOf("application/javascript")))
                .andExpect(status().isOk());
    }

    @Test
    void testResourcesImages() throws Exception {
        mockMvc.perform(get("/resources/images/1.png"))
                .andExpect(content().contentType(MediaType.valueOf("image/png")))
                .andExpect(status().isOk());
    }

    @Test
    void testResourcesImagesError() throws Exception {
        mockMvc.perform(get("/resources/images/errorPage/404.svg"))
                .andExpect(content().contentType(MediaType.valueOf("image/svg+xml")))
                .andExpect(status().isOk());
    }

    @Test
    void testResourcesIco() throws Exception {
        mockMvc.perform(get("/resources/images/ico.png"))
                .andExpect(content().contentType(MediaType.valueOf("image/png")))
                .andExpect(status().isOk());
    }
}