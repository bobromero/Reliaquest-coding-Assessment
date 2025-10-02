package main.java.com.challenge.data;

import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import com.challenge.api.model.Employee;

public class EmployeeInformation{
    int age;
    Instant contractHireDate; 
    Instant ContractTerminationDate;
    String Email; 
    String FirstName;
    String FullName; 
    String JobTitle;
    String LastName;
    int Salary; 
    UUID Uuid;
    public static class Builder {
        int Age;
        Instant ContractHireDate; 
        Instant ContractTerminationDate;
        String Email; 
        String FirstName;
        String FullName; 
        String JobTitle;
        String LastName;
        int Salary; 
        UUID Uuid;
        public Builder Age(int Age) {
            this.Age = Age;
            return this;
        }
        public Builder ContractHireDate(Instant ContractHireDate) {
            this.ContractHireDate = ContractHireDate;
            return this;
        }
        public Builder ContractTerminationDate(Instant ContractTerminationDate) {
            this.ContractTerminationDate = ContractTerminationDate;
            return this;
        }
        public Builder Email(String email) {
            this.email = email;
            return this;
        }
        public Builder FirstName(String FirstName) {
            this.FirstName = FirstName;
            return this;
        }
        public Builder FullName(String FullName) {
            this.FullName = FullName;
            return this;
        }
        public Builder JobTitle(String JobTitle) {
            this.JobTitle = JobTitle;
            return this;
        }
        public Builder LastName(String LastName) {
            this.LastName = LastName;
            return this;
        }
        public Builder Salary(int Salary) {
            this.Salary = Salary;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

public class EmployeesRUsEmployee implements Employee{
    EmployeesRUsEmployee(EmployeeInformation employeeInfo){
        setAge(employeeInfo.age);
        setContractHireDate(employeeInfo.contractHireDate);
        setContractTerminationDate(employeeInfo.ContractTerminationDate);
        setEmail(employeeInfo.Email);
        setFirstName(employeeInfo.FirstName);
        setFullName(employeeInfo.FullName);
        setJobTitle(employeeInfo.JobTitle);
        setLastName(employeeInfo.LastName);
        setSalary(employeeInfo.Salary);
        setUuid(employeeInfo.Uuid);
    }
    
}

public class EmployeeData {
    public static List<Employee> EMPLOYEES;
    private void CreateEmployees(){
        EmployeeInformation emp1info = new EmployeeInformation.Builder()
            .Age(21)
            .ContractHireDate(Instant(1759430448))
            .ContractTerminationDate(null)
            .Email("rob@mail.com")
            .FirstName("Robert")
            .FullName("Robert John Romero")
            .JobTitle("Associate Software Engineer")
            .LastName("Romero")
            .Salary(9999999)
            .Uuid(new UUID());
        EmployeeInformation emp2info = new EmployeeInformation.Builder()
            .Age(31)
            .ContractHireDate(Instant(1759130448))
            .ContractTerminationDate(null)
            .Email("Bryan@mail.com")
            .FirstName("Bryan")
            .FullName("Bryan Smith")
            .JobTitle("Lead Software Engineer")
            .LastName("Smith")
            .Salary(99999999)
            .Uuid(new UUID());
        EmployeeInformation emp3info = new EmployeeInformation.Builder()
            .Age(37)
            .ContractHireDate(Instant(1758433448))
            .ContractTerminationDate(null)
            .Email("TheDon@mail.com")
            .FirstName("Donald")
            .FullName("Donald Forrest")
            .JobTitle("Sales Representative")
            .LastName("Forrest")
            .Salary(270000)
            .Uuid(new UUID());
        EmployeesRUsEmployee emp1 = new EmployeesRUsEmployee();
        EMPLOYEES.add();
    }
}
