package com.company;

public class Employee extends Person {
    int hours;
    double salary;

    public Employee(String name, String cpr,int hours, double salary) {
        super(name, cpr);
        this.hours = hours;
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
