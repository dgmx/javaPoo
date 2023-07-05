package poo;

public class SmartWatch extends SmartDevice{

    boolean watch;
    String correa;


    public SmartWatch(){

    }
    public SmartWatch(String os, String osVersion, String fabricante, String model,
                      double peso, double pantalla, String procesador, int memoria, boolean watch, String correa) {

        this.watch=watch;
        this.correa=correa;

        super.os = os;
        super.osVersion = osVersion;
        super.fabricante = fabricante;
        super.model = model;
        super.peso = peso;
        super.pantalla = pantalla;
        super.procesador = procesador;
        super.memoria = memoria;
    }
}
