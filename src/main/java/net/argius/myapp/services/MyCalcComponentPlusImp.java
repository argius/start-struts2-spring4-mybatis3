package net.argius.myapp.services;

import org.springframework.stereotype.Component;

@Component("plus")
public final class MyCalcComponentPlusImp implements MyCalcComponent {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }

}
