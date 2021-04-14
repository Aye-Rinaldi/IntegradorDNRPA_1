package ar.com.xeven;

public class Auto extends Automotor implements IVehiculoACombustion{


    public Auto(String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        super(competencia, propietario, uso, provincia, localidad, marca, modelo, anio);
    }

    public Auto() {
    }

    public Auto(Patente patente, String competencia, Persona propietario, String provincia, String localidad) {
        super(patente, competencia, propietario, provincia, localidad);
    }
}
