package com.example.demo.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="emp_ID")
	private long emp_ID;
	
	@Column(name ="fname")
	private String fname;

	@Column(name ="lname")
	private String lname;

	@Column(name = "gender")
	private String gender;

	@Column(name ="age")
	private int age;

	@Column(name ="contact_add")
	private int contact_add;

	@Column(name ="emp_email")
	private String emp_email;

	@Column(name = "emp_pass")
	private String emp_pass;

}
