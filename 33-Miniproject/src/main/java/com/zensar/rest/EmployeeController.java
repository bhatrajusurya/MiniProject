package com.zensar.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.bean.Employee;
import com.zensar.db.EmployeeDAO;
import com.zensar.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping(value = "/addEmployee")
	public Employee f1(@RequestBody Employee employee) {
	return this.service.addEmployee(employee);
	}

	@DeleteMapping(value = "/deleteEmployee")
	public boolean f2( @RequestBody Employee employee) {
		service.removeEmployee(employee);
		return true;
	}

	@PostMapping(value = "/updateEmployee")
	public Employee f3(@RequestBody Employee employee) {
		return this.service.updateEmployee(employee);
	}

	@GetMapping(value = "/allEmployees")
	public List<Employee> f4() {
		return this.service.getAllEmployees();
	}

	@GetMapping(value = "/employeeById")
	public Employee f5(int userid) {
		Optional<Employee> optional = Optional.ofNullable(this.service.getEmployeeById(userid));
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	@GetMapping(value = "/countEmployee")
	public int f6() {
		return this.service.getEmloyeeCount();
	}
}
