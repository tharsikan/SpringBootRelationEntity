package com.db.jpademo2.service;

import com.db.jpademo2.model.Employee;
import com.db.jpademo2.model.Telephone;
import com.db.jpademo2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        for(Telephone telephone :employee.getTelephoneList()){
            telephone.setEmployee(employee);
        }
        return employeeRepository.save(employee);
    }
}