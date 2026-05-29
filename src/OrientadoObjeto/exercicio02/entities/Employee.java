package OrientadoObjeto.exercicio02.entities;

public class Employee {

    public String nome;
    public double salarioBruto;
    public double imposto;
    public double porcentagem;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumento(double porcentagem) {
        salarioBruto += porcentagem / 100 * salarioBruto;
    }

    public String toString() {
        return nome + ", $ " + String.format("%.2f", salarioLiquido());
    }
}
