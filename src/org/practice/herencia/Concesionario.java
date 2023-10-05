package org.practice.herencia;

import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Vehiculo> vehiculos;

    public Concesionario() {
        this.vehiculos = new ArrayList<>();
    }

    public void addVehicle(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }
}
