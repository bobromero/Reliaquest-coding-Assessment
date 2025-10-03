package main.java.com.challenge.api.services;

import com.challenge.api.model.Employee;
import java.util.List;
import java.util.UUID;
import main.java.com.challenge.data.EmployeeData;

public class EmployeeServices {
    EmployeeData data = new EmployeeData();

    public List<Employee> getAllEmployees() {
        return data.employees; // would be sql statment querying the database
    }

    public Employee getEmployeeByUuid(UUID uuid) {
        // sql would be Select from where uuid = uuid
        for (Employee employee : data.employees) {
            if (employee.getUuid().equals(uuid)) {
                return employee;
            }
        }
        return null;
    }

    public Employee createEmployee(Employee info) {
        // adding logic in data layer because this would be an sql statement
        Employee emp = data.CreateEmployee(info);
        return emp;
    }
}
