package net.argius.myapp.services;

import org.springframework.stereotype.Component;

@Component("minus")
public final class MyCalcComponentMinusImp implements MyCalcComponent {

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }

}
