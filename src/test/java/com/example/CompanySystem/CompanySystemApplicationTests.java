package com.example.CompanySystem;

import com.example.CompanySystem.models.Department;
import com.example.CompanySystem.models.Employee;
import com.example.CompanySystem.repositories.DepartmentRepository;
import com.example.CompanySystem.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanySystemApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;


	@Test
	public void contextLoads() {
	}

	@Test
	public void createDepartmentAndEmployee() {
		Department department = new Department("IT");
		departmentRepository.save(department);

		Employee employee = new Employee("Jen", "Proctor", 1, department);
		employeeRepository.save(employee);
	}

}
