package ar.com.xeven;

public class Camion extends Automotor {
    public Camion(Integer idCP,String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        super(idCP,competencia, propietario, uso, provincia, localidad, marca, modelo, anio);
    }
}
