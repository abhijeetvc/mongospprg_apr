package com.spmongo.mongospprg.repository;

import com.spmongo.mongospprg.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepo extends MongoRepository<Department,String> {
}
