package com.cognizantjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cognizantjpa.model.Employee;
import com.cognizantjpa.service.EmployeeService;

@SpringBootApplication
public class SpringDataJpa1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa1Application.class, args);

        EmployeeService employeeService = context.getBean(EmployeeService.class);

        Employee emp1 = new Employee();
        emp1.setEid(3);
        emp1.setEname("Rani");
        emp1.setSalary(10000);

        Employee emp2 = new Employee();
        emp2.setEid(4);
        emp2.setEname("Rahul");
        emp2.setSalary(5000);

        employeeService.addEmployee(emp1);
        employeeService.addEmployee(emp2);

        System.out.println("Employee 1: " + employeeService.getEmployee(3));
        System.out.println("Employee 2: " + employeeService.getEmployee(4));
    }
}
