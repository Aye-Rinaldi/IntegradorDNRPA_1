package ar.com.xeven;

import java.time.LocalDate;

public class AutoElectrico extends Automotor implements IVehiculoElectrico{

    public AutoElectrico(Integer idCP,Patente patente,String competencia, Persona propietario, Uso uso, String provincia, String localidad, String marca, String modelo, String anio) {
        super(idCP,patente,competencia, propietario, uso, provincia, localidad, marca, modelo, anio);
    }

    public AutoElectrico() {
    }

    public AutoElectrico(Integer idCP,Patente patente, String competencia, Persona propietario, String provincia, String localidad) {
        super(idCP,patente, competencia, propietario, provincia, localidad);
    }

    public AutoElectrico(Integer idCP, LocalDate fechaAltaAutomotor, Patente patente, Persona propietario, LocalDate fechaCambioPropiet, Uso uso) {
        super(idCP, fechaAltaAutomotor, patente, propietario, fechaCambioPropiet, uso);
    }

    @Override
    public void indicarVoltaje() {
        System.out.println("El volateje es de 400V(alto voltaje)");
    }

}

