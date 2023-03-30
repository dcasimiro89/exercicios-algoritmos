package diariamente;

public class CombustivelOld {

    Double mediaVeiculo;
    Double valorCombustivel;
    Double km;
    Double calculo;

    public void calcularCombustivelPorKm()  {
        calculo = valorCombustivel / mediaVeiculo;
        System.out.printf(String.format("Valor por Km será de R$ %.2f ", calculo));
    }

    public void calcularViagem() {
        Double resultado = km * calculo;
        System.out.printf(String.format("Valor da viagem será de R$ %.2f ", resultado));
    }

    public static void main(String[] args) {

        CombustivelOld c = new CombustivelOld();

        c.valorCombustivel = 5.00;
        c.mediaVeiculo = 12.00;
        c.km = 240.00;
        c.calcularCombustivelPorKm();
        System.out.println();
        c.calcularViagem();
    }

}
