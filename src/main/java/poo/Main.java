package poo;

public class Main {
    public static void main(String[] args) {

        // nuevo SmartPhone
    SmartPhone iphone = new SmartPhone("ios","14.5","Apple","iphone 13", 300, 6.5, "A11", 64,true, "Movistar");

        // nuevo SmartWatch
    SmartWatch iwatch = new SmartWatch("iwos","3.5","Apple","iwatch 4", 300, 3, "A3", 16,true, "silicona");

        // Describimos los atributos del telefono movil
        System.out.println("Tu dispositivo es un:");
        System.out.println(iphone.fabricante + " " + iphone.model + " " + iphone.os + " " + iphone.osVersion);
        System.out.print("Es un reloj inteligentel? ");
        if (iphone.phone) {
            System.out.print("SI");
        }
        else {
            System.out.print("NO");
        }

        System.out.println();

        // Describimos los atributos del reloj inteligente

        System.out.println("Tu dispositivo es un:");
        System.out.println(iwatch.fabricante + " " + iwatch.model + " " + iwatch.os + " " + iwatch.osVersion);
        System.out.println("Tu operador de telefonia es: " + iphone.operador);
        System.out.print("Es un reloj inteligentel? ");
        if (iwatch.watch) {
            System.out.print("SI");
        }
            else {
                  System.out.print("NO");
            }

        System.out.println();
        System.out.println("La correa es de: " + iwatch.correa);
        }
}


