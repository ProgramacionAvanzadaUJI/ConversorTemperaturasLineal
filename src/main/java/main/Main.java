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
        EscalaLineal celsius = new EscalaLineal(0, 100);
        tabla.addConversor(new Conversor(celsius, new EscalaLineal(32, 212)));
        tabla.addConversor(new Conversor(celsius, new EscalaLineal(0,80)));
        System.out.println(tabla.tabla(0, 100, 5));
    }
}
