package ar.com.xeven;

public class Moto extends Automotor implements IVehiculoACombustion{

    public Moto(Integer idCP,String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        super(idCP,competencia, propietario, uso, provincia, localidad, marca, modelo, anio);
    }

    public Moto() {
    }

    public Moto(Integer idCP,Patente patente, String competencia, Persona propietario, String provincia, String localidad) {
        super(idCP,patente, competencia, propietario, provincia, localidad);
    }
}
