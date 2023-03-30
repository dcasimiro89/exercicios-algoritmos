package passo03;

import java.util.Random;
import java.util.Scanner;

public class Ex32_Desafio {

    public static void main(String[] args) {

        int tentativas = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        while(true){
            int numeroPc = random.nextInt(6);
            System.out.println("\n\nDIGITE UM NÚMERO MAIOR QUE [5] PARA SAIR DO SISTEMA!");
            System.out.print("Adivinha qual o número entre 1 a 5, o PC escolheu? => ");
            int numeroEscolhido = sc.nextInt();

            if (numeroEscolhido > 5) {
                System.out.println("Saindo do sistema...");
                System.exit(0);

//                System.out.print("Deseja continuar tentando? [s/n] => ");
//                char resposta = sc.next().charAt(0);
//
//                if (resposta == 'n') {
//                    System.exit(0);
//                }
            } else if (numeroEscolhido == numeroPc){
                System.out.println("Parabéns! Você acertou! o número que o PC escolheu é o " + numeroPc);
                System.out.println("Tentou " + tentativas + "x");
                System.exit(0);
            } else {
                System.out.print("Errou! Número escolhido foi o " + numeroPc + ".");
                tentativas++;
            }
        }
    }
}
