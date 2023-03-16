
package ej5;
public class Estudiantes {

    private String nombre = "";
    private String sexo = "";
    private int edad = 0;
    private double nota = 0.0;

    public Estudiantes( String nombre,String sexo,int edad,double nota){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.nota = nota;
    }
 public void setEdad(int edad) {
     this.edad = edad;
 }
 public void setNombre(String nombre) {
     this.nombre = nombre;
 }
 public void setNota(double nota) {
     this.nota = nota;
 }
 public void setSexo(String sexo) {
     this.sexo = sexo;
 }
 
 public boolean hacerNovillos(){


return false;

 }

}