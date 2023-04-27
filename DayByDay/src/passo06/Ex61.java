package passo06;

public class Ex61 {
    public static void main(String[] args) {

        int i = 0;
        do {
            if (i == 30) {
                System.out.print("Acabou!");
            } else {
                System.out.print(i + " ");
            }
            i += 3;
        } while (i <= 30);
    }
}
