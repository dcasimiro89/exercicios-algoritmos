package diariamente;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {

    private String nome;
    private double altura;

    public CadastroPessoas(String nome, double altura){
        this.nome = nome;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public double getAltura(){
        return altura;
    }

    @Override
    public String toString() {
        return "CadastroPessoas{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                '}';
    }

    public static void main(String[] args) {

        List<CadastroPessoas> lista = new ArrayList<>();
        lista.add(new CadastroPessoas("Deivison", 1.85));
        lista.add(new CadastroPessoas("Rose", 1.73));
        lista.add(new CadastroPessoas("Geraldo", 1.75));

        for(CadastroPessoas c : lista) {
            System.out.println(c);
        }
    }
}
