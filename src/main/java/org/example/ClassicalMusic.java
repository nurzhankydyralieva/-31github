package org.example;

import org.springframework.stereotype.Component;

@Component("classicMusic")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Perfect Symphony";
    }

}
