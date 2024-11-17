package CalculadoraModificado;

import Color.ThreadColor;

public class Calculadora {
    private int suma = 0;

    public int calcularSuma(int[] numeros) {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Hilo 1":
                color = ThreadColor.ANSI_RED;
                break;
            case "Hilo 2":
                color = ThreadColor.ANSI_GREEN;
                break;
            case "Hilo 3":
                color = ThreadColor.ANSI_BLUE;
                break;
            default:
                color = ThreadColor.ANSI_RESET;
        }

        for (int numero : numeros) {
            suma += numero;
            System.out.println(color + Thread.currentThread().getName() + " ha sumado " + numero + " -> Suma total: " + suma);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido.");
                e.printStackTrace();
            }
        }

        return suma;
    }
}