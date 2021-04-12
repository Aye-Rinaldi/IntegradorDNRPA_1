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

            System.out.println("5.Salir");
            System.out.print("Introduzca una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion){

                case 1:
                    System.out.println("\n***Listado de todos los autos registrados***");
                    System.out.println();
                    registro.agregarMuchosAutomotores();
                    registro.listarAutos();
                    break;
                default:


            }


        } while (opcion != 5);








    }

}
