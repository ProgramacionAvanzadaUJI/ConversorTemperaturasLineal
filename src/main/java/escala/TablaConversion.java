package escala;

import java.util.ArrayList;
import java.util.List;

public class TablaConversion {
    List<Conversor> conversores = new ArrayList<>();

    public void addConversor(final Conversor conversor) {
        conversores.add(conversor);
    }

    public String tabla(final double temperaturaInicio, final double temperaturaFin, final double salto)  {
        StringBuffer sb = new StringBuffer();
        double temperatura = temperaturaInicio;

        while (temperatura <= temperaturaFin) {
            sb.append(String.format("%.2f", temperatura) + "\t");
            for (Conversor conversor: conversores) {
                sb.append(String.format("%.2f",conversor.convierte(temperatura)) + "\t");
            }
            sb.append("\n");
            temperatura += salto;
        }

        return sb.toString();
    }
}
