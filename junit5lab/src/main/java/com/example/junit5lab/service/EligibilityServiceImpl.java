package com.example.junit5lab.service;

import org.springframework.stereotype.Service;

@Service
public class EligibilityServiceImpl implements EligibilityService{

    @Override
    public String checkEligibility(int age, boolean employed, double income) {
        try {
            if (age < 18) {
                return "Not eligible - underage";
            } else if (age >= 18 && age <= 60) {
                if (employed && income > 20000) {
                    return "Eligible for credit";
                } else if (!employed && income > 50000) {
                    return "Eligible with conditions";
                } else {
                    return "Not eligible - low income or unemployed";
                }
            } else {
                return "Not eligible - overage";
            }
        } catch (Exception e) {
            return "Error in eligibility check: " + e.getMessage();
        }
    }
}
