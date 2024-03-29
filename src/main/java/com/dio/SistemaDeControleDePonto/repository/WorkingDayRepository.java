package com.dio.SistemaDeControleDePonto.repository;

import com.dio.SistemaDeControleDePonto.model.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingDayRepository extends JpaRepository<WorkingDay, Long> {
}
