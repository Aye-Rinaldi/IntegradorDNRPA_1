package ar.com.xeven;

public class Moto extends Automotor implements IVehiculoACombustion{

    public Moto(String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        super(competencia, propietario, uso, provincia, localidad, marca, modelo, anio);
    }
}
