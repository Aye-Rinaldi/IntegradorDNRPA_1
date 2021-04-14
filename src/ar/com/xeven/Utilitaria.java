package ar.com.xeven;

public class Utilitaria {

   public static boolean validarString(String texto,int maximo){
       return texto.length()<=maximo;
   }

   public static boolean validarDni(int numero){
       return String.valueOf(numero).length()!=8;
   }
}
