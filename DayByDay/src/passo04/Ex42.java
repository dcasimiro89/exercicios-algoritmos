package passo04;

import java.util.Scanner;

public class Ex42 {

    public static void main(String[] args) {

        int i = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor => ");
        int numero = sc.nextInt();

        System.out.print("Contagem: ");
        while(i <= numero){
            System.out.print(i + " ");
            i++;
        }
        System.out.print("Acabou!");
    }
}
