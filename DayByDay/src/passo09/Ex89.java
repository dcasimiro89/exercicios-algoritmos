package passo09;

public class Ex89 {

    public static void borda(int tipoBorda) {
        switch (tipoBorda) {
            case 1:
                System.out.println("+-------=======------+");
                break;
            case 2:
                System.out.println("~~~~~~~~:::::::~~~~~~~");
                break;
            case 3:
                System.out.println("<<<<<<<<------->>>>>>>");
                break;
            default:
        }
    }

    public static void gerador(String mensagem, int repeticao, int tipoBorda) {
        borda(tipoBorda);
        for (int i = 0; i < repeticao; i++) {
            System.out.println("\t" + mensagem);
        }
        borda(tipoBorda);
    }

    public static void main(String[] args) {

        gerador("Portugol Studio", 3, 2);

    }
}
