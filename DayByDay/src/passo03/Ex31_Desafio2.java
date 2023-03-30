package passo03;

import java.util.Random;
import java.util.Scanner;

public class Ex31_Desafio2 {

    static class Pessoa {
        //JokenPo
        private String nome;
        private String escolha;
        private int jokenPo;

        public Pessoa() {
        }

        public Pessoa(String nome, int jokenPo) {
            this.nome = nome;
            this.jokenPo = jokenPo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getJokenPo() {
            return jokenPo;
        }

        public String getEscolha() {
            return escolha;
        }

        public void setEscolha(String escolha) {
            this.escolha = escolha;
        }

        public void placar(Pessoa p1, Pessoa p2) {
            // 0 = pedra / 1= papel / 2= tesoura
            if (p1.getJokenPo() == 0) {
                p1.setEscolha("PEDRA");
            } else if (p1.jokenPo == 1) {
                p1.setEscolha("PAPEL");
            } else {
                p1.setEscolha("TESOURA");
            }

            if (p2.getJokenPo() == 0) {
                p2.setEscolha("PEDRA");
            } else if (p2.getJokenPo() == 1) {
                p2.setEscolha("PAPEL");
            } else {
                p2.setEscolha("TESOURA");
            }

            System.out.println("================================================");
            System.out.println(p1.getNome() + " => " + p1.getEscolha());
            System.out.println(p2.getNome() + " => " + p2.getEscolha());
        }

        public void resultadoJokenPo(Pessoa p1, Pessoa p2) {

            placar(p1, p2);

            if (p1.getJokenPo() == 0) { // pedra
                if (p2.getJokenPo() == 0) {
                    System.out.println(p1.getNome() + " e " + p2.getNome() + " empataram! Ambos jogaram PEDRA!");
                } else if (p2.getJokenPo() == 1) {
                    System.out.println(p2.getNome() + " venceu! PAPEL ganha de PEDRA.");
                } else {
                    System.out.println(p1.getNome() + " venceu! PEDRA ganha de TESOURA.");
                }
            }
            if (p1.getJokenPo() == 1) { // papel
                if (p2.getJokenPo() == 1) {
                    System.out.println(p1.getNome() + " e " + p2.getNome() + " empataram! Ambos jogaram PAPEL!");
                } else if (p2.getJokenPo() == 0) {
                    System.out.println(p1.getNome() + " venceu! PAPEL ganha de PEDRA.");
                } else {
                    System.out.println(p2.getNome() + " venceu! TESOURA ganha de PAPEL.");
                }
            }
            if (p1.getJokenPo() == 2) { // tesoura
                if (p2.getJokenPo() == 2) {
                    System.out.println(p1.getJokenPo() + " e " + p2.getNome() + " empataram! Ambos jogaram pedra!");
                } else if (p2.getJokenPo() == 0) {
                    System.out.println(p2.getNome() + " venceu! PEDRA ganha de TESOURA.");
                } else {
                    System.out.println(p1.getNome() + " venceu! TESOURA ganha de PAPEL.");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        while (true) {
            System.out.print("Digite seu nome: ");
            String nome = sc.next();
            //System.out.print("JokenPo [pedra = 0 | papel = 1 | tesoura = 2] => ");
            int jokenPo = r.nextInt(3);
            Pessoa p1 = new Pessoa(nome, jokenPo);

            System.out.print("Digite seu nome: ");
            nome = sc.next();
            //System.out.print("JokenPo [pedra = 0 | papel = 1 | tesoura = 2] => ");
            jokenPo = r.nextInt(3);
            Pessoa p2 = new Pessoa(nome, jokenPo);

            Pessoa analise = new Pessoa();
            analise.resultadoJokenPo(p1, p2);

            System.out.print("Deseja continuar jogando? [s/n] => ");
            char resposta = sc.next().charAt(0);

            if (resposta == 'n') {
                System.exit(0);
            }
        }

        // Pessoa a = new Pessoa(); porque não funciona criar objeto após criar uma repetição
    }
}
