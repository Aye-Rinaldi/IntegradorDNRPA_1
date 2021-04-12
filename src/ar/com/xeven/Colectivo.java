package ar.com.xeven;

public class Colectivo extends Automotor implements IAutomotor,IVehiculoACombustion{

    public Colectivo(String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        super(competencia, propietario, uso, provincia, localidad, marca, modelo, anio);
    }
}
