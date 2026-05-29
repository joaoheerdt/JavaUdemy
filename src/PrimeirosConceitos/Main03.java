
    void main () {


//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.


    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int numfuncionario = sc.nextInt();
    double horatrab = sc.nextDouble();
    double valor = sc.nextDouble();

        System.out.println("Numero do Funcionario: " + numfuncionario);
        System.out.printf("Salario: %.2f%n", horatrab * valor);




}
