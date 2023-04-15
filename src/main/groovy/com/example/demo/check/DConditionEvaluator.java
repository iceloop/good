package com.example.demo.check;

import java.util.Optional;

public class DConditionEvaluator implements ConditionEvaluator {
    @Override
    public Optional<String> evaluate(String key) {
        if ("D".equals(key)) {
            return Optional.of("Result from D");
        } else {
            return Optional.empty();
        }
    }
}