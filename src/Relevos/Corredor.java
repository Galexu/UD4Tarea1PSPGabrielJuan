package Relevos;

import java.util.Random;

class Corredor extends Thread {
    private Marcador marcador;

    public Corredor(Marcador marcador) {
        this.marcador = marcador;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int puntos = random.nextInt(10) + 1;
            marcador.agregarPuntos(puntos);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido.");
            }
        }
    }
}