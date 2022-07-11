package com.company.M2ChallengeLounsburyNaomi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.company.M2ChallengeLounsburyNaomi.models.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MonthController {
    private static List<Month> monthList = new ArrayList<>(Arrays.asList(
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
//    Month Converter:
//URI: /month/{monthNumber}
//HTTP Method: GET
//Request Body: None
//Response Body: A Month object containing the name and number of the requested month (1—January, 2—February, etc.)
//Error: 422, if the input is out of range

//Random Month:
//URI: /randomMonth
//HTTP Method: GET
//Request Body: None
//Response Body: A Month object containing a randomly selected month
}
