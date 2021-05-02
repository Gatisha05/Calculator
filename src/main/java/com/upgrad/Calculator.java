package com.upgrad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private AdditionService additionService;

    public AdditionService getAdditionService() {
        return additionService;
    }

    public void setAdditionService(AdditionService additionService) {
        this.additionService = additionService;
    }



    public void compute(String opr, int x, int y)
    {
        if (opr.equals("add"))
        {
            additionService.operate(x,y);
        }
        else
        {
            throw new RuntimeException("No such operation exist called " + opr);
        }
    }
}
