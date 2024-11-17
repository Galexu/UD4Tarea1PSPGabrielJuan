package CalculadoraModificado;

import java.util.Random;

public class Sumador extends Thread {
    private Calculadora calculadora;
    private String color;

    public Sumador(Calculadora calculadora, String color) {
        this.calculadora = calculadora;
        this.color = color;
    }

    @Override
    public void run() {
        Random random = new Random();
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        String numeroMostrar = "";
        for (int numero : numeros) {
            numeroMostrar += (numero + " ");
        }
        System.out.println(color + getName() + " array de numeros: " + numeroMostrar);

        int suma = calculadora.calcularSuma(numeros);
        System.out.println(color + "Suma calculada por " + getName() + ": " + suma);
    }
}