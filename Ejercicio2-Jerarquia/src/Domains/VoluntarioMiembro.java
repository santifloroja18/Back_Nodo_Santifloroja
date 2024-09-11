package Domains;

import Domains.Abstracts.Voluntario;

public class VoluntarioMiembro extends Voluntario {

    public VoluntarioMiembro(String name, String lastname, String position , String volunteerType){
        super(name, lastname, position, volunteerType);
    }

    @Override
    public void tipoCompensacion(){}
}
