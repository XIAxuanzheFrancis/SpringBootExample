package com.xuanzhe.springbootproj.controller;

import com.xuanzhe.springbootproj.dao.DepartmentDao;
import com.xuanzhe.springbootproj.dao.EmployeeDao;
import com.xuanzhe.springbootproj.pojo.Department;
import com.xuanzhe.springbootproj.pojo.Employee;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
  @Autowired
  EmployeeDao employeeDao;
  @Autowired
  DepartmentDao departmentDao;
  @RequestMapping("/emps")
  public String list(Model model){
    Collection<Employee> employees = employeeDao.getAll();
    model.addAttribute("emps",employees);
    return "emp/list";
  }

  @GetMapping("emp")
  public String ToAddpage(Model model){
    Collection<Department> departments = departmentDao.getDepartments();
    model.addAttribute("departments",departments);
    return "emp/add";
  }

  @PostMapping("/emp")
  public String addEmp(Employee employee){
    employeeDao.save(employee);
    return "redirect:/emps";
  }

  @GetMapping("/emp/{id}")
  public String toUpdateEmp(@PathVariable("id")Integer id, Model model){
    Employee employee = employeeDao.getEmployeeById(id);
    model.addAttribute("emp",employee);

    Collection<Department> departments = departmentDao.getDepartments();
    model.addAttribute("departments",departments);
    return "emp/update";
  }

  @PostMapping("/updateEmp")
  public String updateEmp(Employee employee){
    employeeDao.save(employee);
    return "redirect:/emps";
  }

  @GetMapping("/delemp/{id}")
  public String deleteEmp(@PathVariable("id")Integer id){
    employeeDao.delete(id);
    return "redirect:/emps";
  }
}
