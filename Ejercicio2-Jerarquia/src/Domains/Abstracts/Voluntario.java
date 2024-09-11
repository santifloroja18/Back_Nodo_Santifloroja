package Domains.Abstracts;

public abstract class Voluntario extends Persona {

    private String position, volunteerType;

    public Voluntario( String name, String lastname, String position, String volunteerType) {
        super(name, lastname);
        this.position = position;
        this.volunteerType = volunteerType;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public String getVolunteerType() {
        return volunteerType;
    }

    public void setVolunteerType(String volunteerType) {
        this.volunteerType = volunteerType;
    }

    @Override
    public void crearUsuario() {  }

    public abstract void tipoCompensacion();
}
