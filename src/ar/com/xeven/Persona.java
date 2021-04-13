package ar.com.xeven;

import javax.swing.*;

public class Persona implements Comparable<Persona>{

    //atributos
    private String nombre;
    private Integer dni;
    private String direccion;

    //constructor
    public Persona(String nombre, Integer dni, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    //setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    //toString
    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", direccion='" + direccion + '\'' +
                '}';
    }


    @Override
    public int compareTo(Persona o) {
        return nombre.compareTo(o.getNombre());
    }
}
