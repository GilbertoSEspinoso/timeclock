package com.dio.timeclock.controller;

import com.dio.timeclock.model.Workday;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/workday")
public class WorkdayController {


    @PostMapping
    public Workday createWorkday(){
        return null;
    }
}
