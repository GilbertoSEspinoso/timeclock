package com.dio.timeclock.repository;

import com.dio.timeclock.model.Workday;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkdayRepository extends JpaRepository<Workday, Long> {
}
