package org.practice.arraylist;

public class Car {
    private String marca;
    private String color;
    private double km;

    public Car(String marca, String color, double km) {
        this.marca = marca;
        this.color = color;
        this.km = km;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }
    public double getKm() {
        return km;
    }
}
