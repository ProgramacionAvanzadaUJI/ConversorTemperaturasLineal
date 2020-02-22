package escala;

import java.util.ArrayList;
import java.util.List;

public class TablaConversion {
    List<Conversor> conversores = new ArrayList<>();

    public void addConversor(final Conversor conversor) {
        conversores.add(conversor);
    }

    public String tabla(final double temperaturaInicio, final double temperaturaFinal, final double salto)  {
        StringBuffer sb = new StringBuffer();
        double temperatura = temperaturaInicio;

        while (temperatura <= temperaturaFinal) {
            for (Conversor conversor: conversores) {
                sb.append(temperatura + "\t");
                sb.append(conversor.convierte(temperatura) + "\n");
            }
            temperatura += salto;
        }

        return sb.toString();
    }
}
