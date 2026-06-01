package Vetores.exercicio03.application;

import Vetores.exercicio03.entities.Guests;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Guests[] vect = new Guests[10];

        System.out.print("How many rooms will be rented? ");
        int numberOfRooms = sc.nextInt();

        // Loop para ler as informações de cada estudante
        for (int i = 1; i <= numberOfRooms; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room (0 to 9): ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Guests(name, email);
        }

        // Relatório final das ocupações
        System.out.println();
        System.out.println("Busy rooms:");

        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i].getGuest() + ", " + vect[i].getEmail());
            }
        }

        sc.close();
    }
}