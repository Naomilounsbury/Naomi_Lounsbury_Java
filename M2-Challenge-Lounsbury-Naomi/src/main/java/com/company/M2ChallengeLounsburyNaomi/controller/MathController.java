package com.company.M2ChallengeLounsburyNaomi.controller;
import com.company.M2ChallengeLounsburyNaomi.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Float.NaN;

@RestController
public class MathController {
    private static List<MathSolution> mathList = new ArrayList<>(Arrays.asList(
            new MathSolution(10, 10, "add", 0),
            new MathSolution(5, 5, "subtract", 0),
            new MathSolution(10, 5, "multiply", 0),
            new MathSolution(20, 5, "divide", 0)

    ));

    //Add:
//URI: /add
//HTTP Method: POST
//Request Body: JSON object with operand1 and operand2
//Response Body: MathSolution, where answer is sum of operand1 and operand2
//Error: 422, if missing operand or if operands are not both numbers
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution createAdd(@Valid @RequestBody MathSolution math) {
        math.setAnswer();
        mathList.add(math);

        if(math.getOperand1()==NaN||math.getOperand2()==NaN) {
            throw new IllegalArgumentException("you suck, put in a number");
        }
        if(!math.getOperation().equalsIgnoreCase("add")){
            throw new IllegalArgumentException("That is not a proper value for operation");
        }
        return math;
    }

    //Subtract:
//URI: /subtract
//HTTP Method: POST
//Request Body: JSON object with operand1 and operand2
//Response Body: MathSolution, where answer is difference of operand1 and operand2 (operand1 – operand2)
//Error: 422, if missing operand or if operands are not both numbers
    @RequestMapping(value = "/subtract", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution createSubtract(@RequestBody @Valid MathSolution math) {
        math.setAnswer();
        mathList.add(math);
        if(math.getOperand1()==NaN) {
            throw new IllegalArgumentException("you suck, put in a number");
        }

        return math;
    }

    //Multiply:
//URI: /multiply
//HTTP Method: POST
//Request Body: JSON object with operand1 and operand2
//Response Body: MathSolution, where answer is product of operand1 and operand2
//Error: 422, if missing operand or if operands are not both numbers
//Divide:
    @RequestMapping(value = "/multiply", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution createMultiply(@Valid @RequestBody MathSolution math) {
        math.setAnswer();
        mathList.add(math);
        if(math.getOperand1()==NaN) {
            throw new IllegalArgumentException("you suck, put in a number");
        }

        return math;
    }

    //URI: /divide
//HTTP Method: POST
//Request Body: JSON object with operand1 and operand2
//Response Body: MathSolution, where answer is quotient of operand1 and operand2 (operand1/operand2)
//Error: 422, if missing operand or if operands are not both numbers, or if operand2 is zero
    @RequestMapping(value = "/divide", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution createDivide(@Valid @RequestBody MathSolution math) {
        math.setAnswer();
        mathList.add(math);
        if(math.getOperand1()==NaN||math.getOperand2()==NaN) {
            throw new IllegalArgumentException("you suck, put in a number");
        }
        if(!math.getOperation().equalsIgnoreCase("add")){
            throw new IllegalArgumentException("That is not a proper value for operation");
        }
        return math;
    }
}