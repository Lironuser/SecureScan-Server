package com.example.javaserverapi.dto;

import lombok.Data;

@Data
public class EmployeeVo {
    long id;
    long company_id;
    String employee_name;
    byte[] image;
}
