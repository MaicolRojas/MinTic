/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.reto;

/**
 *
 * @author Maicol
 */
import java.util.ArrayList;

public class trueque {
    
    public static Integer trueque(ArrayList<String> cd1, ArrayList<String> cd2){
        Integer j = 0;
         for (int i = 0; i < cd2.size(); i++) {
            if (!cd2.contains(cd1.get(i))) {
                j = j + 1;
            }
        }
         return j;
     }
}
