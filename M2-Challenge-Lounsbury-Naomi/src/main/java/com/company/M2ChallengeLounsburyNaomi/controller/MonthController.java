package com.company.M2ChallengeLounsburyNaomi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.company.M2ChallengeLounsburyNaomi.exceptions.NotFoundException;
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
    @RequestMapping(value = "/month/{number}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Month getMonthById(@PathVariable int number) {
        Month foundMonth = null;

        for(Month month : monthList) {
            if(month.getNumber() == number) {
                foundMonth = month;
                break;
            }
        }

        if (foundMonth == null) {
            throw new NotFoundException("Month not found in database");
        }

        return foundMonth;
    }

}
