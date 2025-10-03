package main.java.com.challenge.data;

import com.challenge.api.model.Employee;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmployeeData {
    public List<Employee> employees;

    private List<Employee> CreateEmployees() {
        EmployeeInfo emp1info = new EmployeeInfo.Builder()
                .Age(21)
                        .ContractHireDate(Instant.ofEpochSecond(1759430448))
                        .ContractTerminationDate(null)
                        .Email("rob@mail.com")
                        .FirstName("Robert")
                        .FullName("Robert John Romero")
                        .JobTitle("Associate Software Engineer")
                        .LastName("Romero")
                        .Salary(9999999)
                        .Uuid(UUID.fromString("5db5fd6b-c4bb-4815-8ec9-6e43eb32e0c2"))
                        .build();
        EmployeeInfo emp2info = new EmployeeInfo.Builder()
                .Age(31)
                        .ContractHireDate(Instant.ofEpochSecond(1759130448))
                        .ContractTerminationDate(null)
                        .Email("Bryan@mail.com")
                        .FirstName("Bryan")
                        .FullName("Bryan Smith")
                        .JobTitle("Lead Software Engineer")
                        .LastName("Smith")
                        .Salary(99999999)
                        .Uuid(UUID.fromString("ba6aca01-fd6d-44ce-9885-2e3d5003967f"))
                        .build();
        EmployeeInfo emp3info = new EmployeeInfo.Builder()
                .Age(37)
                        .ContractHireDate(Instant.ofEpochSecond(1758433448))
                        .ContractTerminationDate(null)
                        .Email("TheDon@mail.com")
                        .FirstName("Donald")
                        .FullName("Donald Forrest")
                        .JobTitle("Sales Representative")
                        .LastName("Forrest")
                        .Salary(270000)
                        .Uuid(UUID.fromString("fd7c9b93-cc1d-4bda-a74c-1e26549b4797"))
                        .build();
        EmployeesRUsEmployee emp1 = new EmployeesRUsEmployee(emp1info);
        EmployeesRUsEmployee emp2 = new EmployeesRUsEmployee(emp2info);
        EmployeesRUsEmployee emp3 = new EmployeesRUsEmployee(emp3info);
        ArrayList list = new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        return list;
    }

    public EmployeeData() {
        this.employees = CreateEmployees();
    }

    public Employee CreateEmployee(EmployeeInfo info) {
        Employee emp = new EmployeesRUsEmployee(info);
        this.employees.add(new EmployeesRUsEmployee(info));
        return emp;
    }
}
