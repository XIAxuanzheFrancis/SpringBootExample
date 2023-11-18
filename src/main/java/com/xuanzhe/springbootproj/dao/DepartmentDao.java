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

    departments.put(1,new Department(1,"Marketing Department"));
    departments.put(1,new Department(2,"Purchasing Department"));
    departments.put(1,new Department(3,"IT Department"));
    departments.put(1,new Department(4,"Operation Department"));
    departments.put(1,new Department(5,"Management Department"));
  }

  public Collection<Department> getDepartments(){
    return departments.values();
  }

  public Department getDepartmentById(Integer id){
    return departments.get(id);
  }
}
