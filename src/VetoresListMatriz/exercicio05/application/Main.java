package VetoresListMatriz.exercicio05.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Array size, row and column");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] mat = new int[row][column];

        System.out.println("Enter the numbers: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                mat[i][j] = sc.nextInt();
        }

        System.out.println("Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();


            sc.close();
        }
    }
}
