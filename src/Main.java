import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Employee name
        System.out.print("Insert employee name: ");
        var employeeName = sc.nextLine();

        // Employee Age
        System.out.print("Insert employee age: ");
        var employeeAge = Integer.parseInt(sc.nextLine());

        //Employee Salary
        System.out.print("Insert employee salary: ");
        var employeeSalary = Float.parseFloat(sc.nextLine());

        //Boss departament
        System.out.print("Is it boss departament? (true / false): ");
        var bossDepartament = Boolean.parseBoolean(sc.nextLine());

        //Print employee information

        System.out.println("\n***** Employee information *****");
        System.out.println("\tEmployee name: " +employeeName);
        System.out.println("\tEmployee age: " +employeeAge);
        System.out.println("\tEmployee salary: " +employeeSalary);
        System.out.println("\tBoss departament: " +bossDepartament);
    }
}