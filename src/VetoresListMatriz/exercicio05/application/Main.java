package VetoresListMatriz.exercicio05.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows and columns: ");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] mat = new int[row][column];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.print("Enter the number to search (X): ");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");

                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}