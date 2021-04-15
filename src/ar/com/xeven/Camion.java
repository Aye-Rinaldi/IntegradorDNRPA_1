package ar.com.xeven;

import java.time.LocalDate;

public class Camion extends Automotor {
    public Camion(Integer idCP,Patente patente,String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        super(idCP,patente,competencia, propietario, uso, provincia, localidad, marca, modelo, anio);
    }

    public Camion() {
    }

    public Camion(Integer idCP, Patente patente, String competencia, Persona propietario, String provincia, String localidad) {
        super(idCP, patente, competencia, propietario, provincia, localidad);
    }

    public Camion(Integer idCP, LocalDate fechaAltaAutomotor, Patente patente, Persona propietario, LocalDate fechaCambioPropiet, Uso uso) {
        super(idCP, fechaAltaAutomotor, patente, propietario, fechaCambioPropiet, uso);
    }

}
