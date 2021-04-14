package ar.com.xeven;

import com.sun.org.apache.xml.internal.security.encryption.AgreementMethod;

import java.security.AuthProvider;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Registro {
    //atributos
    private List<Automotor> automotoresDelRegistro = new ArrayList<>();
    private List<Automotor> camiones = new ArrayList<>();
    private Integer idCP;
    private String denominacion;


    //constructores
    public Registro() {
    }

    public Registro(int idCP,String denominacion) {
        this.idCP = idCP;
        this.denominacion = denominacion;
    }

    public Registro(Integer idCP) {
        this.idCP = idCP;
    }

    //getters y setters
    public List<Automotor> getAutomotoresDelRegistro() {
        return automotoresDelRegistro;
    }

    public void setAutomotoresDelRegistro(List<Automotor> automotoresDelRegistro) {
        this.automotoresDelRegistro = automotoresDelRegistro;
    }

    public Integer getIdCP() {
        return idCP;
    }

    public void setIdCP(Integer idCP) {
        this.idCP = idCP;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }


}
