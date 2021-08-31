/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.reto;

/**
 *
 * @author Maicol
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tienda {

    private static final List<Producto> products = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            
            System.out.print("Ingrese la cadena y/o La opcion: ");
            String s = sc.nextLine();
            //String s = "1&Norefrigerado&3000&20000&230&EEUU";
            String[] line = s.split("&");
            int cod = Integer.parseInt(line[0]);
            int size = line.length;

            if (size > 1) {
                String nombre = line[1];
                String cantidad = line[2];
                String costo = line[3];
                String codigo = line[4];
                String temperatura = line[5];
                seleccionaropciones(cod, nombre, cantidad, costo, codigo, temperatura);
            } else {
                seleccionaropciones(cod, null, null, null, null, null);
            }
        }
    }

    public static void seleccionaropciones(int opc, String nombre, String cantidad, String costo, String codigo, String temperatura) {

        switch (opc) {
            case 1:
                if (nombre.equals("Refrigerado")) {
                    Refrigerado usu = new Refrigerado(nombre, cantidad, costo, codigo, temperatura);
                    products.add(usu);
                } else {
                    NoRefrigerado a = new NoRefrigerado(temperatura, nombre, cantidad, costo, codigo);
                    products.add(a);
                }
                break;
            case 2:
                System.out.println("***Inventario de productos***");
                for (Producto producto : products) {
                    System.out.println(producto);
                }
                break;

            case 3:
                System.exit(0);
                break;

        }

    }

}