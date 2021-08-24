package com.example.pagination.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Worker")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Worker {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer age;

    private Integer mobileNumber;

    public Worker(String name,Integer age,Integer mobileNumber){
        this.name=name;
        this.age=age;
        this.mobileNumber=mobileNumber;
    }
}
