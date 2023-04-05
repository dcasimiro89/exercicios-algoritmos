package passo04;

public class Ex47 {

    public static void main(String[] args) {

        int i = 500;
        int soma = 0;

        while (i >= 0) {
            soma += i;
            i -= 50;
        }
        System.out.println("Soma: " + soma);
    }
}
