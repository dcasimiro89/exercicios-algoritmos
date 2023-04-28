package passo07;

public class Ex65 {

    public static void main(String[] args) {

        for (int i = 100; i >= 0; i -= 10) {
            if (i == 0) {
                System.out.print("Acabou!");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
