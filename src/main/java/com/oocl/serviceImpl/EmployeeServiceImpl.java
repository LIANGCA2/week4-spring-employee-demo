package com.oocl.serviceImpl;

import com.oocl.EmpolyeeApiApplication;
import com.oocl.model.Employee;
import com.oocl.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employeeList = EmpolyeeApiApplication.allEmployee();
    @Override
    public List<Employee> findAllEmployee() {
        return employeeList;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    @Override
    public  List<Employee> deleteEmployee(Integer id) {
        for(int i=0;i<employeeList.size();i++){
            if(employeeList.get(i).getId()==id){
                employeeList.remove(i);
                break;
            }
        }
        return employeeList;
    }

    @Override
    public List<Employee> updateEmployee(Integer id, Employee employee) {
        for(int i=0;i<employeeList.size();i++){
            if(employeeList.get(i).getId()==id){

                if (employee.getId()!=null){
                    employeeList.get(i).setId(employee.getId());
                }
                if (employee.getName()!=null){
                    employeeList.get(i).setName(employee.getName());
                }
                if (employee.getAge()!=null){
                    employeeList.get(i).setAge(employee.getAge());
                }
                if (employee.getGender()!=null){
                    employeeList.get(i).setGender(employee.getGender());
                }



                break;
            }
        }

        return employeeList;
    }
}
