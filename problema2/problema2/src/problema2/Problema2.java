/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costo;
        String articulo;
        int cantidad_requerida;
        double precio_u;
        double descuento;

        System.out.println("Ingresar el nombre del articulo");
        articulo = entrada.nextLine();

        System.out.println("Ingresar el precio unitario de: " + articulo);
        precio_u = entrada.nextDouble();

        System.out.println("Cuantos/as" + " " + articulo + " " + "va a llevar");
        cantidad_requerida = entrada.nextInt();

        costo = precio_u * cantidad_requerida;
        descuento = 0;

        if (cantidad_requerida > 50) {
            descuento = (precio_u * cantidad_requerida) * 0.15;
            costo = (precio_u * cantidad_requerida) - descuento;
            descuento = 15;

        }

        System.out.println("El costo de su pedido es: " + costo
                + " con un descuento del: " + descuento + "%");
    }

}
