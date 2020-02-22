package escala;

public class Conversor {
    final EscalaLineal origen;
    final EscalaLineal destino;

    public Conversor(final EscalaLineal origen, final EscalaLineal destino) {
        this.origen = origen;
        this.destino = destino;
    }

    double convierte(final double temperaturaOrigen) {
        return destino.temperaturaParaLambda(origen.lambdaParaTemperatura(temperaturaOrigen));
    }
}
