package passo04;

public class Ex43 {

    public static void main(String[] args) {

        int i = 30;

        while (i >= 1) {
            if (i % 4 == 0) {
                System.out.print("[" + i + "] ");
            } else {
                System.out.print(i + " ");
            }
            i--;
        }
    }
}