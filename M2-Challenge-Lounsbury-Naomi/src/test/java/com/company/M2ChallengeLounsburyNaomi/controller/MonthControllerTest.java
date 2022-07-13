package com.company.M2ChallengeLounsburyNaomi.controller;

import com.company.M2ChallengeLounsburyNaomi.models.MathSolution;
import com.company.M2ChallengeLounsburyNaomi.models.Month;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(MathController.class)
public class MonthControllerTest {



        @Autowired
        private MockMvc mockMvc;

        // ObjectMapper used to convert Java objects to JSON and vice versa
        private ObjectMapper mapper = new ObjectMapper();

        @Before
        public void setUp() throws JsonProcessingException {
            // This is the standard set up method that runs before each test. It's typically used for instantiating test
            // objects. We don't have to do anything special for mockMvc since it's Autowired. We will however be using
            // setUp() in the future.
        }
        @Test
        public void shouldReturnMonthWhenGivenNumber() throws Exception {
            Month month = new Month(2,"February");

            String inputJson = mapper.writeValueAsString(month);

            // ACT
            mockMvc.perform(get("/month/2")   )                             // Perform the POST request.
                                                           // Set the request body.
                                          // Tell the server it's in JSON format.

                    .andDo(print())                                           // Print results to console.
                    .andExpect(status().isOk())
                    .andExpect(content().string(inputJson));// ASSERT (status code is 422)

        }
        }

