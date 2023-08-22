package edu.eci.ieti.controller.health;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/{health}")
    public String get() {
        return "API working OK!";
    }
}