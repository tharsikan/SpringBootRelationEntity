package com.db.jpademo2.controller;

import com.db.jpademo2.model.Employee;
import com.db.jpademo2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value="/employee", method= RequestMethod.POST)
    public Employee saveEmployee(@RequestBody Employee employee){
        //System.out.println(employee.getName());
        //System.out.println(employee.getAddress().getCity());
        return employeeService.saveEmployee(employee);
    }

}
