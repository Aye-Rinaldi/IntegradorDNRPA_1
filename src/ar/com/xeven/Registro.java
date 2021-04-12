package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Registro {
    //atributos
    private List<Automotor> automotores = new ArrayList<>();

    //constructores
    public Registro(List<Automotor> automotores) {
        this.automotores = automotores;
    }

    public Registro() {
    }

    //getters y setters
    public List<Automotor> getAutomotores() {
        return automotores;
    }

    public void setAutomotores(List<Automotor> automotores) {
        this.automotores = automotores;
    }

    //metodos
    public void agregarAutomor(Automotor automotor){
        automotores.add(automotor);
    }


    public void agregarMuchosAutomotores(){
        agregarAutomor(new Auto("Auto",new Persona("Adolfo",12345678,"Marcelo T de Alvear"),Uso.PARTICULAR,"Cordoba","Capital","Ford","AZ","2015"));
        agregarAutomor(new Auto("Auto",new Persona("Margaret",23456789,"Buenos Aires 220"),Uso.PARTICULAR,"Cordoba","La Falda","Fiat","XX","2020"));
        agregarAutomor(new Auto("Auto",new Persona("Carolina",345678910,"Laprida 40"),Uso.PROFESIONAL,"Cordoba","Capital","Peugeot","88","2017"));
        agregarAutomor(new Camion("Camion",new Persona("Ramiro",45678910,"Illia 36"),Uso.PROFESIONAL,"Cordoba","Carlos Paz","Scania","47","2020"));
        agregarAutomor(new Camion("Camion",new Persona("Carlos",45678910,"San Martin 460"),Uso.PROFESIONAL,"Cordoba","Carlos Paz","Scania","47","2020"));
    }

    //Lista de todos los automotores
    public void listarAutomotores(Automotor automotor){
        /*
        imprime todosssss
        for (Automotor a:automotores)
            System.out.println(a);
         */
        System.out.println(automotor); //solo imprime el objeto que paso por parametro
    }

    //Lista segun tipo de automotor que desee verr
    /*
    public void listaTipoAutomotor(String automotor){
        List<Automotor> listaAutomotores = null;
        for (Automotor au:automotores){
            if (au.getClass().getSimpleName().equals("automotor")){
                Auto a = (Auto) au;
                listaAutomotores.add(a);
                System.out.println(listaAutomotores);
            }


        }

    }

     */


    public void listarAutos(){
        for (Automotor au:automotores){
            if (au instanceof Auto){
                Auto auto = (Auto) au;
                listarAutomotores(auto);
            }

        }
    }













}
