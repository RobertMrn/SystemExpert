package org.systemexpert.SystemExpert.Services;

import org.springframework.stereotype.Service;
import org.systemexpert.SystemExpert.DTO.DecisionRequest;

import java.math.BigDecimal;

@Service
public class ExpertSystemConfig {
    public String calculateDecision(DecisionRequest decisionRequest) {
        BigDecimal score = decisionRequest.getScore();
        int customerAge = decisionRequest.getCustomerAge();
        double loanDuration = decisionRequest.getLoanDuration() / 12;
        BigDecimal monthlyRate = BigDecimal.valueOf(decisionRequest.getMonthlyRate());
        BigDecimal income = decisionRequest.getIncome();

        if (score.compareTo(BigDecimal.valueOf(500)) >= 0 && score.compareTo(BigDecimal.valueOf(900)) <= 0) {
            if ((customerAge + loanDuration) <= 70) {
                if (monthlyRate.compareTo(income.multiply(BigDecimal.valueOf(0.25))) <= 0) {
                    return "GREEN";
                }
            }
        }

        if ((customerAge + loanDuration) < 75) {
            if (monthlyRate.compareTo(income.multiply(BigDecimal.valueOf(0.4))) <= 0) {
                if ((score.compareTo(BigDecimal.valueOf(300))) >= 0 && score.compareTo(BigDecimal.valueOf(900)) <= 0) {
                    return "YELLOW";
                }
            }
        }
        return "RED";
    }
}
