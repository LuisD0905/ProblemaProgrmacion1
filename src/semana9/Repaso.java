package semana9;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAVID
 */
public class Repaso {

    double tasa = 10d;

    public double calcularImpuesto(int numDependientes, double salario, double taza) {
        double retorno=-1;//se inicia un valor
        retorno= salario*taza;
        retorno=retorno/numDependientes;//logica aplicada en el programa.
        return retorno;
    }

    public void calcularImpuesto() {

    }
}
