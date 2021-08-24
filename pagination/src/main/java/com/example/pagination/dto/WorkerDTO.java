package com.example.pagination.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkerDTO {
    private  Integer id;
    private  String name;
    private Integer age;
    private Integer mobileNumber;
}
