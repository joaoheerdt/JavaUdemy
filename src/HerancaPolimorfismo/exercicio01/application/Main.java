package HerancaPolimorfismo.exercicio01.application;

import HerancaPolimorfismo.exercicio01.entities.ImportedProduct;
import HerancaPolimorfismo.exercicio01.entities.Product;
import HerancaPolimorfismo.exercicio01.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of product: ");
        int numberOfProduct = sc.nextInt();

        for (int i = 1; i <= numberOfProduct; i++) {
            System.out.println("Product #" + i + ":");
            System.out.print("Comum, used, imported | c/u/i: ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String nameProduct = sc.next();
            System.out.print("Price: ");
            double priceProduct = sc.nextDouble();

            if (type == 'c') {
                productList.add(new Product(nameProduct, priceProduct));
            } else if (type == 'u') {
                System.out.print("Date of fabrication | dd/mm/yyyy: ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                productList.add(new UsedProduct(nameProduct, priceProduct, date));
            }
            else  {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                productList.add(new ImportedProduct(nameProduct,priceProduct,customsFee));

            }
        }
        System.out.println();
        System.out.println("TAG PRICE:");
        for (Product prod : productList) {
            System.out.println(prod.toString());
        }


        sc.close();
    }
}
