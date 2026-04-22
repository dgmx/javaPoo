package poo;

public class SmartPhone extends SmartDevice{

    boolean phone;
    String operador;

    public SmartPhone(){

    }
    public SmartPhone(String os, String osVersion, String fabricante, String model,
                      double peso, double pantalla, String procesador, int memoria, boolean phone, String operador) {

        super(os, osVersion, fabricante, model, peso, pantalla, procesador, memoria);
        this.phone = phone;
        this.operador = operador;
    }
}
