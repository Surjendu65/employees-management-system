package com.example.demo.model;
import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;
@Data
@Entity
@Table(name = "leave")
public class Leave {
    @Id
    @Column(name = "leave_ID")
    private long leave_ID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_ID", referencedColumnName = "emp_ID")
    private Employee emp_ID;

    @Column(name = "date")
    private Date date;

    @Column(name = "reason")
    private String reason;
}




