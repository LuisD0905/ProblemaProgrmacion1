/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8l;

/**
 *
 * @author DAVID
 */
public class Casting {
       public static void main(String[] args) {
        int a = 50000;
        short b = 32767;
        System.out.println("Valor de a= " + a);
        System.out.println("Valor de b= " + b);
        
        b=(short)a;
        System.out.println("Valor de a= " + b);
         double rey= 100;
         float reina= 200;
         System.out.println("Valor de rey= "+rey);
         System.out.println("Valor de reina= "+reina);
         reina= (float)rey;
         System.out.println("Valor del rey= "+ reina);
    }
    
}
