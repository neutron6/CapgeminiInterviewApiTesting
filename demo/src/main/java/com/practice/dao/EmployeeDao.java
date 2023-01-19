package com.practice.dao;

import com.practice.model.Employee;
import com.practice.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class EmployeeDao {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    public Optional<Employee> getDataById(int empId) {
        return employeeRepoImpl.findById(empId);

    }

    public void deleteData() {
        employeeRepoImpl.deleteAll();
    }

    public Employee updateData(Employee employee) {
        return employeeRepoImpl.save(employee);
    }

    public List<Employee> sortSalaryByDescendingOrder() {
        return employeeRepoImpl.findAll().stream().sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed().thenComparing(Employee::getEmpName)).collect(Collectors.toList());
    }

    public Employee saveData(Employee employee) {
        return employeeRepoImpl.save(employee);
    }

    public List<Employee> getAllData() {
        return employeeRepoImpl.findAll();
    }
}
