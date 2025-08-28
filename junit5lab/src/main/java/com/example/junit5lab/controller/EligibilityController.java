package com.example.junit5lab.controller;

import com.example.junit5lab.service.EligibilityService;
import com.example.junit5lab.service.EligibilityServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/eligibility")
public class EligibilityController {
    private final EligibilityService eligibilityService;

    public EligibilityController(EligibilityService eligibilityService) {
        this.eligibilityService = eligibilityService;
    }

    @GetMapping("/check")
    public String check(@RequestParam int age,
                        @RequestParam boolean employed,
                        @RequestParam double income) {
        return eligibilityService.checkEligibility(age, employed, income);
    }
}

