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
public class Producto {

    public String nombre;
    public String cantidad;
    public String costo;
    public String codigo;


    public Producto(String nombre, String cantidad, String costo, String codigo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costo = costo;
        this.codigo = codigo;
    }
}