package Domains;

import Domains.abstracts.Operacion;

public class Suma extends Operacion {



    public void operar(double number1, double number2){

        double resultadoSuma = number1 + number2;

        System.out.println("El resultado de la suma es: " + resultadoSuma);
    }
}
