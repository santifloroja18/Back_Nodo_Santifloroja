package Domains.Abstracts;


public abstract class Asalariado extends Persona{

    private double salary;

    public Asalariado(String name, String lastname, double salary){
        super(name, lastname);
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    @Override
    protected void crearUsuario() {    }

    public abstract void calculateSalary();


}
