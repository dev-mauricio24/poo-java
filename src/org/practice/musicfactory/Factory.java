package org.practice.musicfactory;

import java.util.ArrayList;

public class Factory {
    private ArrayList<BranchOffice> branchOffices;

    public Factory() {
        this.branchOffices = new ArrayList<>();
    }

    // Agregar un elemento a la lista
    public void addBranchOffice(BranchOffice branchOffice){
        this.branchOffices.add(branchOffice);
    }
    // Listar  todos los instrumentos
    public void listInstruments() {
        for (BranchOffice bo: this.branchOffices) {
            System.out.println(bo.getName());
            bo.listInstruments();
        }
    }
    // Eliminar un instrumento
    public Instrument deleteInstrument(String id) {
        Instrument deleted = null;
        int i = 0;
        while (i < branchOffices.size() && deleted == null) {
            deleted = branchOffices.get(i).deleteInstrument(id);
            i++;
        }
        return deleted;
    }

    // Obtener los instrumentos por tipo
    public ArrayList<Instrument> instrumentsByType(TypeInstrument type){
        ArrayList<Instrument> listFoundInstruments = new ArrayList<>();

        for(BranchOffice branchOffice: this.branchOffices) {
           listFoundInstruments.addAll(branchOffice.instrumentsByType(type));
        }
        return listFoundInstruments;
    }

    // obtener los porcentajes de los instrumentos por tipos
    public double[] percentInstrumentByType(String nameBranch) {
        double[] percents = new double[TypeInstrument.values().length];
        BranchOffice branchFound = searchBranch(nameBranch);
        if(branchFound != null) {
            percents = branchFound.percentInstrumentByType();
        }
        return percents;
    }

    private BranchOffice searchBranch(String nameBranch) {
        int i = 0;
        BranchOffice branchFound = null;
        while(i < this.branchOffices.size() && !this.branchOffices.get(i).getName().equals(nameBranch)) {
            i++;
        }
        if(i < this.branchOffices.size()) {
            branchFound = this.branchOffices.get(i);
        }
        return branchFound;
    }
}
