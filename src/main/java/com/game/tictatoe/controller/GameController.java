package com.game.tictatoe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @GetMapping("/")
    public String sayHi(){
        return "Hello world";
    }
}
