package com.company.M2ChallengeLounsburyNaomi.controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MathController {

//Add:
//URI: /add
//HTTP Method: POST
//Request Body: JSON object with operand1 and operand2
//Response Body: MathSolution, where answer is sum of operand1 and operand2
//Error: 422, if missing operand or if operands are not both numbers

//Subtract:
//URI: /subtract
//HTTP Method: POST
//Request Body: JSON object with operand1 and operand2
//Response Body: MathSolution, where answer is difference of operand1 and operand2 (operand1 – operand2)
//Error: 422, if missing operand or if operands are not both numbers

//Multiply:
//URI: /multiply
//HTTP Method: POST
//Request Body: JSON object with operand1 and operand2
//Response Body: MathSolution, where answer is product of operand1 and operand2
//Error: 422, if missing operand or if operands are not both numbers
//Divide:

//URI: /divide
//HTTP Method: POST
//Request Body: JSON object with operand1 and operand2
//Response Body: MathSolution, where answer is quotient of operand1 and operand2 (operand1/operand2)
//Error: 422, if missing operand or if operands are not both numbers, or if operand2 is zero
}