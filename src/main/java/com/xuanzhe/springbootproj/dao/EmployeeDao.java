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

  private static Map<Integer, Employee> employees = null;
  @Autowired
  private DepartmentDao departmentDao;

  static {
    employees = new HashMap<Integer, Employee>();

    employees.put(1001, new Employee(1001, "ABC", "xiaxingba@gmail.com", 1,
        new Department(101, "Marketing Department")));
    employees.put(1002, new Employee(1002, "ABC", "xiaxingba@gmail.com", 1,
        new Department(102, "Marketing Department")));
    employees.put(1003, new Employee(1003, "ABC", "xiaxingba@gmail.com", 1,
        new Department(103, "Marketing Department")));
    employees.put(1004, new Employee(1004, "ABC", "xiaxingba@gmail.com", 1,
        new Department(104, "Marketing Department")));
    employees.put(1005, new Employee(1005, "ABC", "xiaxingba@gmail.com", 1,
        new Department(105, "Marketing Department")));
  }

  private static Integer initId = 6;
   public void save(Employee employee){
     if(employee.getId()==null){
       employee.setId(initId++);
     }
     employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
    employees.put(employee.getId(),employee);
   }

   public Collection<Employee> getAll(){
     return employees.values();
   }

   public Employee getEmployeeById(Integer id){
     return employees.get(id);
   }

   public void delete(Integer id){
     employees.remove(id);
   }
}
