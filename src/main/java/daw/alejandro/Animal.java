/*
La clase Animal será la representación abstracta de los objetos de tipo Animal y
pertenece a un paquete llamado daw.tunombre. De los Animales queremos mantener 
la siguiente información:

    Fecha de nacimiento, un objeto de tipo LocalDate
    Nombre
    Tipo, que puede ser: "gato", "perro", "lagarto", "cobaya", "periquito"
    Peso en gramos
    Estado, que podrá ser: "comiendo", "durmiendo", "despierto/reposo" o 
    "jugando".

El estado y el tipo lo puedes implementar como quieras, usando String, enteros, etc.

La clase tendrá un constructor por defecto, que creará un gato con fecha de 
nacimiento según la fecha actual del sistema, de nombre "Turrón", peso 2200 
gramos y durmiendo. Además tendrá un constructor parametrizado, recibiendo un 
objeto LocalDate para indicar la fecha de nacimiento, el nombre del animal, el 
tipo, el peso y el estado en el que estará. La clase Animal implementará un 
contador de instancias en los respectivos constructores. Los atributos de esta 
clase estarán encapsulados.

Otros métodos de la clase mascota:

comer(double cantidadGramos). Incrementará el peso del animal, aumentándolo 
según el parámetro indicado en cantidad. Este método no devuelve nada. Si el 
parámetro es negativo se considera como positivo.

dormir(), que pone a dormir al animal.

despertar(), que despierta al bicho.

descansar(), que pone al animal en reposo.

jugar(int cantidadMinutos), este método le indica a la mascota que está jugando 
y recibe como parámetro la cantidad de minutos que estará el animal jugando. 
Por cada 30 minutos completos de juego, el peso del animal se verá reducido en 
20 gr. Si la cantidad es menor de 30 minutos, se reducirá en 10 gramos. Si la 
cantidad de minutos es negativa se considera positiva. Un animal no puede jugar
más de 180 minutos, por lo tanto si se supera esa cantidad se lanzará una 
excepción de tipo IllegalArgument.
toString(), que devolverá una cadena con la información actualizada de la 
mascota.
Animal clonar(Animal pet), método de clase para clonar Animales, que recibe el 
objeto Animal que queremos clonar, llamado pet,  y devuelve el objeto con la 
copia de pet. Ten en cuenta que este método crea un objeto nuevo. Controla 
excepciones NullPointer en este método.

getContadorInstancias(), método de clase que devolverá el número de objetos 
creados en el sistema.

 */
package daw.alejandro;

import java.time.LocalDate;

/**
 *
 * @author RaquelCM
 */
public class Animal {
    //este objeto(en este caso hablamos de un animal) vaa tener las siguientes 
    //caracteristicas
    
    //para tener la fecha de nacimineto vamos a tener que importar la libreria
    //Date
    //identifiamos que las caracteristicas: "estado" son todas de tipo boolean,
    //"tipo" y "nombre" suponemos que es de tipo String y "peso" tipo int
    
    private LocalDate fechaNacimiento;
    private int peso;
    private boolean comiendo, durmuendo,jugando;
    //si esta durmiendo,significara que no esta despierto, por lo tanto 
    //true=dormido y false=despierto o en reposo
    //en comiendo true come y false no / jugando true jueva false no
    private final String NOMBRE;
    private String tipo;

    public Animal() {
        this.fechaNacimiento = LocalDate.now();
        //con esta fecha se son pndra el formto "año-mes-dia"
        //para configurar la salida de la fecha importaremos la libreria
        //DateTimeFrmatter
        this.peso = 2200;
        this.comiendo = false;
        this.durmuendo = true;
        this.jugando = false;
        this.NOMBRE = "Turron";
        this.tipo = "gato";
    }
    
    
    
    
}
