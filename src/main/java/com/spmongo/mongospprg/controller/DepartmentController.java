package com.spmongo.mongospprg.controller;

import com.spmongo.mongospprg.model.Department;
import com.spmongo.mongospprg.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping("/savedept")
    public String saveDepartment(@RequestBody Department department){
        departmentRepo.save(department);
        return "Department saved";
    }
}
