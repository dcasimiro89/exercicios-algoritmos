package passo04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {

    private  char genero;
    private int idade;

    public Pessoa() {}

    public Pessoa(char genero, int idade) {
        this.genero = genero;
        this.idade = idade;
    }

    public char getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }

    public static void main(String[] args) {
        int qtdHomem = 0;
        int qtdMulher = 0;
        int qtdMulherAcima20Anos = 0;
        double totalIdadeGrupo = 0;
        double totalIdadeHomem = 0;
        double mediaGrupo;
        double mediaHomem;
        Scanner sc = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<>();
        int i = 0;

        while (i < 5){
            System.out.print("Digite o seu gênero [m/f] => ");
            char genero = sc.next().charAt(0);
            System.out.print("Digite a sua idade => ");
            int idade = sc.nextInt();
            lista.add(new Pessoa(genero, idade));
            i++;
        }

        i = 0;
        while (i < 5) {
            if (lista.get(i).getGenero() == 'm') {
                totalIdadeHomem += lista.get(i).getIdade();
                qtdHomem++;
            } else if (lista.get(i).getGenero() == 'f') {
                qtdMulher++;
            }

            if (lista.get(i).getGenero() == 'f' && lista.get(i).getIdade() > 20){
                qtdMulherAcima20Anos++;
            }

            totalIdadeGrupo += lista.get(i).getIdade();
            i++;
        }

        mediaGrupo = totalIdadeGrupo / lista.size();
        mediaHomem = totalIdadeHomem / qtdHomem;

        System.out.println();
        System.out.println("Quantidade de homens cadastrados: " + qtdHomem);
        System.out.println("Quantidade de mulheres cadastradas: " + qtdMulher);
        System.out.println("Média de idade do grupo: " + mediaGrupo);
        System.out.println("Média idade dos homens: " + mediaHomem);
        System.out.println("Mulheres acima de 20 anos: " + qtdMulherAcima20Anos);
    }
}
