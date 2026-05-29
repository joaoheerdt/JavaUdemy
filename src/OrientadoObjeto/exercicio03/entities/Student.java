package OrientadoObjeto.exercicio03.entities;

public class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double media() {
        return nota1 + nota2 + nota3;
    }

    public double pontosFaltantes() {
        if (media() < 60) {
            return media() - 60;}
        else {return 0.0;}

    }
}
