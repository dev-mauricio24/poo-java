package org.practice.arraylist;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        Concesionario c = new Concesionario("fake car");
        c.showCars();
        c.addCar(new Car("BMW", "Negro", 50900));
        c.addCar(new Car("Audi", "Azul", 100));
        c.addCar(new Car("Ferrari", "Negro", 50900));
        c.addCar(new Car("Mercedez Benz", "Blanco", 100));
        System.out.println(c.averageKms());
        System.out.println(c.carMaxKm());
        System.out.println(c.carMinKm());
        System.out.println(c.carsMaxKms());
        System.out.println(c.carsMinKms());

        // Crear un arrayList
//        ArrayList<Car> cars = new ArrayList<>();
//
//        // agregar un elemnto a la lista
//        cars.add(new Car("BMW", "Negro"));
//        cars.add(new Car("Fiat", "Rojo"));
//
//        // arrayList.size() => return length
//        System.out.println(cars.size());
//        System.out.println("El segundo auto de la lista es: " + cars.get(1));
//
//        // eliminar un elemento de la lista
//        cars.remove(0);
//
//        for (Car c: cars) {
//            System.out.println(c.getMarca());
//        }

    }
}
