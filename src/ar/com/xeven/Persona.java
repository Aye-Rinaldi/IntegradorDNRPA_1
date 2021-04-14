package ar.com.xeven;

import javax.swing.*;

public class Persona implements Comparable<Persona>{

    //atributos
    private String nombre;
    private Integer dni;
    private String direccion;

    //constructor
    public Persona(String nombre, Integer dni, String direccion) {
        setNombre(nombre);
        setNombre(direccion);
        setDni(dni);

        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    //setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (Utilitaria.validarString(nombre,20))
            this.nombre = nombre;
        else
            try {
                throw new DatosIncorrectosException("Nombre incorrecto");
            } catch (DatosIncorrectosException e) {
                e.printStackTrace();
            }
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        if (Utilitaria.validarDni(dni))
            this.dni = dni;
        else try {
            throw new DatosIncorrectosException("El DNI debe tener 8 digitos");
        } catch (DatosIncorrectosException e) {
            e.printStackTrace();
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (Utilitaria.validarString(direccion,20))
            this.direccion = direccion;
        else
            try {
                throw new DatosIncorrectosException("Direccion incorrecta");
            } catch (DatosIncorrectosException e) {
                e.printStackTrace();
            }
    }


    //toString
    @Override
    public String toString() {
        return  '{'+"nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", direccion='" + direccion + '\'' +
                '}';
    }


    @Override
    public int compareTo(Persona o) {
        return nombre.compareTo(o.getNombre());
    }
}
