/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaprogramacion1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author luisd
 */
public class ProblemaProgramacion1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        double salariodependientes1, impuesto;
        InputStreamReader input = new InputStreamReader(System.in);// lo estuve estudiando para ver como funciona y creo que usar este metodo es interesante//
        BufferedReader teclado = new BufferedReader(input);
        System.out.println("digita el salario");
        salariodependientes1 = Double.valueOf(teclado.readLine());
        impuesto = 0.100 * salariodependientes1;
        System.out.println("impuesto" + impuesto);
        
    }

   
}
