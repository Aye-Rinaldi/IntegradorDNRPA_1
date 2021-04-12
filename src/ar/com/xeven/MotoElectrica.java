package ar.com.xeven;

public class MotoElectrica extends Automotor implements IVehiculoElectrico{

    public MotoElectrica(String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        super(competencia, propietario, uso, provincia, localidad, marca, modelo, anio);
    }
}

