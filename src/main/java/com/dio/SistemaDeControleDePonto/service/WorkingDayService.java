package com.dio.SistemaDeControleDePonto.service;

import com.dio.SistemaDeControleDePonto.model.WorkingDay;
import com.dio.SistemaDeControleDePonto.repository.WorkingDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkingDayService {

    @Autowired
    WorkingDayRepository workingDayRepository;

    @Autowired
    public WorkingDayService(WorkingDayRepository workingDayRepository) {
        this.workingDayRepository = workingDayRepository;
    }

    public WorkingDay saveWorkingDay(WorkingDay workingDay) {
        return workingDayRepository.save(workingDay);
    }

    public List<WorkingDay> findAll() {
        return workingDayRepository.findAll();
    }

    public Optional<WorkingDay> getById(Long idWorking) {
        return workingDayRepository.findById(idWorking);
    }

    public WorkingDay updateWorkingDay(WorkingDay workingDay) {
        return workingDayRepository.save(workingDay);
    }
    public void deleteWorkingDay(Long idWorking) {
        workingDayRepository.deleteById(idWorking);
    }
}
