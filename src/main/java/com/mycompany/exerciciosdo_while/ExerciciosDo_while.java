

package com.mycompany.exerciciosdo_while;

import java.util.Scanner;

/**
 *
 * @author Alexsandre
 */
public class ExerciciosDo_while {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Atividade 1\n\n");
        System.out.println("Escreva um número limite que vai aparecer quais são ímpares e quais são pares:");
       int pares = 0;
   
        int num1 = teclado.nextInt();
       int nm1 = 0;
       do{
         
         
           if(nm1 % 2 == 0){
               
               System.out.printf("%d é par\n",nm1);
                
           }
           else{
               System.out.println(nm1 +" é impar");
           }
           
           nm1 ++;
           
           
           
       }
        while(nm1 <= num1);
      
 ///////////////////////////////////////////////////////////////////////////////////////////////       
         
        Scanner teclado2 = new Scanner(System.in);
       
        System.out.println("\nAtividade 2 \n\n");
        int soma1 = 0;
        System.out.println("Digite um número inteiro positivo:");
        int num2 = teclado2.nextInt();
        
        do{
           
            System.out.println(num2);
         
            soma1 += num2;
             num2 --;
        }
        while(num2 > 0);
         System.out.println("A soma da sequencia é: "+ soma1);
 
         /////////////////////////////////////////////////////////////////////////////////////
         
         Scanner teclado3 = new Scanner(System.in);
         System.out.println("\nAtividade 3\n\n");
           System.out.println("Escreva um número inteiro positivo:");
         int num3 = teclado3.nextInt();
      
         int nm3 = 1;
         
      
        
         System.out.printf("A tabuada do %d é:\n",num3);
         do{
              
             if (num3 < 0){
                 System.out.println("Número inválido");
                 
             }
             else{
                 System.out.println(num3 * 0);
             System.out.println(num3 * 1);
              System.out.println(num3 * 2);
               System.out.println(num3 * 3);
                System.out.println(num3 * 4);
                 System.out.println(num3 * 5);
                  System.out.println(num3 * 6);
                   System.out.println(num3 * 7);
                    System.out.println(num3 * 8);
                     System.out.println(num3 * 9);
                      System.out.println(num3 * 10);
                     
            }
            
         }
         while(nm3 <= 0 && nm3 >= 0 );
      

///////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\nAtividade 4\n\n");
        
        Scanner teclado4 = new Scanner(System.in);
        System.out.println("Escreva um número para determinar o limite de números primos que irá aparecer:");
        int num4 = teclado4.nextInt();
        int nm4 = 0;
        
        do{
            if(nm4 % 5 == 0){
                System.out.println(nm4 +" é primo");    
                
            }
            else{
                System.out.println(nm4 +" não é primo");
                
            }
            
            nm4 ++;
            
        }
        while(nm4 <= num4);
        
        
        
         
    }
}
