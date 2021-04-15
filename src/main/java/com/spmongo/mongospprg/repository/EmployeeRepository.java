package com.spmongo.mongospprg.repository;


import com.spmongo.mongospprg.model.EmployeeInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<EmployeeInfo,String> {
}
