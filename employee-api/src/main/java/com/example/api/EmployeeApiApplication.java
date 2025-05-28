// employee-api/src/main/java/com/example/api/EmployeeApiApplication.java
package com.example.api;

import com.example.model.Employee;
import com.example.service.EmployeeService;

public class EmployeeApiApplication {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 1001);
        EmployeeService service = new EmployeeService();
        service.printEmployee(emp);
    }
}

