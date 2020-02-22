package escala;

public class EscalaLineal {
    final double temperaturaCongelacionAgua;
    final double temperturaEbullicionAgua;

    public EscalaLineal(final double temperaturaCongelacionAgua, final double temperturaEbullicionAgua) {
        this.temperaturaCongelacionAgua = temperaturaCongelacionAgua;
        this.temperturaEbullicionAgua = temperturaEbullicionAgua;
    }

    double temperaturaParaLambda(final double lambda) {
        return (1 - lambda) * temperaturaCongelacionAgua + lambda * temperturaEbullicionAgua;
    }

    double lambdaParaTemperatura(final double temperatura) {
        return (temperatura - temperaturaCongelacionAgua) / (temperturaEbullicionAgua - temperaturaCongelacionAgua);
    }
}
