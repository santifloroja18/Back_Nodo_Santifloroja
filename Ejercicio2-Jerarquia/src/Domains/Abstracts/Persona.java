package Domains.Abstracts;

public abstract class Persona {

    private String name, lastname;


    public Persona(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    protected abstract void crearUsuario();
}
