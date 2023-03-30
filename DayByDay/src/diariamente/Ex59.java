package diariamente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex59 {

    static class Pessoa {

        private char sexo;
        private int idade;

        public Pessoa() {}

        public Pessoa(char sexo, int idade) {
            this.sexo = sexo;
            this.idade = idade;
        }

        public char getSexo() {
            return sexo;
        }

        public int getIdade() {
            return idade;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        char answer;

        do {
            System.out.print("\nDigite o sexo (m / f) => ");
            char sexo = sc.next().charAt(0);
            System.out.print("Digite a idade => ");
            int idade = sc.nextInt();
            list.add(new Pessoa(sexo, idade));
            System.out.print("Deseja continuar? (s/n) => ");
            answer = sc.next().charAt(0);
        } while(answer == 's');

        System.out.println();
        int maiorIdade = 0;
        for (Pessoa pessoa : list) {
            if (maiorIdade < pessoa.getIdade()){
                maiorIdade = pessoa.getIdade();
            }
        }
        System.out.print("\nQual é a maior idade lida: " + maiorIdade);

        System.out.println();
        int quantidadeHomem = 0;
        int somaIdade = 0;
        for (Pessoa pessoa : list) {
            if (pessoa.getSexo() == 'm'){
                quantidadeHomem++;
                somaIdade += pessoa.getIdade();
            }
        }
        System.out.println("\nQuantos homens foram cadastrados: " + quantidadeHomem);

        System.out.println();
        int mulherJovem = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(i).getSexo() == 'm') {
                    if (list.get(i).getIdade() < list.get(j).getIdade()) {
                        mulherJovem = list.get(i).getIdade();
                    }
                }
            }
        }
        System.out.println("Qual é a idade da mulher mais jovem: " + mulherJovem);

        System.out.println();
        int mediaIdadeHomem = somaIdade / quantidadeHomem;
        System.out.println("Qual é a média de idade entre os homens: " + mediaIdadeHomem);
    }
}
