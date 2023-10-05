package org.practice.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class Concesionario {
    private String nombre;
    private Collection<Car> cars;

    public Concesionario(String nombre) {
        this.nombre = nombre;
        // Se inicializa la lista
        this.cars = new ArrayList<>();
    }

    public void addCar(Car c) {
        this.cars.add(c);
    }

    private double totalKms() {
        double acu = 0.0;
        for(Car c: this.cars) {
            acu += c.getKm();
        }
        return acu;
    }

    public double averageKms() {
        double totalKms = this.totalKms();
        return totalKms / this.cars.size();
    }

    public Car carMaxKm() {
        Car car = null;
        int maxKm = Integer.MIN_VALUE;
        for(Car c: this.cars) {
            if(c.getKm() > maxKm) {
                maxKm = (int) c.getKm();
                car = c;
            }
        }
        return car;
    }

    public Car carMinKm() {
        Car car = null;
        int minKm = Integer.MAX_VALUE;
        for(Car c: this.cars) {
            if(c.getKm() < minKm) {
                minKm = (int) c.getKm();
                car = c;
            }
        }
        return car;
    }

    private int maxKms() {
        int maxKm = Integer.MIN_VALUE;
        for(Car c: this.cars) {
            if(c.getKm() > maxKm) {
                maxKm = (int) c.getKm();
            }
        }
        return maxKm;
    }

    private int minKms() {
        int minKm = Integer.MAX_VALUE;
        for(Car c: this.cars) {
            if(c.getKm() < minKm) {
                minKm = (int) c.getKm();
            }
        }
        return minKm;
    }

    public ArrayList<Car> carsMaxKms() {
        ArrayList<Car> listCarsMax = new ArrayList<>();
        int maxKm = Integer.MIN_VALUE;
        for(Car c: this.cars) {
            if(c.getKm() == maxKm) {
                listCarsMax.add(c);
            } else if(c.getKm() > maxKm) {
                maxKm = (int) c.getKm();
                listCarsMax.clear();
                listCarsMax.add(c);
            }
        }
        return listCarsMax;
    }

    public ArrayList<Car> carsMinKms() {
        ArrayList<Car> listCarsMin = new ArrayList<>();
        int minKm = Integer.MAX_VALUE;
        for(Car c: this.cars) {
            if(c.getKm() == minKm) {
                listCarsMin.add(c);
            } else if(c.getKm() < minKm) {
                minKm = (int) c.getKm();
                listCarsMin.clear();
                listCarsMin.add(c);
            }
        }
        return listCarsMin;
    }

    public void showCars() {
        if(this.cars.isEmpty()) {
            System.out.println("No hay autos");
        } else {
            for(Car c: this.cars) {
                System.out.println(c);
            }
        }
    }
}
