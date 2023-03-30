package diariamente;

public class AtribuicaoReferencia {

    Integer number;

    public AtribuicaoReferencia(){}

    public AtribuicaoReferencia(Integer number){
        this.number = number;
    }

    public void setNumber(Integer number){
        this.number = number;
    }

    @Override
    public String toString() {
        return number.toString();
    }

    public static void main(String[] args) {

        int a = 1;
        int b = a;

        System.out.println("A: " + a + " / B: " + b);
        a = 2;
        System.out.println("A: " + a + " / B: " + b);
        // Alterando a variavel int A, o valor B mantém o valor da primeira cópia armazenado

        AtribuicaoReferencia a1 = new AtribuicaoReferencia(1);
        AtribuicaoReferencia b2 = a1;

        System.out.println("A1: " + a1 + " / B2: " + b2);
        a1.setNumber(2);
        System.out.println("A1: " + a1 + " / B2: " + b2);
        // 
    }
}
