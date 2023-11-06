package ru.geekbrains.lesson3.hw;

public abstract class Employee implements Comparable<Employee>{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateMonthlySalary();

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return Double.compare(otherEmployee.calculateMonthlySalary(), this.calculateMonthlySalary());
    }
}