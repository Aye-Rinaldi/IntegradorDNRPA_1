package ar.com.xeven;

import java.sql.SQLOutput;
import java.util.Random;

public class Patente {

    //atributos
    private String primerasDosLetras;
    private String segundosNumeros;
    private String tercerasDosLetras;


    public Patente(){
        this.primerasDosLetras = generarPrimerasDosLetras();
        this.segundosNumeros = generarSegundosNumeros();
        this.tercerasDosLetras = generarUltimasDosLetras();
    }

    //AGREGAR PATENTES A MANO
    public Patente(String primerasDosLetras, String segundosNumeros, String tercerasDosLetras) {
        this.primerasDosLetras = primerasDosLetras;
        this.segundosNumeros = segundosNumeros;
        this.tercerasDosLetras = tercerasDosLetras;
    }

    //getters y setters
    public String getPrimerasDosLetras() {
        return primerasDosLetras;
    }

    public void setPrimerasDosLetras(String primerasDosLetras) {
        this.primerasDosLetras = primerasDosLetras;
    }

    public String getSegundosNumeros() {
        return segundosNumeros;
    }

    public void setSegundosNumeros(String segundosNumeros) {
        this.segundosNumeros = segundosNumeros;
    }

    public String getTercerasDosLetras() {
        return tercerasDosLetras;
    }

    public void setTercerasDosLetras(String tercerasDosLetras) {
        this.tercerasDosLetras = tercerasDosLetras;
    }

    private String generarPrimerasDosLetras() {
        String letrasAbc = new String("ABC");
        Random r = new Random();
        byte primerLetra = (byte) r.nextInt(2); //castea a byte el numero
        byte segLetra = (byte) r.nextInt(2);
        System.out.print(letrasAbc.charAt(primerLetra)); //convierte el byte en letra a,b o c
        System.out.print(letrasAbc.charAt(segLetra));
        return primerasDosLetras;
    }

    private String generarSegundosNumeros() {
        String numeros = new String("0123456789");
        Random r = new Random();
        byte num1 = (byte) r.nextInt(9);
        byte num2 = (byte) r.nextInt(9);
        byte num3 = (byte) r.nextInt(9);
        System.out.print("-"+numeros.charAt(num1));
        System.out.print(numeros.charAt(num2));
        System.out.print(numeros.charAt(num3)+"-");
        return segundosNumeros;
    }

    private String generarUltimasDosLetras() {
        String letrasAZ = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        Random r = new Random();
        byte primerLetra = (byte) r.nextInt(letrasAZ.length()-1);
        byte segLetra = (byte) r.nextInt(letrasAZ.length()-1);
        System.out.print(letrasAZ.charAt(primerLetra));
        System.out.print(letrasAZ.charAt(segLetra)+"\n");
        return tercerasDosLetras;

    }

    @Override
    public String toString() {
        return "Patente{"+primerasDosLetras+"-"+segundosNumeros+"-"+tercerasDosLetras+
                '}';
    }


}

