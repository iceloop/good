package com.example.demo.check;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EvaluatorConfiguration {
    @Bean
    public ConditionEvaluator bEvaluator() {
        return new BConditionEvaluator();
    }

    @Bean
    public ConditionEvaluator aEvaluator() {
        return new AConditionEvaluator();
    }

    @Bean
    public ConditionEvaluator cEvaluator() {
        return new CConditionEvaluator();
    }

    @Bean
    public ConditionEvaluator dEvaluator() {
        return new DConditionEvaluator();
    }
}

