package ru.geekbrains.lesson3.hw;

public class Worker extends Employee {
    private double fixedMonthlySalary;

    public Worker(String name, double fixedMonthlySalary) {
        super(name);
        this.fixedMonthlySalary = fixedMonthlySalary;
    }

    @Override
    public double calculateMonthlySalary() {
        return fixedMonthlySalary;
    }
}