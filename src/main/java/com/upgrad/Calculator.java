package com.upgrad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private AdditionService additionService;
    private SubtractionService subtractionService;
    private MultiplicationService multiplicationService;
    private DivisionService divisionService;

    @Autowired
    public Calculator(@Qualifier("additionService") AdditionService additionService,
                      @Qualifier("subtractionService") SubtractionService subtractionService,
                      @Qualifier("multiplicationService") MultiplicationService multiplicationService,
                      @Qualifier("divisionService") DivisionService divisionService) {
        this.additionService = additionService;
        this.subtractionService = subtractionService;
        this.multiplicationService = multiplicationService;
        this.divisionService = divisionService;
    }

    public void compute(String opr, int x, int y)
    {
        switch (opr)
        {
            case "add":
            {
                additionService.operate(x,y);
                break;
            }
            case "subtract":
            {
                subtractionService.operate(x,y);
                break;
            }
            case "multiply":
            {
                multiplicationService.operate(x,y);
                break;
            }
            case "divide":
            {
                divisionService.operate(x,y);
                break;

            }
            default:
            {
                throw new RuntimeException("No such operation exist called " + opr);
            }
        }
    }
}
