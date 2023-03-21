package ej5;
public class Aula {
Profesor profesor = new Profesor(getAssAula(), getAssAula(), getAula_ID(), getAssAula());
Estudiantes estudiantes2 = new Estudiantes(getAssAula(), getAssAula(), getMaxEstu(), getAula_ID());

    private int Aula_ID=0;
    private int MaxEstu = 0;
    private String AssAula = "";
    private Estudiantes[] estudiantes;
    private Profesor profesor2;
    private String materia;
    private final int MAX_ALUMNOS= 20;


    public Aula(){
    
       profesor = new Profesor(AssAula, AssAula, MaxEstu, AssAula);
       estudiantes = new Estudiantes[MAX_ALUMNOS];
       materia = Constantes.MATERIAS[ClaseApp.generarNumeroAleatorio(0, 2)];
crearAlumnos();
    }

    public void setAssAula(String assAula) {
        AssAula = assAula;
    }
    public void setAula_ID(int aula_ID) {
        Aula_ID = aula_ID;
    }
    public void setMaxEstu(int maxEstu) {
        MaxEstu = maxEstu;
    }
    public String getAssAula() {
        return AssAula;
    }
    public int getAula_ID() {
        return Aula_ID;
    }
    public int getMaxEstu() {
        return MaxEstu;
    }

  //  profesor = new Profesor();

  private void crearAlumnos(){
    for (int i = 0; i < estudiantes.length; i++) {
        estudiantes[i] = new Estudiantes(materia, AssAula, i, i);
        
    }
}
    public boolean asistenciaAlumnos(){
        int cuentaAsistencia = 0 ;
        for (int i = 0; i < estudiantes.length; i++) {
            
            if (estudiantes[i].isAsistencia()) {
                cuentaAsistencia++;
            }
        }
        
        System.out.println("Hay "+cuentaAsistencia+" alumnos");

        return cuentaAsistencia>=((int)estudiantes.length/2);
    }
    
     

     public boolean darClase() {
        boolean clase = true;
       if (!profesor.isAsistencia()) {
        System.out.println("El profesor no está no puede dar clase");
        clase = false;
       }else if (!profesor.getMateria().equals(materia)){
       System.out.println("La materia del profesor y del aula no es la misma, no se puede dar clase");
        clase=false; 
       }else if(!asistenciaAlumnos()){
        System.out.println("La asistencia a la clase no es suficiente");
        clase = false;
       }
       System.out.println("Se puede dar clase");
       clase = true;
    return clase;
     }

     public void notas(){

int chicosApro = 0;
int chicasApro = 0;

for (int i = 0; i < estudiantes.length; i++) {
    

    if (estudiantes [i].getNota()>=5) {
        
        if (estudiantes[i].getSexo()=="H") {
            chicosApro++;
        }else chicasApro++;
    }
    System.out.println(estudiantes[i].toString());
}
System.out.println("Hay"+chicosApro+"chicos y" +chicasApro+"chicas aprobadas");
     }
}