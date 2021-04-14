package ar.com.xeven;

import java.security.AuthProvider;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Registro {
    //atributos
    private List<Automotor> automotores = new ArrayList<>();
    private List<Automotor> camiones = new ArrayList<>();

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

    public void agregarAutomotoresPrueba(){
        agregarAutomor(new Auto(new Patente(),"Auto",new Persona("Charles",10111212,"Colon 200"),"Cordoba","La Falda"));
        agregarAutomor(new Auto(new Patente(),"Auto",new Persona("Ann",12131415,"Achaval Rodriguez 40"),"Cordoba","La Calera"));


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


    public void listarAutos(){
        for (Automotor au:automotores){
            if (au instanceof Auto){
                Auto auto = (Auto) au;
                listarAutomotores(auto);
            }

        }
    }

    //CAMIONES
    public void agregarCamion(Automotor automotor){
        camiones.add(automotor);
    }

    public void listarCamiones(){
        for (Automotor au:automotores){
            if (au instanceof Camion){
                Camion camion = (Camion) au;
                agregarCamion(camion);
            }
        }
        System.out.println("Listado de todos los propietarios de camiones: ");
        Collections.sort(camiones, (p1,p2) -> p1.getPropietario().getNombre().compareTo(p2.getPropietario().getNombre()));

        for (Automotor camion:camiones){
            listarAutomotores(camion);
        }
    }

    public void cambiarElPropietario(Automotor automotor) throws DatosIncorrectosException {
        Scanner scanner = new Scanner(System.in);
        boolean isPatente = false;
        System.out.println("Digite la patente: ");
        String patente = scanner.nextLine();
        if (validarPatente(patente)) {
            System.out.println("Formato patente correcta");
        } else {
            throw new DatosIncorrectosException("Formato de patente incorrecto");
        }

        for (Automotor automotor1:getAutomotores()){

            if (automotor1.getPatente().equals(patente)){
                isPatente = true;
                System.out.print("Digite el nuevo nombre del propietario: ");
                String nombreNuevo = scanner.nextLine();

                if (pasoUnAnio()){
                    System.out.println("No se puede cambiar de propietario, porque aun no ha pasado un año desde el ultimo cammbio");
                } else {
                    automotor.getPropietario().setNombre(nombreNuevo);
                    System.out.print("Digite el nuevo DNI: ");
                    int nuevoDni = scanner.nextInt();
                    automotor.getPropietario().setDni(nuevoDni);
                    System.out.print("Digite la direccion del nuevo propietario: ");
                    String direNueva = scanner.nextLine();
                    String nuevaDireccion = "";
                    automotor.getPropietario().setDireccion(direNueva);
                    automotor.setFechaRegistroPropietario(LocalDate.now());
                    System.out.println("Se ha registrado correctado el cambio del nuevo propietario");

                }
            }
        }




    }

    private boolean validarPatente(String patente){
        if (patente.toString().matches("^[A-B-C]{2}[0-9]{3}[A-Z]{2}")) {
            System.out.println("Patente valida");
            return true;
        } else {
            System.out.println("Patente invalida");
            return false;
        }
    }

    private boolean pasoUnAnio() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el dia del ultimo registro de un propietario: ");
        int ultimoDia = sc.nextInt();
        System.out.print("Ingrese el mes del ultimo registro de un propietario: ");
        int ultimoMes = sc.nextInt();
        System.out.print("Ingrese el anio del ultimo registro de un propietario: ");
        int ultimoAnio = sc.nextInt();
        LocalDate fechaUltimoPropietario = LocalDate.of(ultimoAnio,ultimoMes,ultimoDia);
        LocalDate fechaHoy = LocalDate.now();

        Period periodo = Period.between(fechaUltimoPropietario,fechaHoy);

        int cantidadDeDias = periodo.getDays();

        return (cantidadDeDias>365) ? true : false;


    }


}
