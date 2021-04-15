package ar.com.xeven;

import java.time.LocalDate;

public class Auto extends Automotor implements IVehiculoACombustion{


    public Auto(Integer idCP,Patente patente,String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        super(idCP,
                patente,
                competencia,
                propietario,
                uso,
                provincia,
                localidad,
                marca,
                modelo,
                anio);
    }

    public Auto() {
    }

    public Auto(Integer idCP,Patente patente, String competencia, Persona propietario, String provincia, String localidad) {
        super(idCP,patente, competencia, propietario, provincia, localidad);
    }

    public Auto(Integer idCP, LocalDate fechaAltaAutomotor, Patente patente, Persona propietario, LocalDate fechaCambioPropiet, Uso uso) {
        super(idCP, fechaAltaAutomotor, patente, propietario, fechaCambioPropiet, uso);
    }

    public Auto(Patente patente) {
    }

    @Override
    public void rendimiento() {
        System.out.println("El rendimiento del auto es de 18 Km/L");
    }
}
