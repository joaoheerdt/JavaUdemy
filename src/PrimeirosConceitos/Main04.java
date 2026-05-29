void main () {

    //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
    //mostre:
    //a) a área do triângulo retângulo que tem A por base e C por altura.
    //b) a área do círculo de raio C. (pi = 3.14159)
    //c) a área do trapézio que tem A e B por bases e C por altura.
    //d) a área do quadrado que tem lado B.
    //e) a área do retângulo que tem lados A e B.


    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double C = sc.nextDouble();


    System.out.printf("Area do triangulo retângulo: %.2f%n", (A * C) / 2);
    System.out.printf("Area do círculo: %.2f%n", Math.PI * C * C);
    System.out.printf("Area do trapézio: %.2f%n", ((A + B) * C) / 2);
    System.out.printf("Area do quadrado: %.2f%n", B * B);
    System.out.printf("Area do retângulo: %.2f%n", A * B);


}