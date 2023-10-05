package org.practice.baraja;

public class Carta {
    private boolean tapada;

    public void darVuelta() {
        System.out.println("dar vuelta");
    }

    @Override
    public String toString() {
        return "Carta{" +
                "tapada=" + tapada +
                '}';
    }
}
