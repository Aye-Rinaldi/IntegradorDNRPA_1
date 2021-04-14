package ar.com.xeven;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dnrpa {



    public static void main(String[] args) {

        //List<Registro> registrosSeccionales = new ArrayList<>();
        //Auto a = new Auto();
        //Moto m = new Moto();
        //Colectivo cole = new Colectivo();
        // MotoElectrica me = new MotoElectrica();
        // AutoElectrico ae = new AutoElectrico();
        // Camion ca = new Camion();

        Registro registro = new Registro();

        //registro.agregarMuchosAutomotores();
        //registro.listarAutomotores();




        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n\nBIENVENIDO A LA DIRECCION NACIONAL DE REGISTRO PROPIEDAD DEL AUTOMOTOR");
            System.out.println("===========================================================================");
            System.out.println("1.Listado de todos los autos registrados en todas las seccionales.");
            System.out.println("2.Listado de todos los propietarios de camiones en orden alfabetico.");
            System.out.println("3.Gestion para cambiar de propietario");
            System.out.println("4.Alta de automotor");
            System.out.println("0.Salir");
            System.out.print("Introduzca una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion){

                case 1:
                    System.out.println("\n***Listado de todos los autos registrados***");
                    System.out.println();
                    registro.agregarMuchosAutomotores();
                    registro.listarAutos();
                    break;
                case 2:
                    System.out.println("\n***Listado de todos los propietarios de camiones en orden alfabetico***");
                    System.out.println();
                    registro.agregarMuchosAutomotores();
                    registro.listarCamiones();
                    break;
                case 3:
                    System.out.println("\n***Gestion de cambio  de propietario***");
                    Automotor automotor = null;
                    registro.cambiarElPropietario(automotor);
                    break;
                default:
                    System.out.println("Introduzca una opcion correcta");
                    break;


            }


        } while (opcion != 5);








    }



}
