package Services;

import Domains.Division;
import Domains.Multiplicacion;
import Domains.Resta;
import Domains.Suma;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Suma sumar = new Suma();
        Multiplicacion multiplicar = new Multiplicacion();
        Resta restar = new Resta();
        Division dividir = new Division();

        sumar.operar(4,8);
        multiplicar.operar(4,8);
        restar.operar(4,8);
        dividir.operar(4,8);
    }
}