/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
        double costo;
        double impuesto;
        double precio_venta;
        // double impuesto_a_pagar;

        System.out.println("Cual es la marca del automovil a comprar: ");
        marca = entrada.nextLine();

        System.out.println("Cual es el origen del automovil a comprar : ");
        origen = entrada.nextLine();

        System.out.println("Cual es el costo del automovil a comprar : ");
        costo = entrada.nextDouble();

        /*
        Elaborar una solución que permita leer los datos de un automóvil (marca, origen y costo)
        imprima el impuesto por pagar y el precio de venta (incluido el impuesto). 
        Si el origen es Alemania el impuesto es 20%, 
        si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8% 
        
         */
 /*
        subtotal = numero_dias * precio_diario;
        total = subtotal;
        descuento = 0;
         */
        if ("Alemania".equals(origen) || "alemania".equals(origen)
                || "Aleman".equals(origen) || "aleman".equals(origen)) {
            impuesto = costo * 0.20;
            precio_venta = costo + impuesto;
            System.out.printf("La marca del vehiculo deseado es: %s\n"
                    + "Su origen es: %s\n" + "Su costo es de: %.2f\n", marca,
                    origen, costo);
            System.out.printf("El impuesto por pagar es: %f\n"
                    + "El precio de venta del vehiculo es: %.2f\n", impuesto,
                    precio_venta);

        } else {
            System.out.println("Origen no valido");
        }

        if ("Japon".equals(origen) || "japon".equals(origen)
                || "japones".equals(origen) || "Japones".equals(origen)) {
            impuesto = costo * 0.30;
            precio_venta = costo + impuesto;
            System.out.printf("La marca del vehiculo deseado es: %s\n"
                    + "Su origen es: %s\n" + "Su costo es de: %.2f\n", marca,
                    origen, costo);
            System.out.printf("El impuesto por pagar es: %f\n"
                    + "El precio de venta del vehiculo es: %.2f\n", impuesto,
                    precio_venta);

        } else {
            System.out.println("Origen no valido");
        }

        if ("Italia".equals(origen) || "italia".equals(origen)
                || "italiano".equals(origen) || "Italiano".equals
        (origen)) {
            impuesto = costo * 0.15;
            precio_venta = costo + impuesto;
            System.out.printf("La marca del vehiculo deseado es: %s\n"
                    + "Su origen es: %s\n" + "Su costo es de: %.2f\n", marca,
                    origen, costo);
            System.out.printf("El impuesto por pagar es: %f\n"
                    + "El precio de venta del vehiculo es: %.2f\n", impuesto,
                    precio_venta);
        } else {
            System.out.println("Origen no valido");
        }

        if ("USA".equals(origen) || "usa".equals(origen)
                || "Americano".equals(origen) || "americano".equals
        (origen)) {
            impuesto = costo * 0.08;
            precio_venta = costo + impuesto;
            System.out.printf("La marca del vehiculo deseado es: %s\n"
                    + "Su origen es: %s\n" + "Su costo es de: %.2f\n", marca,
                    origen, costo);
            System.out.printf("El impuesto por pagar es: %f\n"
                    + "El precio de venta del vehiculo es: %.2f\n", impuesto,
                    precio_venta);

        } else {
            System.out.println("Origen no valido");
        }

    }
}
