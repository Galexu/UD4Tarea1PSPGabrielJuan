package CalculadoraModificado;

import Color.ThreadColor;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Sumador sumador1 = new Sumador(calculadora, ThreadColor.ANSI_RED);
        sumador1.setName("Hilo 1");

        Sumador sumador2 = new Sumador(calculadora, ThreadColor.ANSI_GREEN);
        sumador2.setName("Hilo 2");

        Sumador sumador3 = new Sumador(calculadora, ThreadColor.ANSI_BLUE);
        sumador3.setName("Hilo 3");

        sumador1.start();
        sumador2.start();
        sumador3.start();
    }
}