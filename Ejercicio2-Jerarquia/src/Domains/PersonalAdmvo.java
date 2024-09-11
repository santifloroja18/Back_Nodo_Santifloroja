package Domains;

import Domains.Abstracts.Asalariado;


public class PersonalAdmvo extends Asalariado {

    public PersonalAdmvo(String name, String lastname, double salary){
        super(name, lastname, salary);
    }

    @Override
    public void calculateSalary(){}
}
