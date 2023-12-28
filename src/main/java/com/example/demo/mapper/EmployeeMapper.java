package com.example.demo.mapper;
import org.springframework.stereotype.Service;
import com.example.demo.model.Employee;
import com.example.demo.vo.EmployeeVo;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeMapper {	
	public Employee toEmployee(EmployeeVo employeeVo) {
		Employee employee = new Employee();
		employee.setEmp_ID(employeeVo.getEmp_ID());
		employee.setFname(employeeVo.getFname());
		employee.setLname(employeeVo.getLname());
		employee.setGender(employeeVo.getGender());
		employee.setAge(employeeVo.getAge());
		employee.setContact_add(employeeVo.getContact_add());
		employee.setEmp_email(employeeVo.getEmp_email());
		employee.setEmp_pass(employeeVo.getEmp_pass());
		return  employee;
				
	}
	
	public EmployeeVo toEmployeeVo(Employee employee) {
		EmployeeVo employeeVo = new EmployeeVo();
		employeeVo.setEmp_ID(employee.getEmp_ID());
		employeeVo.setFname(employee.getFname());
		employeeVo.setLname(employee.getLname());
		employeeVo.setGender(employee.getGender());
		employeeVo.setAge(employee.getAge());
		employeeVo.setContact_add(employee.getContact_add());
		employeeVo.setEmp_email(employee.getEmp_email());
		employeeVo.setEmp_pass(employee.getEmp_pass());
		return employeeVo;
	}

	public List<EmployeeVo> toEmployeeVoList(List<Employee> employeeList) {
		List<EmployeeVo> employeeVoList = new ArrayList<>();
		employeeList.forEach(employee -> {
			EmployeeVo employeeVo = toEmployeeVo(employee);
			employeeVoList.add(employeeVo);
		});
		return employeeVoList;
	}
}
