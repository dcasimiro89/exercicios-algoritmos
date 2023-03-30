package escola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetodosEscola {

    static Scanner sc = new Scanner(System.in);
    static List<Turma> listaTurma = new ArrayList<>();

    static public void menu() {
        System.out.println();
        System.out.println("[1] Adicionar Turma");
        System.out.println("[2] Pesquisar Turma");
        System.out.println("[3] Lista das Turmas");
        System.out.println("[4] Adicionar Aluno em uma Turma");
        System.out.println("[5] Sair");
        System.out.print("=> ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                adicionarTurma();
                break;
            case 2:
                pesquisarTurma();
                break;
            case 3:
                imprimirListaTurma();
                break;
            case 4:
                adicionarAlunosEmUmaTurma();
                break;
            case 5:
                System.out.println("Saindo do sistema!");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inexistente! Escolha entre 1 a 4");
                menu();
                break;
        }
    }


    static public void adicionarTurma() {
        System.out.println("Nome da Turma: ");
        String nomeTurma = sc.next();
        Turma turma = new Turma(nomeTurma);

        adicionarAlunos(turma);
    }

    static public void adicionarAlunos(Turma turma) {
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.next();
        System.out.print("Digite a idade do aluno: ");
        int idade = sc.nextInt();
        turma.adicionarAluno(new Aluno(nome, idade));

        System.out.print("Deseja continuar cadastrando alunos? => ");
        char resposta = sc.next().charAt(0);

        if (resposta == 's') {
            adicionarAlunos(turma);
        } else if (resposta == 'n') {
            listaTurma.add(turma);
            menu();
        } else {
            System.out.println("Opção inexistente! Escolha 's' ou 'n'");
            adicionarAlunos(turma);
        }
    }

    static public void adicionarAlunoParcial(int turmaId) {
        for (int i = 0; i < listaTurma.size(); i++) {
            if (listaTurma.get(turmaId) != null) {
                System.out.print("Digite o nome do aluno: ");
                String nome = sc.next();
                System.out.print("Digite a idade do aluno: ");
                int idade = sc.nextInt();
                listaTurma.get(turmaId).adicionarAluno(new Aluno(nome, idade));
                break;
            }
        }
    }

    static public void adicionarAlunosEmUmaTurma() {
        System.out.println("TURMAS CADASTRADAS");
        for (int i = 0; i < listaTurma.size(); i++) {
            System.out.println("ID: " + i + " | Turma: " + listaTurma.get(i).getNomeTurma() + " | Qtd. Alunos: " + listaTurma.get(i).getLista().size());
        }

        System.out.print("\nQual turma deseja adicionar um aluno? [escolha o ID] => ");
        int id = sc.nextInt();

        adicionarAlunoParcial(id);

        System.out.print("Deseja continuar cadastrando alunos? => ");
        char resposta = sc.next().charAt(0);

        if (resposta == 's') {
            adicionarAlunoParcial(id);
        } else if (resposta == 'n') {
            menu();
        } else {
            System.out.println("Opção inexistente! Escolha 's' ou 'n'");
        }
        menu();
    }

    static public void pesquisarTurma() {
        for (int i = 0; i < listaTurma.size(); i++) {
            if (listaTurma != null) {
                System.out.println("\nTurma: " + listaTurma.get(i).getNomeTurma());
                System.out.println("Quantidade alunos: " + listaTurma.get(i).lista.size());
            }
        }
        menu();
    }

    static public void imprimirListaTurma() {
        for (Turma t : listaTurma) {
            if (t != null) {
                System.out.println(t);
            }
        }
        menu();
    }
}
