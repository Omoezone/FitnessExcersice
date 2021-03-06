package com.company;

public class Employee extends Person {
    protected int hours;
    protected double salary;

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

    @Override
    public String toString() {
        return String.format("%-15s\t%-15s\t%-15d\t%-15.2f",name,cpr,hours,salary);
    }

}
