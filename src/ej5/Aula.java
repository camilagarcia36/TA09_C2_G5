package ej5;
import java.util.ArrayList;
public class Aula {
Profesor profesor = new Profesor(getAssAula(), getAssAula(), getAula_ID(), getAssAula());
    private int Aula_ID=0;
    private int MaxEstu = 0;
    private String AssAula = "";

    public Aula(int Aula_ID,int MaxEstu, String AssAula){
       this.Aula_ID=Aula_ID;
       this.MaxEstu=MaxEstu;
       this.AssAula=AssAula;
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

    public String ListaEstudiantes (ArrayList<Estudiantes> 
    arrayEstudiante){
        ArrayList<Estudiantes> arrayEstudiantes = new ArrayList<Estudiantes>();
    for (int i = 0; i < arrayEstudiantes.length; i++) {
    if(estudiante.hacerNovillosEst){
        contadorEstudiantes ++;
    }
}
    return arrayEstudiantes.toString();

    }

   
}