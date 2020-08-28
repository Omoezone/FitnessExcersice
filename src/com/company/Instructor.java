package com.company;

public class Instructor extends Employee{
    public Instructor(String name, String cpr, int hours, double salary) {
        super(name, cpr, hours, salary);
        this.salary = this.hours*456;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "hours=" + hours +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", cpr='" + cpr + '\'' +
                '}';
    }
}
