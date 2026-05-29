package Poo.exercicio01.application;

import Poo.exercicio01.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args0) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and heigth:");

        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println("Area = " + rectangle.area());
        System.out.println("Perimeter = " + rectangle.perimeter());
        System.out.println("Diagonal = " + rectangle.diagonal());


    }

}
