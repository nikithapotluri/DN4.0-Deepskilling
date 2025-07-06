package com.cognizantjpa.empjpa;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class EmployeeJPA {

    private int eid;
    private String ename;
    private int salary;

    public EmployeeJPA() {}

    @Id
    @Column(name = "eid")
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Column(name = "ename")
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Column(name = "salary")
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeJPA [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
    }
}
