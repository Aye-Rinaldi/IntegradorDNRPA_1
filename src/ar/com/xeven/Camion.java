package ar.com.xeven;

public class Camion extends Automotor implements IAutomotor{
    public Camion(String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        super(competencia, propietario, uso, provincia, localidad, marca, modelo, anio);
    }
}
