package com.zensar.rest;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.zensar.bean.Department;
import com.zensar.service.DepartmentService;



@RestController
public class DepartmentController {

@Autowired
DepartmentService service;


@PostMapping(value="/addDepartment")
public Department f1(@RequestBody Department department) {
return this.service.addDepartment(department);
}

@GetMapping(value="/departments")
public List<Department> f2(){
return this.service.getAllDeparments();
}

@DeleteMapping(value="/deleteDeparment")
public boolean f3(@RequestBody Department department) {
return this.service.removeDepartment(department);

}

@GetMapping(value="/departmentCount")
public int f4() {
return this.service.getDepartmentcount();
}



}