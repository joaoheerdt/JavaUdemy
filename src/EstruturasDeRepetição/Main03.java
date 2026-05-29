void main() {
    // Peça um numero ao usario e exiba todos os numeros pares de 1 ate esse numero for

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero = sc.nextInt();

    for (int i = 1; i <= numero; i++) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
    }

    sc.close();
}
