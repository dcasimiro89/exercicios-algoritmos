package passo09;

import java.util.Scanner;

public class Ex87 {

    public static void gerador(String mensagem) {
        System.out.println("+-------=======------+");
        System.out.println("\t" + mensagem);
        System.out.println("+-------=======------+");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma mensagem: ");
        String mensagem = sc.nextLine();

        gerador(mensagem);
    }
}
