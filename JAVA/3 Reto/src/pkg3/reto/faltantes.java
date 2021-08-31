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


public class faltantes {
    public static ArrayList<Integer> faltantes(ArrayList<Integer> cd1, ArrayList<String> cd2 , String cd3){
        String a = cd3;
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i = 0; i < cd2.size(); i++){
            for(int j = 0; j < cd1.size(); j++){
              if(cd2.get(i).equals(a) && cd1.get(j).equals(i)){
                  newList.add(i);
              }
            }
       
         
        }
    return newList;
  }
}