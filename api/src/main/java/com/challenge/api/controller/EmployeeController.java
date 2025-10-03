package com.challenge.api.controller;

import com.challenge.api.model.Employee;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import main.java.com.challenge.api.services.EmployeeServices;
import main.java.com.challenge.data.EmployeeInfo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 * Fill in the missing aspects of this Spring Web REST Controller. Don't forget to add a Service layer.
 */
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    EmployeeServices service = new EmployeeServices();
    /**
     * @implNote Need not be concerned with an actual persistence layer. Generate mock Employee models as necessary.
     * @return One or more Employees.
     */
    @GetMapping("/")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    /**
     * @implNote Need not be concerned with an actual persistence layer. Generate mock Employee model as necessary.
     * @param uuid Employee UUID
     * @return Requested Employee if exists
     */
    @GetMapping("/{uuid}")
    public Employee getEmployeeByUuid(@PathVariable UUID uuid) {
        if (uuid == null) {
            System.out.println("uuid is null");
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        System.out.println(uuid);
        Employee result = service.getEmployeeByUuid(uuid);
        if (result == null) {
            System.out.println("result is null");
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        return result;
    }

    /**
     * @implNote Need not be concerned with an actual persistence layer.
     * @param requestBody hint!
     * @return Newly created Employee
     */
    @PostMapping
    public Employee createEmployee(@RequestBody Object requestBody) {
        EmployeeInfo empinfo = new EmployeeInfo.Builder()
                .Age(37)
                        .ContractHireDate(Instant.ofEpochSecond(1758433448))
                        .ContractTerminationDate(null)
                        .Email("TheDon@mail.com")
                        .FirstName("Donald")
                        .FullName("Donald Forrest")
                        .JobTitle("Sales Representative")
                        .LastName("Forrest")
                        .Salary(270000)
                        .Uuid(UUID.randomUUID())
                        .build();
        throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
    }
}
