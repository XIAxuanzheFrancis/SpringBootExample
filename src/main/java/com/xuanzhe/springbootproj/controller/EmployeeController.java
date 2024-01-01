package com.xuanzhe.springbootproj.controller;

import com.xuanzhe.springbootproj.dao.EmployeeDao;
import com.xuanzhe.springbootproj.pojo.Employee;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
  @Autowired
  EmployeeDao employeeDao;
  @RequestMapping("/emps")
  public String list(Model model){
    Collection<Employee> employees = employeeDao.getAll();
    model.addAttribute("emps",employees);
    return "emp/list";
  }
}
