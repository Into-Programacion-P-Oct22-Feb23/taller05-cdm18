/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero_dias;
        double precio_diario;
        double subtotal;
        double total;
        double descuento;

        System.out.println("Por cuantos dias planea quedarse: ");
        numero_dias = entrada.nextInt();

        System.out.println("Cuanto cuesta diariamente su habitacion?: ");
        precio_diario = entrada.nextDouble();

        subtotal = numero_dias * precio_diario;
        total = subtotal;
        descuento = 0;

        if (numero_dias > 5 && numero_dias < 11) {
            descuento = (numero_dias * precio_diario) * 0.10;
            subtotal = numero_dias * precio_diario;
            total = subtotal - descuento;

        }
        if (numero_dias > 10 && numero_dias < 16) {
            descuento = (numero_dias * precio_diario) * 0.15;
            subtotal = numero_dias * precio_diario;
            total = subtotal - descuento;
        }

        if (numero_dias > 15) {
            descuento = (numero_dias * precio_diario) * 0.20;
            subtotal = numero_dias * precio_diario;
            total = subtotal - descuento;
            
        }
        System.out.println("El subtotal es: " + subtotal);
        System.out.println("Su descuento es de: " + "$" +  descuento + " " +
                "porque su estancia es de " + numero_dias + " " + "dias");
        System.out.println("El total es: " + total);
                
    }
}
