package passo08;

import java.util.Scanner;

public class Ex77 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];
        nomes[0] = "Deivison";
        nomes[1] = "Rose";
        nomes[2] = "Geraldo";


        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nomes: " + nomes[i]);
        }
        System.out.println();
        System.out.println("Ordem inversa");
        /*
            Motivo do i ser igual a nomes.lenght - 1, pois o último índice
            do array nomes é 2
         */
        for (int i = nomes.length-1; i >= 0 ; i--) {
            System.out.println("Nomes em ordem reversa ["+(i+1)+"]: " + nomes[i]);
        }

        
    }
}
