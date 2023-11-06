package ru.geekbrains.lesson3.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Worker("Игорь", 18000));
        employees.add(new Freelancer("Петр", 1500));
        employees.add(new Worker("Иван", 15000));

        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.calculateMonthlySalary());
        }
        System.out.println();

        // Сортировка массива сотрудников по месячной зарплате с использованием Comparable
        Collections.sort(employees);

        // Вывод отсортированного списка сотрудников
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.calculateMonthlySalary());
        }
    }
}