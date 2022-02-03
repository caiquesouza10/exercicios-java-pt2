public class InvestimentosApplication {

    public static void main(String[] args) {

        Investimento investimento = new Investimento(1000.00, 4);

        InvestimentoComIR investimentoComIR = new InvestimentoComIR(1000.00, 4);

        InvestimentoSemIR investimentoSemIR = new InvestimentoSemIR(100.00, 4);

        System.out.printf("Valor do rendimento: %.2f.", investimento.calcularLucro(2));

        System.out.println();

        System.out.printf("Valor do rendimento com IR: %.2f.", investimentoComIR.calcularLucro(2));

        System.out.println();

        System.out.printf("%.2f.", investimentoSemIR.calcularLucro(2));
    }
}
