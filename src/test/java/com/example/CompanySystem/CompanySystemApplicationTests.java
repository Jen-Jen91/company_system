package com.example.CompanySystem;

import com.example.CompanySystem.models.Department;
import com.example.CompanySystem.models.Employee;
import com.example.CompanySystem.models.Project;
import com.example.CompanySystem.repositories.DepartmentRepository;
import com.example.CompanySystem.repositories.EmployeeRepository;
import com.example.CompanySystem.repositories.ProjectRepository;
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

	@Autowired
	ProjectRepository projectRepository;


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

	@Test
	public void addEmployeesAndProjects() {
		Department department = new Department("HR");
		departmentRepository.save(department);

		Employee employee = new Employee("Monica", "Mateiu", 2, department);
		employeeRepository.save(employee);

		Project project = new Project("Company System", 3);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);
	}

}
