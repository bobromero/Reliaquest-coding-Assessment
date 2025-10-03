package main.java.com.challenge.data;

import java.time.Instant;
import java.util.UUID;

public class EmployeeInfo {
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

    private EmployeeInfo(Builder builder) {
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

        public EmployeeInfo build() {
            return new EmployeeInfo(this);
        }
    }
}
