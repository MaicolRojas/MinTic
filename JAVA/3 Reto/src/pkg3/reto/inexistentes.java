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

public class inexistentes {
    
     public static ArrayList<String> inexistentes(ArrayList<String> cd1, ArrayList<String> cd2){
        ArrayList<String> newList = new ArrayList<>();

         for (String a: cd1){
             if(!cd2.contains(a)){
                 newList.add(a);
             }
         }
        return newList;
     }
     
}

//
//public static ArrayList<Integer> inexistentes(ArrayList<Integer> cd1, ArrayList<Integer> cd2){
//        ArrayList<Integer> newList = new ArrayList<>();
//        
//        
//         for (int i = 0; i < cd1.size(); i++) {
//            if (!cd2.contains(cd1.get(i))) {
//                newList.add(cd1.get(i));
//            }
//        }
//         
//         return newList;
//     }