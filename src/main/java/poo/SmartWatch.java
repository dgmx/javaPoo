package poo;

public class SmartWatch extends SmartDevice{

    boolean watch;
    String correa;


    public SmartWatch(){

    }
    public SmartWatch(String os, String osVersion, String fabricante, String model,
                      double peso, double pantalla, String procesador, int memoria, boolean watch, String correa) {

        super(os, osVersion, fabricante, model, peso, pantalla, procesador, memoria);
        this.watch = watch;
        this.correa = correa;
    }
}
