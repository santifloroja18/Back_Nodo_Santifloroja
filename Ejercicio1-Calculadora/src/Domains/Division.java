package Domains;

import Domains.abstracts.Operacion;

public class Division extends Operacion {

    public void operar(double number1, double number2){

        double resultadoDivision = number1 / number2;

        System.out.println("El resultado de la división es: " + resultadoDivision);
    }
}
