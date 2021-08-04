package com.dio.SistemaDeControleDePonto.controller;

import com.dio.SistemaDeControleDePonto.model.WorkingDay;
import com.dio.SistemaDeControleDePonto.service.WorkingDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/working")
public class WorkingDayController {

    @Autowired
    WorkingDayService workingDayService;

    @PostMapping
    public WorkingDay createWorkingDay(@RequestBody WorkingDay workingDay) {
        return workingDayService.saveWorkingDay(workingDay);
    }

    @GetMapping
    public List<WorkingDay> getWorkingDayList() {
        return workingDayService.findAll();
    }

    @GetMapping("/{idWorking}")
    public ResponseEntity<WorkingDay> getWorkingDayListById(@PathVariable("idWorking") Long idWorking) throws Exception {
        return ResponseEntity.ok(workingDayService.getById(idWorking).orElseThrow(() -> new NoSuchElementException("Working day not found!")));
    }

    @PutMapping
    public WorkingDay updateWorkingDay(@RequestBody WorkingDay workingDay) {
        return workingDayService.updateWorkingDay(workingDay);
    }

    @DeleteMapping("/{idWorking}")
    public ResponseEntity<WorkingDay> deleteWorkingDayListById(@PathVariable("idWorking") Long idWorking) throws Exception {
        try {
            workingDayService.deleteWorkingDay(idWorking);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkingDay>) ResponseEntity.ok();
    }
}
