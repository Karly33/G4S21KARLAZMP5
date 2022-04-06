/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21karlazmp5;

import java.util.ArrayList;

/**
 *
 * @author KJS
 */
public class G4S21KARLAZMP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] arreglo = new int[]{1,4,6,7,8,9};
    int[] arreglo2 = new int[10];
    arreglo2[0]=110;
    arreglo2[1]=111;
    arreglo2[2]=112;
    arreglo2[3]=113;
    arreglo2[4]=114;
    arreglo2[5]=115;
    arreglo2[6]=116;
    arreglo2[7]=117;
    arreglo2[8]=118;
    arreglo2[9]=119;
    System.out.println("valor de la variable en la pocision 4 es:"+arreglo[4]);
    arreglo[3] = 10;
    System.out.println("valores del arreglo 2"); 
    int i=0;
    for(;;){
    System.out.println("arreglo2["+ i +"] = " +arreglo2[i]); 
    i++;
    if(i>arreglo2.length-1) break;
    }
    for(i=0;i<arreglo2.length;i++){
     System.out.println("arreglo2["+i+"]= "+arreglo2[i]);
    }
    ArrayList<Integer>objLista = new ArrayList<Integer>();
    objLista.add(15);
    objLista.add(10);
    objLista.add(22);
    
    for(i=0;i<objLista.size();i++){
    System.out.println("valores de lista"+String.valueOf(objLista.get(i)));
    }
    
    }
    
    }
    
    

