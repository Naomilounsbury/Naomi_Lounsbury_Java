package com.company.M2ChallengeLounsburyNaomi.controller;


import com.company.M2ChallengeLounsburyNaomi.models.Month;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)
public class MonthControllerTest {



        @Autowired
        private MockMvc mockMvc;

        // ObjectMapper used to convert Java objects to JSON and vice versa
        private ObjectMapper mapper = new ObjectMapper();

        @Before
        public void setUp() throws JsonProcessingException {


        }
        @Test
        public void shouldReturnMonthWhenGivenNumber() throws Exception {
            Month month = new Month(2,"February");


            System.out.println(month);

            String inputJson = mapper.writeValueAsString(month);

            // ACT
            mockMvc.perform(get("/month/2"))

                    .andDo(print())
                    .andExpect(status().isOk())
                    .andExpect(content().string(inputJson));

        }
        @Test
    public void shouldReturnNotFoundForOutOfBounds() throws Exception{
            mockMvc.perform(get("/month/15"));

        }
}

