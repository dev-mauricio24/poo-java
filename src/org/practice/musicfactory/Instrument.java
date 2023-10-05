package org.practice.musicfactory;

public class Instrument {
    String ID;
    double price;
    TypeInstrument type;

    public Instrument(String ID, double price, TypeInstrument type) {
        this.ID = ID;
        this.price = price;
        this.type = type;
    }

    public TypeInstrument getType() {
        return type;
    }

    public String getID() {
        return ID;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "ID='" + ID + '\'' +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}
