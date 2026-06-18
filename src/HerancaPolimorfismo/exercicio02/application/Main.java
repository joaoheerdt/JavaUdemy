package HerancaPolimorfismo.exercicio02.application;

import HerancaPolimorfismo.exercicio02.entities.CompanyTax;
import HerancaPolimorfismo.exercicio02.entities.IndividualTax;
import HerancaPolimorfismo.exercicio02.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        System.out.print("Enter the number of tax payers: ");
        int numberTaxPlayer = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numberTaxPlayer; i++) {
            System.out.println("TAX PLAYER #" + i + " :");
            System.out.print("Individual or company? | i/c: ");
            char typePlayer = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Enter the name: ");
            String namePlayer = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if (typePlayer == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new IndividualTax(namePlayer, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberEmployee = sc.nextInt();
                list.add(new CompanyTax(namePlayer, anualIncome, numberEmployee));
            }
            System.out.println();
        }

        System.out.println("TAXES PAID:");
        double totalTaxes = 0.0;

        for (TaxPayer c : list) {
            double tax = c.tax();
            System.out.println(c.getName() + ": $ " + String.format("%.2f", tax));
            totalTaxes += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));

        sc.close();
    }
}