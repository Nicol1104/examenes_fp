/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2_25550909;

import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class Examen2_25550909 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner captu = new Scanner (System.in);
          int num1,num2,num,fila,contador=0;
         System.out.println("Primer numero :");
         num1=captu.nextInt();
          System.out.println("Segundo numero:");
         num2=captu.nextInt();
    
    for(int i=num1;i<=num2;i++){
        int resi=i%2;
        if(resi==0)
             System.out.println(i+"-");
    }
    System.out.println("Escribe el numero");
        num=captu.nextInt();
          for(int i=1;i<=num;i++){//se utilizo for por que ya sabiamos los numeros que se iban a utilizar 
        if(num % i==0){
            contador++;
        }
    }
          if(contador == 2){
              System.out.println(num+"Es primo");
          }else{
              System.out.println(num+"No es primo");
          }
          System.out.println("Cuantas filas quieres que aparescan ");
        fila=captu.nextInt();
        System.out.println("simbolo "+fila+"Fila");
        do{
            for(int i=1; i<=num;i++){
                System.out.println("*");
            }
            System.out.println("");
            num++;
        }while(num<=fila);
        do{
              for(int i=1; i<=num;i++){
                System.out.println("*");
            }
            System.out.println("");
            num--;
        }while(num>=1);
    
    }
    
}
