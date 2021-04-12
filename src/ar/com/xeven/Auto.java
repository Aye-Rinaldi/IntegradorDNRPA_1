package ar.com.xeven;

public class Auto extends Automotor implements IAutomotor, IVehiculoACombustion{


    public Auto(String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        super(competencia, propietario, uso, provincia, localidad, marca, modelo, anio);
    }

    public Auto() {
    }

    public void agregarMuchosAutomotores() {
    }
}
