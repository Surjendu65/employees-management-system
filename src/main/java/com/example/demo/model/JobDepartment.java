package com.example.demo.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "job_department")
public class JobDepartment {
    @Id
    @Column(name = "job_ID")
    private long job_ID;

    @Column(name = "job_dept")
    private String job_dept;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "salary_range")
    private long salary_range;

}
