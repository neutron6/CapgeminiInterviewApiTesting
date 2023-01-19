package com.practice.controller;

import com.practice.model.Employee;
import com.practice.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v5")
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceImpl;

    @PostMapping("/savedata")
    public ResponseEntity<Employee> saveData(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeServiceImpl.saveData(employee));

    }

    @GetMapping("/getdata")
    public ResponseEntity<List<Employee>> getAllData() {

        return ResponseEntity.ok(employeeServiceImpl.getAllData());
    }

    @GetMapping("/getdatabyid/{empId}")
    public ResponseEntity<Optional<Employee>> getDataById(@PathVariable int empId) {
        return ResponseEntity.ok(employeeServiceImpl.getDataById(empId));

    }

    @GetMapping("/deletedata")
    public ResponseEntity<String> deleteData() {
        employeeServiceImpl.deleteData();
        return ResponseEntity.ok("Data Deleted Successfullu");
    }

    @PutMapping("/updatedata/{empId}")
    public ResponseEntity<Employee> updateData(@PathVariable int empId, @RequestBody Employee employee) {

        return ResponseEntity.ok(employeeServiceImpl.updateData(employee));
    }

    @GetMapping("/sortSalaryByDescendingOrder")
    public ResponseEntity<List<Employee>> sortSalaryByDescendingOrder() {
        return ResponseEntity.ok(employeeServiceImpl.sortSalaryByDescendingOrder());
    }
}
