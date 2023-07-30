package com.dio.timeclock.service;

import com.dio.timeclock.model.Workday;
import com.dio.timeclock.repository.WorkdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkdayService {
    WorkdayRepository repository;

    @Autowired
    public WorkdayService(WorkdayRepository repository) {
        this.repository = repository;
    }

    public Workday save(Workday workday) {
        return repository.save(workday);
    }

    public List<Workday> findAll() {
        return repository.findAll();
    }

    public Optional<Workday> findById(Long id) {
        return  repository.findById(id);

    }
}
