package com.practice.greet;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
@Service

public class EmployeeService {
    List<Employee> EmployeeList = new ArrayList<>();
    public List<Employee> getEmployees() {
        Employee e1 = new Employee(12, "Upesh", "Pune");
        Employee e2 = new Employee(23, "vamsi", "hyd");
        EmployeeList.add(e1);
        EmployeeList.add(e2);
        return EmployeeList;
    }
    public Employee getEmployeeID(int id){
         return  EmployeeList.stream().filter(t->t.getName().equals(id)).findFirst().get();
    }
    public void addEmployee(Employee employee){
        EmployeeList.add(employee);
    }
    public void updateEmployee(int id,Employee employee){
        for(int i=0;i<EmployeeList.size();i++)
        {
          Employee e = EmployeeList.get(i);
          if(e.getId()==id){
             EmployeeList.set(i,employee);
             return;
          }
        }
    }
    public void deleteEmployee(int id){
        EmployeeList.removeIf(e->e.getId()==id);
    }
}




