package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class AppWorker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.print("Enter department's name: ");
        String department = sc.next();

        System.out.println("\nEnter worker data:");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.next());
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, level, baseSalary, new Department(department));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("\nEnter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate date = LocalDate.parse(sc.next(), dtf);
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(date, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getNome());
        System.out.println("Income for " + monthAndYear + ": " + nf.format(worker.income(month, year)));

        sc.close();
    }
}
