package passo03;

import java.util.Scanner;

public class Ex31_Desafio {

    static class Pessoa {
        //JokenPo
        private String nome;
        private String escolha;
        private int jokenPo;

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

        public String getescolha() {
            return escolha;
        }

        public void setescolha(String escolha) {
            this.escolha = escolha;
        }

        public void placar(Pessoa pessoa) {
            // 0 = pedra / 1= papel / 2= tesoura
            if (jokenPo == 0) {
                escolha = "PEDRA";
            } else if (jokenPo == 1) {
                escolha = "PAPEL";
            } else {
                escolha = "TESOURA";
            }

            if (pessoa.getJokenPo() == 0) {
                pessoa.setescolha("PEDRA");
            } else if (pessoa.getJokenPo() == 1) {
                pessoa.setescolha("PAPEL");
            } else {
                pessoa.setescolha("TESOURA");
            }

            System.out.println("=======================");
            System.out.println(this.nome + " => " + escolha);
            System.out.println(pessoa.getNome() + " => " + pessoa.getescolha());
        }

        public void resultadoJokenPo(Pessoa pessoa) {

            placar(pessoa);

            if (getJokenPo() == 0) {
                if (pessoa.getJokenPo() == 0) {
                    System.out.println(this.nome + " e " + pessoa.getNome() + " empataram! Ambos jogaram PEDRA!");
                } else if (pessoa.getJokenPo() == 1) {
                    System.out.println(pessoa.getNome() + " venceu! PAPEL ganha de PEDRA.");
                } else {
                    System.out.println(this.nome + " venceu! PEDRA ganha de TESOURA.");
                }
            }
            if (getJokenPo() == 1) { // papel
                if (pessoa.getJokenPo() == 1) {
                    System.out.println(this.nome + " e " + pessoa.getNome() + " empataram! Ambos jogaram PAPEL!");
                } else if (pessoa.getJokenPo() == 0) {
                    System.out.println(this.nome + " venceu! PAPEL ganha de PEDRA.");
                } else {
                    System.out.println(pessoa.getNome() + " venceu! TESOURA ganha de PAPEL.");
                }
            }
            if (getJokenPo() == 2) {
                if (pessoa.getJokenPo() == 2) {
                    System.out.println(this.nome + " e " + pessoa.getNome() + " empataram! Ambos jogaram pedra!");
                } else if (pessoa.getJokenPo() == 0) {
                    System.out.println(pessoa.getNome() + " venceu! PEDRA ganha de TESOURA.");
                } else {
                    System.out.println(this.nome + " venceu! TESOURA ganha de PAPEL.");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//       System.out.print("Digite seu nome: ");
//        String nome = sc.next();
//        System.out.print("JokenPo [pedra = 0 | papel = 1 | tesoura = 3] => ");
//        int jokenPo = sc.nextInt();
//        Pessoa p1 = new Pessoa(nome, jokenPo);

//        System.out.print("Digite seu nome: ");
//        nome = sc.next();
//        System.out.print("JokenPo [pedra = 0 | papel = 1 | tesoura = 3] => ");
//        jokenPo = sc.nextInt();
//        Pessoa p2 = new Pessoa(nome, jokenPo);

        Pessoa p1 = new Pessoa("Deivison", 1);
        Pessoa p2 = new Pessoa("Rose", 1);

        p1.resultadoJokenPo(p2);
        sc.close();
    }
}
