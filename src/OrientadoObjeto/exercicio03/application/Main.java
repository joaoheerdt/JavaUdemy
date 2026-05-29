package OrientadoObjeto.exercicio03.application;

import OrientadoObjeto.exercicio03.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Student est = new Student();
        Locale.setDefault(Locale.US);


        System.out.println("Digite o nome do aluno:");
        est.nome = sc.nextLine();
        do {
            System.out.println("Digite a nota 1");
            est.nota1 = sc.nextDouble();
            if (est.nota1 > 30) {
                System.out.println("Nota invalida! Nota maxima 30.");
            }
        } while (est.nota1 > 30);

        do {
            {
                System.out.println("Digite a nota 2");
            }
            est.nota2 = sc.nextDouble();
            if (est.nota2 > 35) {
                System.out.println("Nota invalida! Nota maxima 35.");

            }

        } while (est.nota2 > 35);

        do {
            {
                System.out.println("Digite a nota 3");
            }
            est.nota3 = sc.nextDouble();
            if (est.nota3 > 35) {
                System.out.println("Nota invalida! Nota maxima 35.");
            }

        } while (est.nota3 > 35);
        sc.close();

        if (est.media() < 60) {
            System.out.println("Aluno: " + est.nome + "\n" + "Falhou \n" + "Faltou:" + est.pontosFaltantes() + " pontos");
        } else {
            System.out.println( est.nome + " passou com " + est.media()  );
        }
    }
}
