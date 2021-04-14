package ar.com.xeven;

public class Auto extends Automotor implements IVehiculoACombustion{


    public Auto(Integer idCP,String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        super(idCP,competencia, propietario, uso, provincia, localidad, marca, modelo, anio);
    }

    public Auto() {
    }

    public Auto(Integer idCP,Patente patente, String competencia, Persona propietario, String provincia, String localidad) {
        super(idCP,patente, competencia, propietario, provincia, localidad);
    }

    public Auto(Patente patente) {
    }
}
