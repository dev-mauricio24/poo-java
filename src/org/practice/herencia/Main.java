package org.practice.herencia;

public class Main {
    public static void main(String[] args) {
        Concesionario con = new Concesionario();
        Moto moto = new Moto("yamaha", "2023", "125xg", 20);
        con.addVehicle(moto);

        Vehiculo v = moto;

        moto.hacerCaballito();


    }
}
