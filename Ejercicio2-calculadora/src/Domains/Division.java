package Domains;

import Domains.abstracts.Operacion;

public class Division extends Operacion {
    public Division(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double calcular() {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por 0");
        }
        return num1 / num2;
    }
}

