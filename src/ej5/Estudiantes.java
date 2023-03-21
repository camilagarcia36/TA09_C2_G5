package ej5;
import java.util.Random;

public class Estudiantes extends Persona  {
Random rnd = new Random();
  
    private double nota = 0.0;

    public Estudiantes( String nombre,String sexo,int edad,double nota){

  super();
    nota = ClaseApp.generarNumeroAleatorio(0, 10);

    super.setEdad(ClaseApp.generarNumeroAleatorio(12, 15));
    }
 public void setNota(double nota) {
     this.nota = nota;
 }
 public double getNota() {
     return nota;
 }



@Override
public void disponibilidad() {
    int prob=ClaseApp.generarNumeroAleatorio(0, 100);

    if (prob<50) {
        super.setAsistencia(true);
    }else{

        super.setAsistencia(false);
    }
}

public String toString(){

    return "Nombre"+super.getNombre()+" sexo "+super.getSexo()+"nota"+getNota();
}

}
