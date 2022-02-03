public class InvestimentoSemIR extends Investimento {

    public InvestimentoSemIR(double valorInicial, double jurosMensais) {
        super(valorInicial, jurosMensais);
    }

    @Override
    public double calcularLucro(int meses) {
        if (valorInicial < 1000.00){
            System.out.print("O valor inicial não deve ser menor do que R$1000.00" + ", rendimento: ");
        }else {
            return valorInicial * Math.pow(1+(jurosMensais/100), meses) - valorInicial;
        }
        return 0;
    }
}
