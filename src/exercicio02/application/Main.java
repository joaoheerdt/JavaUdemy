package exercicio02.application;

import exercicio02.entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main() {
        Locale.setDefault(Locale.US);
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario:");
        emp.nome = sc.nextLine();
        System.out.println("Digite o salario bruto: ");
        emp.salarioBruto = sc.nextDouble();
        System.out.println("Digite o imposto: ");
        emp.imposto = sc.nextDouble();

        System.out.println("Funcionario: " + emp.nome + "\nSalario liquido: " + emp.salarioLiquido());

        System.out.println("Qual o aumento do salario em porcentagem?");
        emp.porcentagem = sc.nextDouble();
        emp.aumento(emp.porcentagem);
        System.out.println(emp);

        sc.close();
    }
}
