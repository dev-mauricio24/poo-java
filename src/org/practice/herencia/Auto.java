package org.practice.herencia;

public class Auto extends Vehiculo{
    private boolean tieneAire;

    public Auto(String marca, String modelo, String patente, boolean tieneAire) {
        super(marca, modelo, patente);
        this.tieneAire = tieneAire;
    }

    public void prenderAire() {
        if(this.tieneAire) {
            System.out.println("Prendiendo aire...");
        }
    }

    public boolean isTieneAire() {
        return tieneAire;
    }

    public void setTieneAire(boolean tieneAire) {
        this.tieneAire = tieneAire;
    }
}
