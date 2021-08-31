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
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.List;


public class Reto3 {

    public static void main(String[] args) {
        grupos ej1=new grupos();
        ArrayList<String> list = new ArrayList<>();
        list.add("pantalon");
        list.add("falda");
        list.add("pantalon");
        list.add("vestido");
        list.add("blusa");
        list.add("sudadera");
        list.add("pantalon");
        list.add("falda");
        list.add("falda");
        System.out.println(grupos.grupos(list));

        faltantes ej2=new faltantes();
        ArrayList<Integer> gp1 = new ArrayList<>();
        ArrayList<String> gp2 = new ArrayList<String>();
        String gp3;
        gp1.add(2);
        gp1.add(3);
        gp1.add(6);
        gp1.add(8);
        
        gp2.add("pantalon");
        gp2.add("falda");
        gp2.add("pantalon");
        gp2.add("vestido");
        gp2.add("blusa");
        gp2.add("sudadera");
        gp2.add("pantalon");
        gp2.add("falda");
        gp2.add("pantalón");
        gp2.add("vestido");
        
        gp3 = "pantalon";
       System.out.println(faltantes.faltantes(gp1,gp2,gp3));
       
       
        inexistentes ej3=new inexistentes();  
        ArrayList<String> cd1 = new ArrayList<>();
        ArrayList<String> cd2 = new ArrayList<>();
        cd1.add("3");
        cd1.add("5");
        cd1.add("7");
        cd1.add("10");
        cd1.add("15");
        cd1.add("16");
        
        cd2.add("4");
        cd2.add("10");
        cd2.add("5");
        cd2.add("8");
        
        System.out.println(inexistentes.inexistentes(cd1,cd2));

        trueque ej4=new trueque();
        ArrayList<String> tr1 = new ArrayList<>();
        ArrayList<String> tr2 = new ArrayList<>();
        
        tr1.add("3");
        tr1.add("5");
        tr1.add("7");
        tr1.add("10");
        tr1.add("15");
        tr1.add("16");
        
        tr2.add("4");
        tr2.add("10");
        tr2.add("5");
        tr2.add("8");
        
        System.out.println(trueque.trueque(tr1,tr2));
        
    
    }
    
}
