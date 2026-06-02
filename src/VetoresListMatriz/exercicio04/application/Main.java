package VetoresListMatriz.exercicio04.application;

import VetoresListMatriz.exercicio04.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> listEmployee = new ArrayList<>();
        System.out.println("How many employee will be registered?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee: #" + (i + 1));
            System.out.println("ID: ");
            Integer id = sc.nextInt();
            System.out.println("Name: ");
            sc.nextLine();
            String nameEmployee = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, nameEmployee, salary);
            listEmployee.add(emp);

        }

        System.out.println("Enter the employee id that will have salary increased?");
        int idIncreased = sc.nextInt();

        Integer pos = hasId(listEmployee, idIncreased);
        if (pos == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();

            listEmployee.get(pos).increasedSalary(percent);


            for (Employee emp : listEmployee) {
                System.out.println(emp);

            }
        }
        sc.close();
    }

    public static Integer hasId(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}