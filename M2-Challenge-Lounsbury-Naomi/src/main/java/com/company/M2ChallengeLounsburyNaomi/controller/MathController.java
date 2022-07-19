package com.company.M2ChallengeLounsburyNaomi.controller;
import com.company.M2ChallengeLounsburyNaomi.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
public class MathController {



    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution createAdd(@Valid @RequestBody MathSolution math) {

        math=new MathSolution(math.getOperand1(),math.getOperand2(), "add", math.getOperand1()+math.getOperand2());

        if(math.getOperand1()==0||math.getOperand2()==0){
            System.out.println("my operand is zero");
            throw new IllegalArgumentException("Please provide an integer for the operation");
        }
        if(math.equals("null")){
            throw new IllegalArgumentException("Please provide something that isn't null");
        }
        return math;
    }


    @RequestMapping(value = "/subtract", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution createSubtract(@Valid @RequestBody MathSolution math) {
        math=new MathSolution(math.getOperand1(),math.getOperand2(), "subtract", math.getOperand1()-math.getOperand2());
        if(math.getOperand1()==0||math.getOperand2()==0){
            throw new IllegalArgumentException("Please provide an integer for the operation");
        }

        return math;
    }


    @RequestMapping(value = "/multiply", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution createMultiply(@Valid @RequestBody MathSolution math) {
        math=new MathSolution(math.getOperand1(),math.getOperand2(), "multiply", math.getOperand1()*math.getOperand2());
        if(math.getOperand1()==0||math.getOperand2()==0){
            throw new IllegalArgumentException("Please provide an integer for the operation");
        }

        return math;
    }

    @RequestMapping(value = "/divide", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public MathSolution createDivide(@Valid @RequestBody MathSolution math) {
        math=new MathSolution(math.getOperand1(),math.getOperand2(), "divide", math.getOperand1()/math.getOperand2());
        if(math.getOperand1()==0||math.getOperand2()==0){
            throw new IllegalArgumentException("Please provide an integer for the operation");
        }
        return math;
    }
}