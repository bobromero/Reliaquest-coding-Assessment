package main.java.com.challenge.data;

import com.challenge.api.model.Employee;
import java.time.Instant;
import java.util.UUID;

public class MyEmployee implements Employee {
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

    private MyEmployee(Builder builder) {
        this.Age = builder.Age;
        this.ContractHireDate = builder.ContractHireDate;
        this.ContractTerminationDate = builder.ContractTerminationDate;
        this.Email = builder.Email;
        this.FirstName = builder.FirstName;
        this.FullName = builder.FullName;
        this.JobTitle = builder.JobTitle;
        this.LastName = builder.LastName;
        this.Salary = builder.Salary;
        this.Uuid = builder.Uuid;
    }

    public MyEmployee() {}

    public MyEmployee(Employee emp) {
        this.Age = emp.getAge();
        this.ContractHireDate = emp.getContractHireDate();
        this.ContractTerminationDate = emp.getContractTerminationDate();
        this.Email = emp.getEmail();
        this.FirstName = emp.getFirstName();
        this.FullName = emp.getFullName();
        this.JobTitle = emp.getJobTitle();
        this.LastName = emp.getLastName();
        this.Salary = emp.getSalary();
        this.Uuid = emp.getUuid();
    }

    public static class Builder {
        public int Age;
        public Instant ContractHireDate;
        public Instant ContractTerminationDate;
        public String Email;
        public String FirstName;
        public String FullName;
        public String JobTitle;
        public String LastName;
        public int Salary;
        public UUID Uuid;

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

        public Builder Email(String Email) {
            this.Email = Email;
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

        public Builder Uuid(UUID Uuid) {
            this.Uuid = Uuid;
            return this;
        }

        public Builder Uuid(String Uuid) {
            this.Uuid = UUID.fromString(Uuid);
            return this;
        }

        public MyEmployee build() {
            return new MyEmployee(this);
        }
    }

    @Override
    public UUID getUuid() {
        return Uuid;
    }

    @Override
    public void setUuid(UUID uuid) {
        Uuid = uuid;
    }

    @Override
    public String getFirstName() {
        return FirstName;
    }

    @Override
    public void setFirstName(String name) {
        FirstName = name;
    }

    @Override
    public String getLastName() {
        return LastName;
    }

    @Override
    public void setLastName(String name) {
        LastName = name;
    }

    @Override
    public String getFullName() {
        return FullName;
    }

    @Override
    public void setFullName(String name) {
        FullName = name;
    }

    @Override
    public Integer getSalary() {
        return Salary;
    }

    @Override
    public void setSalary(Integer salary) {
        Salary = salary;
    }

    @Override
    public Integer getAge() {
        return Age;
    }

    @Override
    public void setAge(Integer age) {
        Age = age;
    }

    @Override
    public String getJobTitle() {
        return JobTitle;
    }

    @Override
    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public Instant getContractHireDate() {
        return ContractHireDate;
    }

    @Override
    public void setContractHireDate(Instant date) {
        ContractHireDate = date;
    }

    /**
     * Nullable.
     * @return null, if Employee has not been terminated.
     */
    @Override
    public Instant getContractTerminationDate() {
        return ContractTerminationDate;
    }

    @Override
    public void setContractTerminationDate(Instant date) {
        ContractTerminationDate = date;
    }
}
