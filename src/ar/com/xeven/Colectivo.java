package ar.com.xeven;

public class Colectivo extends Automotor implements IVehiculoACombustion{

    public Colectivo(String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        super(competencia, propietario, uso, provincia, localidad, marca, modelo, anio);
    }

    public Colectivo() {
    }

    public Colectivo(Patente patente, String competencia, Persona propietario, String provincia, String localidad) {
        super(patente, competencia, propietario, provincia, localidad);
    }
}
