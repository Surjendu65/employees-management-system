package com.example.demo.repository;
import com.example.demo.model.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Employee;
import com.example.demo.vo.EmployeeVo;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	void save(EmployeeVo existingEmployee);
	
}
