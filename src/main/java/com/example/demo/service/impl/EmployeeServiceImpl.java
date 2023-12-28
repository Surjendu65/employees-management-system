package com.example.demo.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import com.example.demo.vo.EmployeeVo;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public EmployeeVo saveEmployee(EmployeeVo employeeVo) {
		Employee employee = employeeMapper.toEmployee(employeeVo);
		return employeeMapper.toEmployeeVo(employeeRepository.save(employee));			
	}
	
	@Override
	public List<EmployeeVo> getAllEmployees() {
		List<Employee> employeeList = employeeRepository.findAll();
		List<EmployeeVo> employeeVoList = employeeMapper.toEmployeeVoList(employeeList);
		return employeeVoList;

		//return employeeMapper.toEmployeeVoList(employeeRepository.findAll());
	}

	@Override
	public EmployeeVo getEmployeeById(long id) {
		
		/*
		 * Optional<Employee> employees = employeeRepository.findById(id);
		 * 
		 * if(employees.isPresent()) { return employees.get();
		 * 
		 * }else { throw new ResourceNotFoundException("Employee", "id", id); }
		 */
		Employee employee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("EmployeeVo", "id", id));
		return employeeMapper.toEmployeeVo(employee);
	}

	@Override
	public EmployeeVo updateEmployee(EmployeeVo employeeVo, long id) {
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "id", id));
		existingEmployee.setFname(employeeVo.getFname());
		existingEmployee.setEmp_email(employeeVo.getEmp_email());
		existingEmployee = employeeRepository.save(existingEmployee);
		return employeeMapper.toEmployeeVo(existingEmployee);
	}

	@Override
	public EmployeeVo deleteEmployee(long id) {
		Employee employee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("EmployeeVo", "id", id));

		EmployeeVo employeeVo = new EmployeeVo();
		employeeRepository.delete(employee);
		//employeeRepository.deleteById(employee.getId());
		//employeeRepository.deleteById(id);

		return employeeMapper.toEmployeeVo(employee);
	}
}



