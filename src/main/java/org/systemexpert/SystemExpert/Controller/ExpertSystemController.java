package org.systemexpert.SystemExpert.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.systemexpert.SystemExpert.DTO.DecisionRequest;
import org.systemexpert.SystemExpert.DTO.DecisionResponse;
import org.systemexpert.SystemExpert.Services.ExpertSystemConfig;

@RestController
public class ExpertSystemController {
    @Autowired
    ExpertSystemConfig expertSystemConfig;

    @PostMapping("/calculateDecision")
    public DecisionResponse calculateDecision(@RequestBody DecisionRequest decisionRequest){
        return new DecisionResponse(expertSystemConfig.calculateDecision(decisionRequest));
    }
}
