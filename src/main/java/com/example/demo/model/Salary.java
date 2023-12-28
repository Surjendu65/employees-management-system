package com.example.demo.model;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "salary")
public class Salary {
    @Id
    @Column(name = "salary_Id")
    private long salary_Id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "job_ID", referencedColumnName = "job_ID")
    private JobDepartment job_ID;

    @Column(name = "amount")
    private long amount;

    @Column(name = "annual")
    private long annual;

    @Column(name = "bonus")
    private long bonus;
}
