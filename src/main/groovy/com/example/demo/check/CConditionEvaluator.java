package com.example.demo.check;

import java.util.Optional;

public class CConditionEvaluator implements ConditionEvaluator {
    @Override
    public Optional<String> evaluate(String key) {
        if ("C".equals(key)) {
            return Optional.of("Result from C");
        } else {
            return Optional.empty();
        }
    }
}