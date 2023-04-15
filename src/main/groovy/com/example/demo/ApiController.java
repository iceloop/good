package com.example.demo;

import com.example.demo.check.ConditionChain;
import com.example.demo.check.ConditionEvaluator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ApiController {
    private final ConditionChain conditionChain;

    public ApiController(List<ConditionEvaluator> evaluators) {
        this.conditionChain = new ConditionChain(evaluators);
    }

    @GetMapping("/api")
    public ResponseEntity<String> handleRequest(@RequestParam("key") String key) {
        Optional<String> result = conditionChain.evaluate(key);
        if (result.isPresent()) {
            return ResponseEntity.ok(result.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No result found");
    }
}

