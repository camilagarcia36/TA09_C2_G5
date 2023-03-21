package ej5;
public abstract class Persona{

    private String nombre = "";
    private String sexo = "";
    private int edad = 0;
    private boolean asistencia;

    private final String[] NOMBRES_CHICOS = {"Jaimito","Pedro","Fernando","Maximiliano","Marcos"};
    private final String[] NOMBRES_CHICAS = {"Francisca","Alicia","Laura","Lucia","Marta"};
    private final int CHICO = 0;
    private final int CHICA = 1;


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
    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
public boolean isAsistencia(){

    return asistencia;
}

    public Persona(){

        int determinar_sexo=ClaseApp.generarNumeroAleatorio(0,1);

        if (determinar_sexo==CHICO) {
            nombre=NOMBRES_CHICOS[ClaseApp.generarNumeroAleatorio(0,4)];
            sexo="H";
        }
        else {
            nombre =NOMBRES_CHICAS[ClaseApp.generarNumeroAleatorio(0,4)];
            sexo ="M";
        }
        edad=ClaseApp.generarNumeroAleatorio(12, 15);
    }
    public abstract void disponibilidad();

}