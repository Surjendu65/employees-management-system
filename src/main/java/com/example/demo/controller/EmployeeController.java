package com.example.demo.controller;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.vo.EmployeeVo;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping()
	public ResponseEntity<EmployeeVo> saveEmployee(@RequestBody EmployeeVo employeeVo){
		return new ResponseEntity<EmployeeVo>(employeeService.saveEmployee(employeeVo),HttpStatus.CREATED);
	}
	                        
	@GetMapping()
	/*public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();		
	}*/

	public ResponseEntity<List<EmployeeVo>> getAllEmployees(){
		return new ResponseEntity<List<EmployeeVo>>(employeeService.getAllEmployees(),HttpStatus.OK);
	}

	@GetMapping("{id}")
	public ResponseEntity<EmployeeVo> getEmployeeById(@PathVariable("id") long employeeId){
		return new ResponseEntity<EmployeeVo>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);
	}
	
	
	@PutMapping("{id}")
	public ResponseEntity<EmployeeVo> updateEmployee(@PathVariable("id")long id, @RequestBody EmployeeVo employee){
		return new ResponseEntity<EmployeeVo>(employeeService.updateEmployee(employee, id),HttpStatus.OK);	
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id")long id){
		//Delete the employee Data in DB
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("Deleting Employee Successfully!.", HttpStatus.OK);	
	}	 	
}
