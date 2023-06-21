package passo10;

public class Ex100 {

    public static void main(String[] args) {

        double media = calcularMedia(5.0, 3.5);
        System.out.println(media);
        situacao(media);
    }

    public static double situacao(double media) {
        if (media < 3.0) {
            System.out.println("REPROVADO");
        } else if (media < 7.0) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("APROVADO");
        }
        return -1;
    }

    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }
}
