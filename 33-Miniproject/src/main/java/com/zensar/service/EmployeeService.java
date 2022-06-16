package com.zensar.service;



import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.zensar.bean.Employee;
import com.zensar.db.EmployeeDAO;



@Service
public class EmployeeService {



@Autowired
EmployeeDAO dao;

//addEmployee
public Employee addEmployee(Employee employee) {
return this.dao.save(employee);
}
//deleteEmployee
public boolean removeEmployee(Employee employee) {
dao.delete(employee);
return true;
}
//updateEmployee
public Employee updateEmployee (Employee employee) {
return this.dao.save(employee);
}
//getAllEmployee
public List<Employee> getAllEmployees() {
return this.dao.findAll();
}
//getByIdEmployee
public Employee getEmployeeById(int userid) {
Optional<Employee> optional = this.dao.findById(userid);
if(optional.isPresent())
return optional.get();
return null;
}
//countEmployee
public int getEmloyeeCount() {
return this.dao.findAll().size();
}
}