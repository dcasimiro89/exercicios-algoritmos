package diariamente;

public class Calculadora {

    public double somar(int x, int y){
        return x + y;
    }

    public double somar(int x, int y, int z){
        return x + y + z;
    }

    public void somarDoisNumeros(int x, int y){
        int somar = x + y;
        System.out.println("Resultado: " + somar);
    }

    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        System.out.println("Método somar: " + c.somar(10, 30));

        c.somarDoisNumeros(25, 25);
    }
}
