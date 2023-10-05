#  Poo conceptos
## Static
Un atributo estático pertenece a la clase, por lo tanto, se debe
instanciar desde la clase más no desde el objeto. esto representa
rendimiento en la memoria.

En un método estático no se puede hacer referencia a un atributo
de la instancia

En el siguiente ejemplo usamos un atributo estático para generar
un id auto incremental. Al crear un nuevo objeto el atributo 
estático almacena el valor anterior por lo tanto, lo va asignando
al nuevo objeto.

```java
    public class Ticket {
        private static int counter;
        private int consecutivo;
        private String fecha;
        private String cliente;
    
        public Ticket(String fecha, String cliente) {
            counter ++;
            this.consecutivo = counter;
            this.fecha = fecha;
            this.cliente = cliente;
        }
    
        @Override
        public String toString() {
            return "Ticket{" +
                    "consecutivo=" + consecutivo +
                    ", fecha='" + fecha + '\'' +
                    ", cliente='" + cliente + '\'' +
                    '}';
        }
    }
```

## Relación de Objetos
Los objetos pueden estar relacionados, es decir, un atributo
de una clase puede ser de tipo objeto de la otra. Un ejemplo
claro es ver la relación de un auto con un motor, un motor
tiene propiedades únicas y un auto siempre tendrá un motor.

## Tell, don't ask (dilo no lo preguntes)
Este patrón se basa en delegar la responsabilidad de comportamiento
a cada objeto según su estado. Para usarlo en términos más generales,
lo que se busca es que un objeto no le pida datos a otro para 
man ipularlos, sino que, el mismo como ya los conoces realice 
las operaciones necesarias y retorne l ainformación requerida.

## Collections => Arryalist<>();
Los arrays list funcionan como un array consuper poderes. Hereda de la clase 
Colletion ``` Collection<type data> nameCollection =  Arryalist<>(); ```
Posee distintos métodos que nos permiten manipular los datos de forma sencilla
y práctica.

```java
    Collection<Car> cars =  Arryalist<>(); 
    cars.add(new Car("BMW", "Negro"))
    cars.size(); // return length of array
    cars.isEmpty(); return a boolena value
    cars.get(0); // return an element by index
    cars.remove(0); // delete an element by index
```

## Herencia
Permite hacer un factor común de los miembros deuna clase evitando 
la repetición.  La herencia es llamada generalización (es un, es una)
a dferencia de la asociación (tiene un, tiene una).

En la herencia los constructores no se heredan. Para poder acceder al
construcftor del padre se usa la siguiente estructura.

El constructor de la subclase siempre lleva primero el constructor
de la superclase
## Upcasting o generalización
## Downcasting o especialización

## abstract
Una clase abstracta hace referencia a una clase muy general, por lo tanto no se puede 
instanciar

