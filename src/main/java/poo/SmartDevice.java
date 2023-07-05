package poo;

public abstract class SmartDevice {

    String os;
    String osVersion;
    String fabricante;
    String model;
    double peso;
    double pantalla;
    String procesador;
    int memoria;

    public SmartDevice() {
    }
    public SmartDevice(String os, String osVersion, String fabricante, String model, double peso, double pantalla, String procesador, int memoria) {
        this.os = os;
        this.osVersion = osVersion;
        this.fabricante = fabricante;
        this.model = model;
        this.peso = peso;
        this.pantalla = pantalla;
        this.procesador = procesador;
        this.memoria = memoria;
    }
}
