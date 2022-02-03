public class InvestimentoComIR extends Investimento {

    public InvestimentoComIR(double valorInicial, double jurosMensais) {
        super(valorInicial, jurosMensais);
    }

    @Override
    public double calcularLucro(int meses) {
        double resultado = valorInicial * Math.pow(1 + (jurosMensais / 100), meses) - valorInicial;
        if (meses < 6) {
            return resultado * (100 - 22) / 100;
        } else if (meses >= 6 && meses < 12) {
            return resultado * (100 - 20) / 100;
        } else if (meses >= 12 && meses < 24) {
            return resultado * (100 - 17.5) / 100;
        } else if (meses >= 24) {
            return resultado * (100 - 15) / 100;
        } else return 0;
    }
}