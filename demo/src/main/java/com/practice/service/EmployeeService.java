package com.practice.service;

import com.practice.dao.EmployeeDao;
import com.practice.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDaoImpl;


    public Optional<Employee> getDataById(int empId) {
        return employeeDaoImpl.getDataById(empId);
    }

    public void deleteData() {
        employeeDaoImpl.deleteData();
    }

    public Employee updateData(Employee employee) {
        return employeeDaoImpl.updateData(employee);
    }

    public List<Employee> sortSalaryByDescendingOrder() {
        return employeeDaoImpl.sortSalaryByDescendingOrder();
    }

    public Employee saveData(Employee employee) {
        return employeeDaoImpl.saveData(employee);
    }

    public List<Employee> getAllData() {
        return employeeDaoImpl.getAllData();
    }
}
