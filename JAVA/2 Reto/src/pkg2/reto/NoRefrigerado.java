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
public class NoRefrigerado extends Producto {

    public String pais;

    public NoRefrigerado(String pais, String refrigerado, String cantidad, String costo, String codigo) {
        super(refrigerado, cantidad, costo, codigo);
        this.pais = pais;
    }


    @Override
    public String toString(){
        return "\tProducto " + nombre + " - " + "Código: " + codigo + "\n" +
        "\tcosto: " + costo + " pesos" + "\n" +
        "\tcantidad: " + cantidad + "\n" +
        "\tpaís: " + pais ;

    }

}