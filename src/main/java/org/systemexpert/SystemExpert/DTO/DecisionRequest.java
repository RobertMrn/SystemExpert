package org.systemexpert.SystemExpert.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DecisionRequest {
    private BigDecimal score;
    private int customerAge;
    private double loanDuration;
    private double monthlyRate;
    private BigDecimal income;
}
