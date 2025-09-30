/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg25550909_examen_1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int natacion,ciclismo,carrera,tiempo;
        System.out.println("cuanto tiempo hicistes en natacion");
       natacion= captu.nextInt();
        System.out.println("cuanto tiempo hicistes en ciclismo");
       ciclismo= captu.nextInt();
          System.out.println("cuanto tiempo hicistes en carrera");
         carrera= captu.nextInt();
               tiempo=natacion+ciclismo+carrera;
         System.out.println("El tiempo total es :");
            tiempo= captu.nextInt();      
          if(tiempo <120 || tiempo <60 ){
          System.out.println("Calificacion :Excelente");
          }else if(tiempo <150 || tiempo <70){
               System.out.println("Calificacion :Buena");
          }else{
          System.out.println("Calificacion:Regular");
          }
          
    }
    
}
