package main.java.com.challenge.data;

import com.challenge.api.model.Employee;
import java.time.Instant;
import java.util.UUID;

public class EmployeesRUsEmployee implements Employee {
    EmployeeInfo info;

    public EmployeesRUsEmployee(EmployeeInfo employeeInfo) {
        this.info = employeeInfo;
    }

    @Override
    public UUID getUuid() {
        return info.Uuid;
    }

    @Override
    public void setUuid(UUID uuid) {
        info.Uuid = uuid;
    }

    @Override
    public String getFirstName() {
        return info.FirstName;
    }

    @Override
    public void setFirstName(String name) {
        info.FirstName = name;
    }

    @Override
    public String getLastName() {
        return info.LastName;
    }

    @Override
    public void setLastName(String name) {
        info.LastName = name;
    }

    @Override
    public String getFullName() {
        return info.FullName;
    }

    @Override
    public void setFullName(String name) {
        info.FullName = name;
    }

    @Override
    public Integer getSalary() {
        return info.Salary;
    }

    @Override
    public void setSalary(Integer salary) {
        info.Salary = salary;
    }

    @Override
    public Integer getAge() {
        return info.Age;
    }

    @Override
    public void setAge(Integer age) {
        info.Age = age;
    }

    @Override
    public String getJobTitle() {
        return info.JobTitle;
    }

    @Override
    public void setJobTitle(String jobTitle) {
        info.JobTitle = jobTitle;
    }

    @Override
    public String getEmail() {
        return info.Email;
    }

    @Override
    public void setEmail(String email) {
        info.Email = email;
    }

    @Override
    public Instant getContractHireDate() {
        return info.ContractHireDate;
    }

    @Override
    public void setContractHireDate(Instant date) {
        info.ContractHireDate = date;
    }

    /**
     * Nullable.
     * @return null, if Employee has not been terminated.
     */
    @Override
    public Instant getContractTerminationDate() {
        return info.ContractTerminationDate;
    }

    @Override
    public void setContractTerminationDate(Instant date) {
        info.ContractTerminationDate = date;
    }
}
