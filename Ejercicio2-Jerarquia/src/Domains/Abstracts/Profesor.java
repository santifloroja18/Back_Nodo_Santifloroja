package Domains.Abstracts;

public abstract class Profesor extends Asalariado{

    private String salaryType;

    public Profesor(String name, String lastname, double salary, String salaryType){
        super(name, lastname, salary);
        this.salaryType = salaryType;
    }

    @Override
    public void calculateSalary(){}

}
