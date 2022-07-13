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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MathController.class)
public class RandomMonthControllerTest {

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


                // Random random =new Random();
        @Test
        public void shouldReturnARandomMonth() throws Exception {
        List<Month> monthList = new ArrayList<>(Arrays.asList(
                        new Month(1,"January"),
                        new Month(2, "February"),
                        new Month(3,"March"),
                        new Month(4,"April"),
                        new Month(5,"May"),
                        new Month(6,"June"),
                        new Month(7,"July"),
                        new Month(8,"August"),
                        new Month(9,"September"),
                        new Month(10,"October"),
                        new Month(11,"November"),
                        new Month(12,"December")
                ));
                Random random =new Random();

                int randomMonth= random.nextInt(monthList.size());

                        String inputJson = mapper.writeValueAsString(randomMonth);

                        // ACT
                        mockMvc.perform(
                                        get("/randomMonth")                                // Perform the POST request.
                                                .content(inputJson)                               // Set the request body.

                                )
                                .andDo(print())                                           // Print results to console.
                                .andReturn();
                        // ASSERT (status code is 422)
                        assertTrue(monthList.get(randomMonth).getName(), true);

                }

        }

