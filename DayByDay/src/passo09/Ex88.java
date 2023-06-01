package passo09;

public class Ex88 {

    public static void gerador(String msg, int repeticao) {
        System.out.println("+-------=======------+");
        for (int i = 0; i < repeticao; i++) {
            System.out.println("\t" + msg);
        }
        System.out.println("+-------=======------+");
    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Digite uma mensagem: ");
//        String mensagem = sc.nextLine();
//        System.out.print("Quantidade que irá repetir a mensagem: ");
//        int repetir = sc.nextInt();
//
//        gerador(mensagem, repetir);
//        System.out.println();

        gerador("Aprendendo Java", 4);

    }
}
