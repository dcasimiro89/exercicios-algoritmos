package passo10;

public class Ex99 {

    public static void main(String[] args) {
        System.out.println(potencia(5, 2));
    }

    public static int potencia(int base, int expoente) {
        int aux = 1;
        for (int i = 1; i <= expoente; i++) {
            aux = aux * base;
        }
        return aux;
    }
}
