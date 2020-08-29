package com.company;

public class Admin extends Employee{
    protected int vacationDays;

    public Admin(String name, String cpr, int hours, double salary, int vacationDays) {
        super(name, cpr, hours, salary);
        this.salary = 23000;
        this.vacationDays = 5;
        this.hours = 37;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "vacationDays=" + vacationDays +
                ", hours=" + hours +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", cpr='" + cpr + '\'' +
                '}';
    }
    @Override
    public String addString() {
        return name+" "+cpr+" "+hours+" "+salary+" "+vacationDays;
    }
}
