package Domains;

import Domains.abstracts.Operacion;

public class Multiplicacion extends Operacion {

    public void operar(double number1, double number2){

        double resultadoMultiplicar = number1 * number2;

        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicar);
    }
}
