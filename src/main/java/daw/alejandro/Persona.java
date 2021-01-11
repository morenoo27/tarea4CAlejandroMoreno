/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.alejandro;

/**
 *
 * @author RaquelCM
 */
public class Persona {

    //los atributos de este objeto son solo dos
    private final String NOMBRE;
    private final int EDAD;
    private Animal pet;

    public Persona(String NOMBRE, int EDAD) {
        this.NOMBRE = NOMBRE;
        this.EDAD = EDAD;
    }

    public void llamar(Animal pet) {
        this.pet.despertar();
    }

    public void alimentar(Animal pet, double cantidadGramos) {
        this.pet.comer(cantidadGramos);
    }

    public void jugar(Animal pet, int cantidadMinutos) {
        try {
            this.pet.jugar(cantidadMinutos);
        } catch (){
            
        }
    }
}
