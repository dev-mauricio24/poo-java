package org.practice.herencia;

public class Moto extends Vehiculo{
    private int anchoManubrio;

    public Moto(String marca, String modelo, String patente, int anchoManubrio) {
        super(marca, modelo, patente);
        this.anchoManubrio = anchoManubrio;
    }

    public int getAnchoManubrio() {
        return anchoManubrio;
    }

    public void setAnchoManubrio(int anchoManubrio) {
        this.anchoManubrio = anchoManubrio;
    }

    void hacerCaballito() {
        System.out.println("Haciendo el caballito");
    }
}
