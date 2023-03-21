
package ej5;
import java.util.Random;

public class Estudiantes extends Persona  {
Random rnd = new Random();
  
    private double nota = 0.0;

    public Estudiantes( String nombre,String sexo,int edad,double nota){
  super();
        this.nota = nota;
    }
 
 public void setNota(double nota) {
     this.nota = nota;
 }
 public double getNota() {
     return nota;
 }

 
 public boolean hacerNovillosEst(){
   
    if ( rnd.nextInt() * 2 == 1){
    return true;
    }else 
    return false;
 }
 
}