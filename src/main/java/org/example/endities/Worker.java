package org.example.endities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HoursContract> contracts = new ArrayList<>();


    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;

    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HoursContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR) ;
            int c_month = 1 + cal.get(Calendar.MONTH);

            if (year == c_year && month == c_month) {
                sum += c.totalValue();

            }
        }
        return sum;
    }

    public void addContract(HoursContract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(HoursContract contract) {
        this.contracts.remove(contract);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public List<HoursContract> getContracts() {
        return contracts;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }
}
