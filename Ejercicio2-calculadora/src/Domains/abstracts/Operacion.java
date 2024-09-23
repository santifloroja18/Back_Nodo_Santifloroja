package Domains.abstracts;

public abstract class Operacion {
    protected double num1;
    protected double num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Método abstracto para realizar la operación
    public abstract double calcular();
}
