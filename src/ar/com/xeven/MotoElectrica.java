package ar.com.xeven;

public class MotoElectrica extends Automotor implements IVehiculoElectrico{

    public MotoElectrica(Integer idCP,String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        super(idCP,competencia, propietario, uso, provincia, localidad, marca, modelo, anio);
    }

    public MotoElectrica() {
    }

    public MotoElectrica(Integer idCP,Patente patente, String competencia, Persona propietario, String provincia, String localidad) {
        super(idCP,patente, competencia, propietario, provincia, localidad);
    }
}

