public class Investimento {

    double valorInicial;
    double jurosMensais;

    public Investimento(double valorInicial, double jurosMensais) {
        this.valorInicial = valorInicial;
        this.jurosMensais = jurosMensais;
    }

    public double calcularLucro(int meses) {
        return valorInicial * Math.pow(1+(jurosMensais/100), meses) - valorInicial;
    }
}
