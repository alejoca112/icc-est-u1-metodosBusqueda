package models;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getName(){
        return this.nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public int getAge(){
        return this.edad;
    }
    
    public void setAge(int edad){
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + " edad: " + edad;
    }
}
