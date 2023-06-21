package passo10;

public class Ex98 {

    public static void main(String[] args) {
        System.out.println(superSomador(1, 6));
    }

    public static int superSomador(int primeiroValor, int segundoValor) {
        int somaValor = 0;
        for (int i = primeiroValor; i <= segundoValor; i++) {
            if (i == segundoValor) {
                System.out.print(i);
                somaValor += i;
            } else {
                System.out.print(i + " + ");
                somaValor += i;
            }
        }
        System.out.println();
        return somaValor;
    }
}
