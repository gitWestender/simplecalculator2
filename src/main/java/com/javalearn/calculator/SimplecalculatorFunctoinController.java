package com.javalearn.calculator;


import org.springframework.web.bind.annotation.*;

@RequestMapping("/calculator")
@RestController

public class SimplecalculatorFunctoinController {

    //test

    private final ISimplecalculatorService sService;

    public SimplecalculatorFunctoinController(ISimplecalculatorService iService) {
        this.sService = iService;
    }

    @GetMapping("/plus")
    public String addition(@RequestParam("num1") int num1,
                           @RequestParam("num2") int num2) {
        return sService.addition(num1, num2);
    }

    @GetMapping("/minus")
    public String subtraction(@RequestParam("num1") int num1,
                              @RequestParam("num2") int num2) {
        return sService.subtraction(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiplication(@RequestParam("num1") int num1,
                                 @RequestParam("num2") int num2) {
        return sService.multiplication(num1, num2);
    }

    @GetMapping("/divide")
    public String division(@RequestParam("num1") int num1,
                           @RequestParam("num2") int num2) {
        return sService.division(num1, num2);
    }
}
