package com.example.inps;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
@RequiredArgsConstructor
class InpsApplicationTests {

    @Autowired MockMvc mockMvc;

    @Test
    void getSalary() throws Exception {
        ResultActions perform = mockMvc.perform(MockMvcRequestBuilders.get("/api/inps/getSalary?pinfl=21a"));
        String response = perform.andReturn().getResponse().getContentAsString();
        System.out.println("Response ------> " + response);
        Assertions.assertEquals(500,response);
    }

}
