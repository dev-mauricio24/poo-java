package org.practice.musicfactory;

import java.util.ArrayList;

/*
* Una fábrica de instrumentos musicales posee una lista de todas sus sucursales. Cada sucursal tiene nombre,
* y un alista con todos los instrumentos a la venta. De cada uno d ellos se sabe su id, precio, y tipo(percusión, cuerda, etc)
*
* PUNTOS A DESARROLLAR:
* Desarrollar el diagrama de clases que modele el enunciado, donde conste sus atributos, rlaciones y métodos
* los constructores se pueden omitir
*
* La explotación del método instrumentosPorTipo() que devuelva una lista de elementos cuyo tipo coincuida
* con el parámetro reibido
*
* La explotación del método borrarInstrumento() que recibe un ID como parámetro
*
* La explotación del método porcInstrumentosPorTipo() que recibe el nombre de una seucursal y retorne los
* porcentajes de instrumentos por tipo.
* */
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        loadFactory(factory);
        double[] percents = factory.percentInstrumentByType("Sucursal B");
        for (double percent : percents) {
            System.out.println(percent);
        }
//        Instrument deleted =  factory.deleteInstrument("DEF15");
//        System.out.println("elemento borrado " + deleted);
//        factory.listInstruments();
//        ArrayList<Instrument> instrumentsByType = factory.instrumentsByType(TypeInstrument.CUERDA);
//
//        for(Instrument inst: instrumentsByType) {
//            System.out.println(inst);
//        }
    }

    private static void loadFactory(Factory factory) {
        BranchOffice bo1 = new BranchOffice("Sucursal A");
        BranchOffice bo2 = new BranchOffice("Sucursal B");

        bo1.addInstrument(new Instrument("ABC123", 450000, TypeInstrument.CUERDA));
        bo1.addInstrument(new Instrument("ABC124", 340000, TypeInstrument.VIENTO));
        bo1.addInstrument(new Instrument("ABC125", 189000, TypeInstrument.CUERDA));

        bo2.addInstrument(new Instrument("DEF123", 450000, TypeInstrument.PERCUSION));
        bo2.addInstrument(new Instrument("DEF124", 450000, TypeInstrument.VIENTO));
        bo2.addInstrument(new Instrument("DEF125", 450000, TypeInstrument.CUERDA));

        factory.addBranchOffice(bo1);
        factory.addBranchOffice(bo2);
    }
}
