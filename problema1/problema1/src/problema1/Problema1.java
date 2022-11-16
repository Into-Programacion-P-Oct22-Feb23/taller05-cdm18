/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costo_kv;
        double kv_consumidos;
        double valor_descuento;
        double total;
        int edad;

        System.out.println("¿Cual es el costo del kv/h?");
        costo_kv = entrada.nextDouble();

        System.out.println("¿Cuantos kv ha consumido en el mes?");
        kv_consumidos = entrada.nextDouble();

        System.out.println("¿Cual es su edad?");
        edad = entrada.nextInt();

        total = costo_kv * kv_consumidos;

        if (edad > 65) {
            valor_descuento = total * 0.10;
            total = total - valor_descuento;
       
        }

        System.out.println("El valor de su planilla es: " + total );

    }

}
