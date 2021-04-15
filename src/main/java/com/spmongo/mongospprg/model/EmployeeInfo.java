package com.spmongo.mongospprg.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Getter
@Setter
public class EmployeeInfo {

    @Id
    private String id;
    private String name;
    private String city;
    private List<String> emails;

    private List<Address> address;

    @DBRef
    private Department department;
}
