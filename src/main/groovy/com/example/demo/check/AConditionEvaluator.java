package com.example.demo.check;

import java.util.Optional;

public class AConditionEvaluator implements ConditionEvaluator {
    @Override
    public Optional<String> evaluate(String key) {
        if ("A".equals(key)) {
            return Optional.of("Result from A");
        } else {
            return Optional.empty();
        }
    }
}
