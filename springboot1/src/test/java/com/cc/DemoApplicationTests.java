/*
package com.cc;

import com.cc.controller.RestController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class DemoApplicationTests {

    private MockMvc mvc;

    public void setUp() throws Exception{
        mvc = MockMvcBuilders.standaloneSetup(new RestController()).build();
    }

    @Test
    void contextLoads() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hi").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello World")));
    }

    private String equalTo(String hello_world) {
    }

}
*/
