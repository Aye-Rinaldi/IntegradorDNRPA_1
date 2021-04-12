package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

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


        //1) Listar todos los autos registrados en todas las seccionales


        List<IAutomotor> automotores = new ArrayList<>();

        for (IAutomotor a:automotores){
            if (a instanceof Auto) {
                Auto au = (Auto) a;
                au.agregarMuchosAutomotores();
                au.listarAutomotores();

            }
        }




    }

}
