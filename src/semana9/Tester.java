package semana9;



import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAVID
 */
public class Tester {

    String NOMBRE_EMPRESA = "GALLITO";//para diferenciar una variable constante(sirve solo en las variables cnstantes) con otra.
    //Constantes siempremantienen un valor, con variables de configuracion.
    public static void main(String[] args) {
        Repaso repasohoy = new Repaso();//se puede sustituir por un "null" solo si es un dato complejo, y conecta la clase Repaso con la Tester.
        double impuestoPagar = repasohoy.calcularImpuesto(3, 1000000, 0.5);
       
        Scanner escaner=new Scanner(System.in);
        int sss=escaner.nextInt();
    }
}
