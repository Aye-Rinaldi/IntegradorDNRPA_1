package ar.com.xeven;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.List;

public interface IAutomotor {


    default void agregarAutomor(IAutomotor automotor){
        List<IAutomotor> automotores = new ArrayList<>();
        automotores.add(automotor);
    }

    default void agregarMuchosAutomotores(){
        agregarAutomor(new Auto("Auto",new Persona("Adolfo",12345678,"Marcelo T de Alvear"),Uso.PARTICULAR,"Cordoba","Capital","Ford","AZ","2015"));
        agregarAutomor(new Auto("Auto",new Persona("Margaret",23456789,"Buenos Aires 220"),Uso.PARTICULAR,"Cordoba","La Falda","Fiat","XX","2020"));
        agregarAutomor(new Auto("Auto",new Persona("Carolina",345678910,"Laprida 40"),Uso.PROFESIONAL,"Cordoba","Capital","Peugeot","88","2017"));
        agregarAutomor(new Camion("Camion",new Persona("Ramiro",45678910,"Illia 36"),Uso.PROFESIONAL,"Cordoba","Carlos Paz","Scania","47","2020"));
        agregarAutomor(new Camion("Camion",new Persona("Carlos",45678910,"San Martin 460"),Uso.PROFESIONAL,"Cordoba","Carlos Paz","Scania","47","2020"));
    }



    default void listarAutomotores(){
        List<IAutomotor> automotores = new ArrayList<>();
        for (IAutomotor automotor:automotores)
            System.out.println(automotor);
    }
}
