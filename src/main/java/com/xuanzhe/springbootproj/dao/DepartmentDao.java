package com.xuanzhe.springbootproj.dao;

import com.xuanzhe.springbootproj.pojo.Department;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDao {
  private static Map<Integer, Department> departments = null;
  static {
    departments = new HashMap<Integer,Department>();

    departments.put(101,new Department(101,"Marketing Department"));
    departments.put(102,new Department(102,"Purchasing Department"));
    departments.put(103,new Department(103,"IT Department"));
    departments.put(104,new Department(104,"Operation Department"));
    departments.put(105,new Department(105,"Management Department"));
  }

  public Collection<Department> getDepartments(){
    return departments.values();
  }

  public Department getDepartmentById(Integer id){
    return departments.get(id);
  }
}
