package main.java.com.challenge.api.services;

import com.challenge.api.model.Employee;

import main.java.com.challenge.data.EmployeeData;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServices {
    public List<Employee> getAllEmployees() {
        return Employee.EMPLOYEES; // would be sql statment querying the database
    }
    public Employee getEmployeeByUuid(UUID uuid) {
        List<Employee> employees = Employee.EMPLOYEES;// sql would be Select from where uuid = uuid
        Employee ret = null;
        for (Employee employee : employees) {
            if (employee.getUuid() == uuid) {
                ret = employee;
            }
        }
        return ret;
    }
}
