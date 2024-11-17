package Relevos;

public class Main {
    public static void main(String[] args) {
        Marcador marcador = new Marcador();

        Corredor corredor1 = new Corredor(marcador);
        corredor1.setName("Hilo 1");

        Corredor corredor2 = new Corredor(marcador);
        corredor2.setName("Hilo 2");

        Corredor corredor3 = new Corredor(marcador);
        corredor3.setName("Hilo 3");

        Corredor corredor4 = new Corredor(marcador);
        corredor4.setName("Hilo 4");

        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredor4.start();
    }
}