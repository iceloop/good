package com.example.demo.check;

import java.util.Optional;

public class BConditionEvaluator implements ConditionEvaluator {
    @Override
    public Optional<String> evaluate(String key) {
        if ("B".equals(key)) {
            return Optional.of("Result from B");
        } else {
            return Optional.empty();
        }
    }
}