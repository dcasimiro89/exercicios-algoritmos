package passo08;

import java.util.Locale;
import java.util.Scanner;

public class Ex82 {

    public static void main(String[] args) {

        final double MEDIA = 7.0;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double[] nota = new double[10];

        double mediaTurma;
        double somaNota = 0.0;
        double maiorNota = 0d;
        int acimaDaMedia = 0;

        for (int i = 0; i < nota.length; i++) {
            System.out.print("nota["+(i)+"]: ");
            nota[i] = sc.nextDouble();
            somaNota += nota[i];

            if (nota[i] > MEDIA) {
                acimaDaMedia++;
            }
        }
        mediaTurma = somaNota / nota.length;
        System.out.printf("Qual é a média da turma: %.1f", mediaTurma);
        System.out.print("\nQuantos alunos estão acima da média da turma: " + acimaDaMedia);

        for (int i = 0; i < nota.length; i++) {
            if (nota[i] > maiorNota) {
                maiorNota = nota[i];
            }
        }
        System.out.print("\nQual foi a maior nota digitada: " + maiorNota);

        maiorNota = 0.0;
        System.out.print("\nEm que posições a maior nota aparece: ");
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] > maiorNota) {
                maiorNota = nota[i];
                System.out.print("["+i+"]" + " ");
            }
        }
    }
}
