/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.reto;

/**
 *
 * @author Maicol
 */

import java.util.Scanner;
public class Reto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        int edad = entrada.nextInt();

        int total = (edad * 2) + 4;
        int total_2 = (edad + total) / 5;
      
        System.out.println(edad+" " +total+" " + total_2);
      
        if (total_2 > 0 & total_2 <= 20){
            System.out.println("Uno");
        }else if(total_2 > 20 & total_2 <=30){
            System.out.println("dos");
        }else if(total_2 > 30 & total_2 <= 50){
            System.out.println("tres");
        }else{
            System.out.println("cuatro");
        }
        
    }
    
}
