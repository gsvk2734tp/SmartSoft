package ru.smart_soft.csv_parser.web;

import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class FileLoadControllerTest extends AbstractControllerTest {

    @Test
    void uploadFile() throws Exception {
        //TODO
//        mockMvc.perform(MockMvcRequestBuilders.multipart("CSV/upload")
//                .file(new MockMultipartFile("data",
//                        "name.csv", "multipart/form-data", new byte[]{123, 123, 123}))
//                .param("file", "1"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(view().name("mainPage"))
//                .andExpect(forwardedUrl("/WEB-INF/JSP/mainPage.jsp"));
    }

    @Test
    void notFinished() throws Exception {
        mockMvc.perform(get("/CSV/notFinished"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("notFinish"))
                .andExpect(forwardedUrl("/WEB-INF/JSP/notFinish.jsp"));
    }

    @Test
    void report() throws Exception {
        mockMvc.perform(get("/CSV/report"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("lastHour"))
                .andExpect(forwardedUrl("/WEB-INF/JSP/lastHour.jsp"));
    }

    @Test
    void topFive() throws Exception {
        mockMvc.perform(get("/CSV/topFive"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("topFive"))
                .andExpect(forwardedUrl("/WEB-INF/JSP/topFive.jsp"));
    }
}