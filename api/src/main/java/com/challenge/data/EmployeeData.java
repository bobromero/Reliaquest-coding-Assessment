package main.java.com.challenge.data;

import com.challenge.api.model.Employee;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmployeeData {
    public List<Employee> employees;

    private List<Employee> CreateEmployees() {
        MyEmployee emp1info = new MyEmployee.Builder()
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
        MyEmployee emp2info = new MyEmployee.Builder()
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
        MyEmployee emp3info = new MyEmployee.Builder()
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
        ArrayList list = new ArrayList<Employee>();
        list.add(emp1info);
        list.add(emp2info);
        list.add(emp3info);
        return list;
    }

    public EmployeeData() {
        this.employees = CreateEmployees();
    }

    public Employee CreateEmployee(Employee employeeInfo) {
        MyEmployee emp = new MyEmployee.Builder()
                .Age(employeeInfo.getAge())
                        .ContractHireDate(employeeInfo.getContractHireDate())
                        .ContractTerminationDate(employeeInfo.getContractTerminationDate())
                        .Email(employeeInfo.getEmail())
                        .FirstName(employeeInfo.getFirstName())
                        .FullName(employeeInfo.getFullName())
                        .JobTitle(employeeInfo.getJobTitle())
                        .LastName(employeeInfo.getLastName())
                        .Salary(employeeInfo.getSalary())
                        .Uuid(employeeInfo.getUuid())
                        .build();
        if (emp.Uuid == null) {
            return emp;
        }
        this.employees.add(emp);
        return emp;
    }
}
