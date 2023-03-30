package entities;

import enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;
public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private List<HourContract> contracts = new ArrayList<>();
    private Department department;

    public Worker() {}

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void addRemove(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int month, int year){
        double sum = baseSalary;
        for (HourContract c : contracts) {
            if (month == c.getDate().getMonthValue() && year == c.getDate().getYear()) {
               sum += c.totalValue();
            }
        }
        return sum;
    }

//    @Override
//    public String toString() {
//        return "Name: " + name +
//                "Department: " + department.getNome() +
//                "Income for " + String.format("%.2f", income(month, year));
//    }
}
