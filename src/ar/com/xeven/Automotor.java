package ar.com.xeven;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.time.LocalDate;
import java.util.List;

public  class Automotor{
    //atributos
    protected Integer idCP;
    protected String competencia;
    protected Persona propietario;
    protected List<Persona> autorizados;
    protected Uso uso;
    protected String provincia;
    protected String localidad;
    protected String marca;
    protected String modelo;
    protected String anio;
    protected String color;
    protected int potencia;
    protected LocalDate fechaRegistroPropietario;
    protected LocalDate fechaAltaNuevoPropietario;
    protected Patente patente;



    //constructor
    public Automotor(Integer idCP,String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        this.idCP = idCP;
        this.patente = patente;
        this.competencia = competencia;
        this.propietario = propietario;
        this.uso = uso;
        this.provincia = provincia;
        this.localidad = localidad;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Automotor() {
    }

    public Automotor(Integer idCP,Patente patente,String competencia,Persona propietario,String provincia,String localidad) {
        this.idCP = idCP;
        this.patente = patente;
        this.competencia = competencia;
        this.propietario = propietario;
        this.provincia = provincia;
        this.localidad = localidad;
    }

    //getters y setters
    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }


    public Uso getUso() {
        return uso;
    }

    public void setUso(Uso uso) {
        this.uso = uso;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public LocalDate getFechaRegistroPropietario() {
        return fechaRegistroPropietario;
    }



    public void setFechaRegistroPropietario(LocalDate fechaRegistroPropietario) {
        this.fechaRegistroPropietario = fechaRegistroPropietario;
    }

    public Integer getIdCP() {
        return idCP;
    }

    public void setIdCP(Integer idCP) {
        this.idCP = idCP;
    }

    public List<Persona> getAutorizados() {
        return autorizados;
    }

    public void setAutorizados(List<Persona> autorizados) {
        this.autorizados = autorizados;
    }

    //PATENTE
    public Patente getPatente() {
        return patente;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }

    //toString
    @Override
    public String toString() {
        return
                "Patente='"+ patente + '\'' +
                ", Competencia='" + competencia + '\'' +
                ", Propietario=" + propietario +
                ", Uso=" + uso +
                ", Provincia='" + provincia + '\'' +
                ", Localidad='" + localidad + '\'' +
                ", Marca='" + marca + '\'' +
                ", Modelo='" + modelo + '\'' +
                ", Anio='" + anio + "\n";
    }



}
