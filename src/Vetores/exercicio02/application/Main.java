package Vetores.exercicio02.application;

import Vetores.exercicio02.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("How many people are going to be entered?");
        int numberOffPeople = sc.nextInt();

        Person[] vect = new Person[numberOffPeople];

        for (int i = 0; i < numberOffPeople; i++) {
            System.out.println("Data for the " + (i + 1) + "st/nd/rd/th person:");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Height: ");
            double height = sc.nextDouble();

            vect[i] = new Person(name, age, height);
        }
        // Calculating the average height
        System.out.println();
        double totalHeight = 0.0;
        for (int i = 0; i < numberOffPeople; i++) {
            totalHeight += vect[i].getHeight();
        }
        double average = totalHeight / numberOffPeople;
        System.out.printf("Height average: %.2f%n", average);

        // Calculating the percentage of people under 16 years old
        int under16Count = 0;
        for (int i = 0; i < numberOffPeople; i++) {
            if (vect[i].getAge() < 16) {
                under16Count++;
            }
        }

        double percentageUnder16Count = ((double) under16Count / numberOffPeople) * 100;
        System.out.printf("People under 16 years old: %.1f%%%n", percentageUnder16Count);

        // Listing the names of peoples under 16 years old
        for (int i = 0; i < numberOffPeople; i++) {
            if (vect[i].getAge() <16 ){
                System.out.println(vect[i].getName());
            }


        }

        sc.close();
    }
}



