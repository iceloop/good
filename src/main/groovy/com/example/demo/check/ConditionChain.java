package com.example.demo.check;

import java.util.List;
import java.util.Optional;

public class ConditionChain {
    private List<ConditionEvaluator> evaluators;

    public ConditionChain(List<ConditionEvaluator> evaluators) {
        this.evaluators = evaluators;
    }

    public Optional<String> evaluate(String key) {
        for (ConditionEvaluator evaluator : evaluators) {
            Optional<String> result = evaluator.evaluate(key);
            if (result.isPresent()) {
                return result;
            }
        }
        return Optional.empty();
    }
}

