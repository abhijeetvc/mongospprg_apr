package com.spmongo.mongospprg.controller;

import com.spmongo.mongospprg.model.EmployeeInfo;
import com.spmongo.mongospprg.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/save")
    public String saveEmp(@RequestBody EmployeeInfo employee){
        employeeRepository.save(employee);
        return "Employee saved";
    }

    @GetMapping("/getallemployees")
    public List<EmployeeInfo> getEmployeeList(){
        return employeeRepository.findAll();
    }

    @GetMapping("/getemp/{id}")
    public Optional<EmployeeInfo> getEmployee(@PathVariable String id){
        return employeeRepository.findById(id);
    }
}
