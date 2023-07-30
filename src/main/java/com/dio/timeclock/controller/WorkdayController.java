package com.dio.timeclock.controller;

import com.dio.timeclock.model.Workday;
import com.dio.timeclock.service.WorkdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/workday")
public class WorkdayController {
    WorkdayService service;

    @Autowired
    public WorkdayController(WorkdayService service) {
        this.service = service;
    }


    @PostMapping
    public Workday insert(@RequestBody Workday workday) {
        return service.save(workday);
    }

    @GetMapping
    public List<Workday> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Workday> findById(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(service.findById(id).orElseThrow(() -> new Exception("workday not found.")));
    }
}
