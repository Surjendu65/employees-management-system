package com.example.demo.vo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeVo {
	@JsonProperty(value="emp_ID", required=true)
        private long emp_ID;

	@JsonProperty(value="fname", required=true)
	private String fname;

	@JsonProperty(value="lname", required=true)
	private String lname;

	@JsonProperty(value="gender", required=true)
	private String gender;

	@JsonProperty(value="age", required=true)
	private int age;

	@JsonProperty(value="contact_add", required=true)
	private int contact_add;
	
	@JsonProperty(value="emp_email", required=true)
	private String emp_email;

	@JsonProperty(value="emp_pass", required=true)
	private String emp_pass;
	
}









