package org.practice.musicfactory;

import java.util.ArrayList;

public class BranchOffice {
    private String name;
    private ArrayList<Instrument> instruments;

    public BranchOffice(String name) {
        this.name = name;
        this.instruments = new ArrayList<>();
    }

    public void listInstruments() {
        for (Instrument inst: this.instruments) {
            System.out.println(inst);
        }
    }

    public ArrayList<Instrument> instrumentsByType(TypeInstrument type){
        ArrayList<Instrument> listFoundInstruments = new ArrayList<>();

        for(Instrument instrument: this.instruments) {
            if(instrument.getType() == type) {
                listFoundInstruments.add(instrument);
            }
        }
        return listFoundInstruments;
    }

    public  void addInstrument(Instrument instrument) {
        this.instruments.add(instrument);
    }

    private Instrument searchInstrument(String id) {
        int i = 0;
        Instrument found = null;

        while(i < this.instruments.size() && !this.instruments.get(i).getID().equals(id)){
            i++;
        }
        if(i < this.instruments.size()) {
            found = this.instruments.get(i);
        }
        return found;
    }

    public double[] percentInstrumentByType() {
        final int CANT_TYPE_INSTRUMENTS = TypeInstrument.values().length;
        double[] percents = new double[CANT_TYPE_INSTRUMENTS];

        for(Instrument instrument: this.instruments) {
            // Ordinal retorna la posición de cada elemento dentro de un enumerador
            percents[instrument.getType().ordinal()] ++;
        }
        absolutePercents(percents);
        return percents;
    }

    private void absolutePercents(double[] percents) {
        for (int i = 0; i < percents.length; i++) {
            percents[i] = (percents[i] * 100) / this.instruments.size();
        }
    }


    public Instrument deleteInstrument(String id) {
        Instrument deleted = searchInstrument(id);
        this.instruments.remove(deleted);
        return deleted;
    }

    public String getName() {
        return name;
    }
}
