package com.nest.nestApp_backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String homePage()
    {
        return ("Home Page");
    }

}
