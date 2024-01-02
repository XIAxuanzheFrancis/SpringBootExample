package com.xuanzhe.springbootproj.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@NoArgsConstructor
public class Employee {
  private Integer id;
  private String lastName;
  private String Email;
  private Integer gender;//0->man 1->woman
  private Department department;
  @DateTimeFormat(pattern = "yyyy/MM/dd HH/mm/ss")
  private Date birth;

  public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
    this.id = id;
    this.lastName = lastName;
    Email = email;
    this.gender = gender;
    this.department = department;
    this.birth = new Date();
  }
}
