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

public class Refrigerado extends Producto {

    public String temperatura;

    public Refrigerado(String nombre, String cantidad, String costo, String codigo, String temperatura) {
        super(nombre, cantidad, costo, codigo);
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "\tProducto " + nombre + " - " + "Código: " + codigo + "\n" +
        "\tcosto: " + costo + " pesos" + "\n" +
        "\tcantidad: " + cantidad  + "\n" +
        "\ttemperatuta: " + temperatura + " grados centígrados" ;
    }
}