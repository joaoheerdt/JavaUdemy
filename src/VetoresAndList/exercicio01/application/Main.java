package VetoresAndList.exercicio01.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args0){

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers are you going to type?");
        int n = sc.nextInt();

        if ( n > 10) {
            System.out.println("Error: The number must be between 1 and 10.");
        }
        else {
            int[] vect = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter the number:");
                vect[i] = sc.nextInt();
            }

            System.out.println("Negative numbers:");
            for (int i = 0; i < n; i++) {
                if (vect[i] < 0)
                {
                    System.out.println(vect[i]);
                }
            }
            sc.close();
        }}}
