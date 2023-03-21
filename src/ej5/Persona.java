package ej5;
public abstract class Persona{

    private String nombre = "";
    private String sexo = "";
    private int edad = 0;

private final String[] NOMBRES_CHICOS = {"Jaimito","Pedro","Fernando","Maximiliano","Marcos"};
//private final String[] NOMBRES_CHICAS = {"Francisca","Alicia","Laura","Lucia","Marta"};
//private final int CHICO = 0;
//private final int CHICA = 1;


    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getSexo() {
        return sexo;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Persona(){

        

    }
}