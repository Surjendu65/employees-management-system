package com.example.demo.model;
import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;
@Data
@Entity
@Table(name = "payroll")
public class Payroll {
    @Id
    @Column(name = "payroll_ID")
    private long payroll_ID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_ID", referencedColumnName = "emp_ID")
    private Employee emp_ID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "job_ID", referencedColumnName = "job_ID")
    private JobDepartment job_ID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "salary_Id", referencedColumnName = "salary_Id")
    private Salary salary_Id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "leave_ID", referencedColumnName = "leave_ID")
    private Leave leave_ID;

    @Column(name = "date")
    private Date date;

    @Column(name = "report")
    private Date report;

    @Column(name = "total_amount")
    private Date total_amount;

}











