package org.softwaretechnologies.employee;

import java.time.LocalDate;
import java.time.YearMonth;

public class Manager extends Employee{

    public Manager(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public int getMonthSalary(int month) {
        return (month%2==0)?this.baseSalary:this.baseSalary/2;
    }
}
