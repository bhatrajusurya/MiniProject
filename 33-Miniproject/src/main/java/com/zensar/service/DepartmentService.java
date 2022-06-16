package com.zensar.service;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.zensar.bean.Department;
import com.zensar.db.DepartmentDAO;



@Service
public class DepartmentService {



@Autowired
DepartmentDAO departmentdao;



public Department addDepartment (Department department) {
return this.departmentdao.save(department);
}



public List<Department> getAllDeparments() {
return this.departmentdao.findAll();
}



public boolean removeDepartment(Department department) {
departmentdao.delete(department);
return true;
}



public int getDepartmentcount() {
return this.departmentdao.findAll().size();
}
}