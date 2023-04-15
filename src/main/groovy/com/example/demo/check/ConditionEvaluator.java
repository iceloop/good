package com.example.demo.check;

import java.util.Optional;

public interface ConditionEvaluator {
    Optional<String> evaluate(String key);
}

