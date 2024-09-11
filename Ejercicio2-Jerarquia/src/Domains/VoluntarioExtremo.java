package Domains;

import Domains.Abstracts.Voluntario;

public class VoluntarioExtremo extends Voluntario {

    public VoluntarioExtremo(String name, String lastname, String position , String volunteerType){
        super(name, lastname, position, volunteerType);
    }

    @Override
    public void tipoCompensacion(){}
}
