package ar.com.xeven;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Dnrpa {
    //atributos
    protected List<Registro> registrosSeccionales = new ArrayList<>();
    private int idCp = 1;
    private List<Automotor> todosLosAutomotores = new ArrayList<>();
    private List<Automotor> losCamiones = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Integer opcion;
    private Automotor automotor1;
    private LocalDate fechaHoy = LocalDate.now();


    public Dnrpa() {
    }


    public void menu() throws DatosIncorrectosException {

        System.out.println("\n\nBIENVENIDO A LA DIRECCION NACIONAL DE REGISTRO PROPIEDAD DEL AUTOMOTOR");
        System.out.println("===========================================================================");

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println();
            System.out.println("1.Listado de todos los automotores registrados en todos los registros del pais");
            System.out.println("2.Listado de todos los autos registrados en todas las seccionales.");
            System.out.println("3.Listado de todos los propietarios de camiones en orden alfabetico.");
            System.out.println("4.Gestion para cambiar de propietario");
            System.out.println("5.Alta de automotor");
            System.out.println("0.Salir");
            System.out.print("Introduzca una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion){

                case 1:
                    System.out.println("\n***Listado de todos los automotores registrados en total***");
                    System.out.println(todosLosAutomotores);
                case 2:
                    System.out.println("\n***Listado de todos los autos registrados***");
                    System.out.println();
                    agregarMuchosAutomotores();
                    agregarAutomotoresPrueba();
                    listarAutos();
                    break;
                case 3:
                    System.out.println("\n***Listado de todos los propietarios de camiones en orden alfabetico***");
                    System.out.println();
                    agregarMuchosAutomotores();
                    listarCamiones();
                    break;
                case 4:
                    System.out.println("\n***Gestion de cambio  de propietario***");
                    cambiarElPropietario();
                    break;
                case 5:
                    System.out.println("\n***Dar de alta un automotor***");


                    break;
                default:
                    System.out.println("Introduzca una opcion correcta");
                    darAltaAutomotor();
                    break;


            }


        } while (opcion != 0);

    }


    //creo registros seccionales
    private Registro nuevoRegistroReccional(){
        Registro registro = new Registro(idCp);
        idCp++;
        return registro;
    }

    //agrego registros seccionales
    private void agregarRegistrosSeccionales(Registro registro){
        registrosSeccionales.add(registro);
    }

    private List<Registro> getRegistrosSeccionales() {
        return registrosSeccionales;
    }

    //cant de registros
    private Integer cantidadRegistros(){
        return registrosSeccionales.size();
    }


    //metodos
    public void agregarAutomor(Automotor automotor){
        todosLosAutomotores.add(automotor);
    }


    public void agregarMuchosAutomotores(){
        agregarAutomor(new Auto(5000,new Patente(),"Auto",new Persona("Adolfo",12345678,"Marcelo T de Alvear"),Uso.PARTICULAR,"Cordoba","Capital","Ford","AZ","2015"));
        agregarAutomor(new Auto(4500,new Patente(),"Auto",new Persona("Margaret",23456789,"Buenos Aires 220"),Uso.PARTICULAR,"Cordoba","La Falda","Fiat","XX","2020"));
        agregarAutomor(new Auto(4000,new Patente(),"Auto",new Persona("Carolina",345678910,"Laprida 40"),Uso.PROFESIONAL,"Cordoba","Capital","Peugeot","88","2017"));
        agregarAutomor(new Camion(4200,new Patente(),"Camion",new Persona("Ramiro",45678910,"Illia 36"),Uso.PROFESIONAL,"Cordoba","Carlos Paz","Scania","47","2020"));
        agregarAutomor(new Camion(4200,new Patente(),"Camion",new Persona("Carlos",45678910,"San Martin 460"),Uso.PROFESIONAL,"Cordoba","Carlos Paz","Scania","47","2020"));

    }

    public void agregarAutomotoresPrueba(){
        agregarAutomor(new Auto(2800,new Patente(),"Auto",new Persona("Charles",10111212,"Colon 200"),"Cordoba","La Falda"));
        agregarAutomor(new Auto(2700,new Patente(),"Auto",new Persona("Ann",12131415,"Achaval Rodriguez 40"),"Cordoba","La Calera"));
        agregarAutomor(new Auto(2600,new Patente("AA","123","BB"),"Auto",new Persona("Alice",574185,"una Direccion"),"Cordoba","Capital"));
        agregarAutomor(new Auto(1800,new Patente("BA","456","Z8"),"Auto",new Persona("Alice",574185,"una Direccion"),"Cordoba","Capital"));
    }

    public void listarTodosLosAutomotores(){
        for (Automotor automotor:todosLosAutomotores)
            System.out.println(todosLosAutomotores);
    }



    //Lista de todos los automotores
    public void listarAutomotores(Automotor automotor){
        System.out.println(automotor); //solo imprime el objeto que paso por parametro
    }


    public void listarAutos(){
        for (Automotor au:todosLosAutomotores){
            if (au instanceof Auto){
                Auto auto = (Auto) au;
                listarAutomotores(auto);
            }

        }
    }

    //CAMIONES
    public void agregarCamion(Automotor automotor){
        losCamiones.add(automotor);
    }

    public void listarCamiones(){
        for (Automotor au:todosLosAutomotores){
            if (au instanceof Camion){
                Camion camion = (Camion) au;
                agregarCamion(camion);
            }
        }
        System.out.println("Listado de todos los propietarios de camiones: ");
        Collections.sort(losCamiones, (p1, p2) -> p1.getPropietario().getNombre().compareTo(p2.getPropietario().getNombre()));

        for (Automotor camion:losCamiones){
            listarAutomotores(camion);
        }
    }

    public void cambiarElPropietario() throws DatosIncorrectosException {
        Scanner scanner = new Scanner(System.in);
        boolean isPatente = false;
        System.out.print("Digite la patente: ");
        String patente = scanner.nextLine();
        if (validarPatente(patente)) {
            System.out.println("Formato patente correcta");
        } else {
            throw new DatosIncorrectosException("Formato de patente incorrecto");
        }

        for (Automotor automotor1:todosLosAutomotores){

            if (automotor1.getPatente().equals(patente)){
                isPatente = true;

                System.out.print("Digite el nuevo nombre del propietario: ");
                String nombreNuevo = scanner.nextLine();

                System.out.print("Digite la direccion del nuevo propietario: ");
                String direNueva = scanner.nextLine();

                System.out.print("Digite el nuevo DNI: ");
                int nuevoDni = scanner.nextInt();


                if (pasoUnAnio(automotor1.fechaCambioPropiet)){
                    System.out.println("No se puede cambiar de propietario, porque aun no ha pasado un año desde el ultimo cambio");
                } else {
                    automotor1.getPropietario().setNombre(nombreNuevo);
                    automotor1.getPropietario().setDni(nuevoDni);
                    automotor1.getPropietario().setDireccion(direNueva);
                    automotor1.setFechaCambioPropiet(LocalDate.now());
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

    private boolean pasoUnAnio(LocalDate fecha) {

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

    private void darAltaAutomotor(){
        System.out.print("Indique la denominacion del registro seccional donde va a dar de alta el automotor: ");
        String denominacion = sc.nextLine();

        System.out.print("Introduzco el codigo postal donde se encuentra el registro seccional: ");
        Integer codPostal = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese el nombre del propietario del automotor: ");
        String nombrePropietario = sc.nextLine();


        System.out.print("Ingrese la provincia donde se encuentra el registro: ");
        String provincia = sc.nextLine();

        System.out.print("Ingrese la localidad: ");
        String localidad = sc.nextLine();

        System.out.print("Indique que uso le va a dar: ");
        Uso uso = Uso.valueOf(sc.nextLine());



        Boolean registrado = true;

        do {
            System.out.println("Ingrese el tipo de automotor que desea dar de alta: ");
            System.out.println("1.Auto");
            System.out.println("2.Auto electrico");
            System.out.println("3.Camion");
            System.out.println("4.Colectivo");
            System.out.println("5.Moto");
            System.out.println("6.Moto Electrica");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion){
                case 1:
                    automotor1 = new Auto(
                            codPostal,
                            fechaHoy,
                            new Patente(),
                            new Persona(nombrePropietario),
                            automotor1.getFechaCambioPropiet(),
                            uso);
                    registrado = false;
                    break;
                case 2:
                    automotor1 = new AutoElectrico(
                            codPostal,
                            fechaHoy,
                            new Patente(),
                            new Persona(nombrePropietario),
                            automotor1.getFechaCambioPropiet(),
                            uso
                    );
                    registrado = false;
                    break;
                case 3:
                    automotor1 = new Camion(
                            codPostal,
                            fechaHoy,
                            new Patente(),
                            new Persona(nombrePropietario),
                            automotor1.getFechaCambioPropiet(),
                            uso
                    );
                    registrado = false;
                    break;
                case 4:
                    automotor1 = new Colectivo(
                            codPostal,
                            fechaHoy,
                            new Patente(),
                            new Persona(nombrePropietario),
                            automotor1.getFechaCambioPropiet(),
                            uso
                    );
                    registrado = false;
                    break;
                case 5:
                    automotor1 = new Moto(
                            codPostal,
                            fechaHoy,
                            new Patente(),
                            new Persona(nombrePropietario),
                            automotor1.getFechaCambioPropiet(),
                            uso
                    );
                    registrado = false;
                    break;
                case 6:
                    automotor1 = new MotoElectrica(
                            codPostal,
                            fechaHoy,
                            new Patente(),
                            new Persona(nombrePropietario),
                            automotor1.getFechaCambioPropiet(),
                            uso
                    );
                    registrado = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
            }
        } while (registrado);

        todosLosAutomotores.add(automotor1);
        System.out.println("El automotor: "+automotor1.getClass().getSimpleName()+" ha sido dado de alta.");
    }


}
