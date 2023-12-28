package com.example.demo.model;
import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;
@Data
@Entity
@Table(name = "qualification")
public class Qualification {
    @Id
    @Column(name = "qual_ID")
    private long qual_ID;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_ID", referencedColumnName = "emp_ID")
    private Employee emp_ID;

    @Column(name = "position")
    private String position;

    @Column(name = "requirements")
    private String requirements;

    @Column(name = "date_in")
    private Date date_in;

}
