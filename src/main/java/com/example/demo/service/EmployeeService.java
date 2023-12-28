package com.example.demo.service;
import java.util.List;
import com.example.demo.model.Employee;
import com.example.demo.vo.EmployeeVo;

public interface EmployeeService {
	EmployeeVo saveEmployee(EmployeeVo employeeVo);
	//List<Employee> getAllEmployees();
	List<EmployeeVo> getAllEmployees();
	EmployeeVo getEmployeeById(long id);
	EmployeeVo updateEmployee(EmployeeVo employeeVo, long id);
	EmployeeVo deleteEmployee(long id);
}
















