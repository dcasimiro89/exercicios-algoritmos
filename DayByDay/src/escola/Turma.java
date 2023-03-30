package escola;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String nomeTurma;
    List<Aluno> lista = new ArrayList<>();

    public Turma() {
    }

    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public List<Aluno> getLista() {
        return lista;
    }

//    public void List<Aluno> adicionarAlunoParcial(Aluno aluno) {
//        lista.add(aluno);
//    }

    public void adicionarAluno(Aluno aluno) {
        lista.add(aluno);
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nomeTurma='" + nomeTurma + '\'' +
                ", lista=" + lista +
                '}';
    }

    //    public void listaTurma(){
//        String str = "\n===================";
//        System.out.println("Turma: " + nomeTurma);
//        for (Aluno aluno : lista) {
//            System.out.println(aluno.getNome() + " | " + aluno.getIdade());
//        }
//        str += str;
//    }
}
