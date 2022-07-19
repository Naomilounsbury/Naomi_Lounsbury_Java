package com.company.M2ChallengeLounsburyNaomi.controller;

import static org.junit.Assert.*;

import com.company.M2ChallengeLounsburyNaomi.models.MathSolution;
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

import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MathController.class)
public class MathControllerTest {
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
    public void shouldReturn422StatusCodeWithInvalidRequestBodyForAdd()throws Exception{
            // ARRANGE
            MathSolution math = new MathSolution();
            math.setOperand1(5);
            math.setOperand2(8);


            // c
            String inputJson = mapper.writeValueAsString(math);

            // ACT
            mockMvc.perform(
                            post("/add")                                // Perform the POST request.
                                    .content(inputJson)                               // Set the request body.
                                    .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                    )
                    .andDo(print())                                           // Print results to console.
                    .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)

    }
    @Test
    public void shouldReturn422StatusCodeForInputTypeOfZeroAdd()throws Exception{
        // ARRANGE
//        Map<String, String> input=new HashMap<>();
//        input.put("operand1", "0");
//        input.put("operand2", "this is a string not a number");
//        input.put("answer", "");
        MathSolution math = new MathSolution();
        math.setOperand1(0);
        math.setOperand2(0);
        math.setOperation("add");
        math.setAnAnswer();

        // c
 String inputJson = mapper.writeValueAsString(math);

        // ACT
        this.mockMvc.perform(
                        post("/add")                                // Perform the POST request.
                                .content(inputJson)                               // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)

    }
    @Test
    public void shouldReturn422StatusCodeForInputTypeOfZeroSubtract()throws Exception{
        // ARRANGE
//        Map<String, String> input=new HashMap<>();
//        input.put("operand1", "0");
//        input.put("operand2", "this is a string not a number");
//        input.put("answer", "");
        MathSolution math = new MathSolution();
        math.setOperand1(0);
        math.setOperand2(0);
        math.setOperation("subtract");
        math.setAnAnswer();

        // c
        String inputJson = mapper.writeValueAsString(math);

        // ACT
        this.mockMvc.perform(
                        post("/subtract")                                // Perform the POST request.
                                .content(inputJson)                               // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)

    }
    @Test
    public void shouldReturn422StatusCodeForInputTypeOfZeroForMultiply()throws Exception{
        // ARRANGE
//        Map<String, String> input=new HashMap<>();
//        input.put("operand1", "0");
//        input.put("operand2", "this is a string not a number");
//        input.put("answer", "");
        MathSolution math = new MathSolution();
        math.setOperand1(0);
        math.setOperand2(0);
        math.setOperation("multiply");
        math.setAnAnswer();

        // c
        String inputJson = mapper.writeValueAsString(math);

        // ACT
        this.mockMvc.perform(
                        post("/multiply")                                // Perform the POST request.
                                .content(inputJson)                               // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)

    }
    @Test
    public void shouldReturn422StatusCodeForInputTypeOfZeroDivide()throws Exception{
        // ARRANGE
//        Map<String, String> input=new HashMap<>();
//        input.put("operand1", "0");
//        input.put("operand2", "this is a string not a number");
//        input.put("answer", "");
        MathSolution math = new MathSolution();
        math.setOperand1(0);
        math.setOperand2(0);
        math.setOperation("divide");


        // c
        String inputJson = mapper.writeValueAsString(math);

        // ACT
        this.mockMvc.perform(
                        post("/divide")                                // Perform the POST request.
                                .content(inputJson)                               // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)

    }
    @Test
    public void shouldReturnSum() throws Exception{
        // ARRANGE
        MathSolution math = new MathSolution();
        math.setOperand1(5);
        math.setOperand2(8);
        math.setOperation("add");
        math.setAnAnswer();



        String inputJson = mapper.writeValueAsString(math);

        // ACT
        mockMvc.perform(
                        post("/add")                                // Perform the POST request.
                                .content(inputJson)                               // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isCreated())
                .andExpect(content().json(inputJson));             // ASSERT (status code is 422)

    }
    @Test
    public void shouldReturnDifference() throws Exception{
        // ARRANGE
        MathSolution math = new MathSolution();
        math.setOperand1(5);
        math.setOperand2(8);
        math.setOperation("subtract");
        math.setAnAnswer();



        String inputJson = mapper.writeValueAsString(math);

        // ACT
        mockMvc.perform(
                        post("/subtract")                                // Perform the POST request.
                                .content(inputJson)                               // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isCreated())
                .andExpect(content().json(inputJson));             // ASSERT (status code is 422)

    }
    @Test
    public void shouldReturnMultiplication() throws Exception{
        // ARRANGE
        MathSolution math = new MathSolution();
        math.setOperand1(5);
        math.setOperand2(8);
        math.setOperation("multiply");
        math.setAnAnswer();

        String inputJson = mapper.writeValueAsString(math);

        // ACT
        mockMvc.perform(
                        post("/multiply")                                // Perform the POST request.
                                .content(inputJson)                               // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isCreated())
                .andExpect(content().json(inputJson));             // ASSERT (status code is 422)

    }
    @Test
    public void shouldReturnDivision() throws Exception{
        // ARRANGE
        MathSolution math = new MathSolution();
        math.setOperand1(16);
        math.setOperand2(8);
        math.setOperation("divide");
        math.setAnAnswer();


        String inputJson = mapper.writeValueAsString(math);

        // ACT
        mockMvc.perform(
                        post("/divide")                                // Perform the POST request.
                                .content(inputJson)                               // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isCreated())
                .andExpect(content().json(inputJson));             // ASSERT (status code is 422)

    }
    @Test
    public void shouldReturn422StatusCodeForStringInputs()throws Exception{
        // ARRANGE
        Map<String, String> input=new HashMap<>();
        input.put("operand1", "5");




        String inputJson = mapper.writeValueAsString(input);

        // ACT
        this.mockMvc.perform(
                        post("/add")                                // Perform the POST request.
                                .content(inputJson)                               // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)          // Tell the server it's in JSON format.
                )
                .andDo(print())                                           // Print results to console.
                .andExpect(status().isUnprocessableEntity());             // ASSERT (status code is 422)

    }



}