package main;


import escala.Conversor;
import escala.EscalaLineal;
import escala.TablaConversion;

public class Main {
    public static void main(String[] args) {
        new Main().ejecuta();
    }

    private void ejecuta() {
        TablaConversion tabla = new TablaConversion();
        tabla.addConversor(new Conversor(new EscalaLineal(0, 100), new EscalaLineal(32, 212)));
        System.out.println(tabla.tabla(0, 100, 5));
    }
}
