package poo;

public class SmartPhone extends SmartDevice{

    boolean phone;
    String operador;

    public SmartPhone(){

    }
    public SmartPhone(String os, String osVersion, String fabricante, String model,
                      double peso, double pantalla, String procesador, int memoria, boolean phone, String opeardor) {

        this.phone = phone;
        this.operador = opeardor;

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
