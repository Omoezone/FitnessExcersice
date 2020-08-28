package com.company;

public class Admin extends Employee{
    int vacationDays;

    public Admin(String name, String cpr, int hours, double salary, int vacationDays) {
        super(name, cpr, hours, salary);
        this.vacationDays = vacationDays;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

}
