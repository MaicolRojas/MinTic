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

public class grupos {
     public static ArrayList<String> grupos(ArrayList<String> l){
         
       ArrayList<String> newList = new ArrayList<>();
      for(int i = 0; i < l.size(); i++){
        
          if(newList.contains(l.get(i)) == false){
          
              newList.add(l.get(i)); 
          }
      }
       return newList;
   }
}