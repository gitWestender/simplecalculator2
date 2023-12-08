package com.javalearn.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimplecalculatorWelcomeController {

    private final ISimplecalculatorService sService;

    public SimplecalculatorWelcomeController(ISimplecalculatorService iService) {
        this.sService = iService;
    }

    @GetMapping("/calculator")
    public String welcome() {
        return sService.welcome();
    }

}
