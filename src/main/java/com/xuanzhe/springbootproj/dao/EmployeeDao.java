package com.xuanzhe.springbootproj.dao;

import com.xuanzhe.springbootproj.pojo.Department;
import com.xuanzhe.springbootproj.pojo.Employee;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
  private static Map<Integer, Employee> employee = null;
  @Autowired
  private DepartmentDao departmentDao;
  static {
    employee = new HashMap<Integer,Employee>();

    employee.put(1,new Employee(1,"ABC","xiaxingba@gmail.com",1,new Department(1,"Marketing Department")));
    employee.put(1,new Employee(2,"ABC","xiaxingba@gmail.com",1,new Department(1,"Marketing Department")));
    employee.put(1,new Employee(3,"ABC","xiaxingba@gmail.com",1,new Department(1,"Marketing Department")));
    employee.put(1,new Employee(4,"ABC","xiaxingba@gmail.com",1,new Department(1,"Marketing Department")));
    employee.put(1,new Employee(5,"ABC","xiaxingba@gmail.com",1,new Department(1,"Marketing Department")));
  }
/*
  public Collection<Department> getDepartments(){
    return departments.values();
  }

  public Department getDepartmentById(Integer id){
    return departments.get(id);
  }*/
}
