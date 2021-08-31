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
import java.util.*;

            /*PLATAFORMAAAAAAAAAAAAAAAAAAAAAAAAAAA*/

 class Funcionalidad {
    
       public static ArrayList<String> grupos(ArrayList<String> l){
        String prendas="";
        for(String j:l){
            prendas+=j+",";
        }
        
        String replace = prendas.replace("[","");
        String replace1 =replace.replace("]", "");
        String replace2 =replace1.replace(" ", "");
        
        ArrayList<String> lista = new ArrayList<String>(Arrays.asList(replace2.split(",")));
        
        ArrayList<String> listaVacia = new ArrayList<String>();
                      
        for(int i=0; i<lista.size(); i++){
          if(listaVacia.contains(lista.get(i)) == false){
              listaVacia.add(lista.get(i));
          }
          }
        return listaVacia;

    }
                                                                            
    public static ArrayList<Integer> faltantes(ArrayList<Integer> codigos, ArrayList<String> clases,String articulo){
        ArrayList<Integer> result = new ArrayList<Integer>();
    
        for(int i=0;i<codigos.size();i++){      
               if(clases.get((int)codigos.get(i)).equals(articulo)==true){
                    result.add((int)codigos.get(i));
                }  
            }
        return result;  
    }
    
    public static ArrayList<String> inexistentes (ArrayList<String> modaSport, ArrayList<String> estudioH){
        ArrayList<String> newlist = new ArrayList<String>();

        for(int i=0;i<modaSport.size();i++){          
            if(estudioH.contains(modaSport.get(i))==false){
                   newlist.add(modaSport.get(i));
            }   
        }
        return newlist;
    }
    
    public static String trueque(ArrayList<String> lista1, ArrayList<String> lista2) {

		int contadorH = 0;
		int contadorM = 0;

		for (int i = 0; i < lista1.size(); i++) {

			if (!lista2.contains(lista1.get(i))) {
				contadorH += 1;
			}

		}

		for (int i = 0; i < lista2.size(); i++) {

			if (!lista1.contains(lista2.get(i))) {
				contadorM += 1;
			}

		}

		if (contadorH > contadorM) {
			return contadorM+"";
		} else {
			return contadorH+"";
		}

	}
    
  
  
      
    }

