package Relevos;

import Color.ThreadColor;

public class Marcador {
    private int puntosTotales = 0;

    public void agregarPuntos(int puntos) {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Hilo 1":
                color = ThreadColor.ANSI_BLUE;
                break;
            case "Hilo 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            case "Hilo 3":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Hilo 4":
                color = ThreadColor.ANSI_RED;
                break;
            default:
                color = ThreadColor.ANSI_RESET;
        }

        puntosTotales += puntos;
        if (puntosTotales > 50) {
            puntosTotales = 50;
        }

        System.out.println(color + Thread.currentThread().getName() + " ha sumado " + puntos + " puntos -> Total: " + puntosTotales);

        if (puntosTotales > 50) {
            System.out.println(color + Thread.currentThread().getName() + " ha llegado a la meta con un total de " + puntosTotales + " puntos.");
        }
    }
}