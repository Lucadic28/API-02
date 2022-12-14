package it.API2.controllers;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/factorial")
public class FactorialController {



    @GetMapping(value = "/{n}")
    public Integer factorial(@PathVariable Integer n){
        int i;
        int f = 1;

        for(i = 1; i <= n; i = i + 1) {
            f = f * i;
        }
        return f;
    }
}
