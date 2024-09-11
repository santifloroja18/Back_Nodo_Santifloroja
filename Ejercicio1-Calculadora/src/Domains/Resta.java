package Domains;

import Domains.abstracts.Operacion;

public class Resta extends Operacion {


    public void operar(double number1, double number2){

        double resultadoResta = number1 - number2;

        System.out.println("El resultado de la resta es: " + resultadoResta);
    }
}
