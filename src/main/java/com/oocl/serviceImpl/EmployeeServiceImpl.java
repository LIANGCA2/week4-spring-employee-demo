package com.oocl.serviceImpl;

import com.oocl.model.Employee;
import com.oocl.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(0,"小明",20,"男"));
        employeeList.add(new Employee(1,"小红",19,"女"));
        employeeList.add(new Employee(2,"小智",15,"男"));
        employeeList.add(new Employee(3,"小刚",16,"男"));
        employeeList.add(new Employee(4,"小霞",15,"女"));

        return employeeList;
    }
}
