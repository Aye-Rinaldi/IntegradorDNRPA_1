package ar.com.xeven;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Moto extends Automotor implements IVehiculoACombustion{

    public Moto(Integer idCP,Patente patente,String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        super(idCP,patente,competencia, propietario, uso, provincia, localidad, marca, modelo, anio);
    }

    public Moto() {
    }

    public Moto(Integer idCP,Patente patente, String competencia, Persona propietario, String provincia, String localidad) {
        super(idCP,patente, competencia, propietario, provincia, localidad);
    }

    public Moto(Integer idCP, LocalDate fechaAltaAutomotor, Patente patente, Persona propietario, LocalDate fechaCambioPropiet, Uso uso) {
        super(idCP, fechaAltaAutomotor, patente, propietario, fechaCambioPropiet, uso);
    }

    @Override
    public void rendimiento() {
        System.out.println("El rendimiento de la moto es de 10 km/L");
    }
}
