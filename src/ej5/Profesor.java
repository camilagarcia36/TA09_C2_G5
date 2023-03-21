package ej5;

import java.util.Random;

public class Profesor extends Persona{
    Random rnd = new Random();
    private String materia = "";

public Profesor( String nombre,String sexo,int edad, String materia){
  super();

  super.setEdad(ClaseApp.generarNumeroAleatorio(25, 50));
  materia = Constantes.MATERIAS[ClaseApp.generarNumeroAleatorio(0,2)];

}

public void setMateria(String materia) {
    this.materia = materia;
}

public String getMateria() {
    return materia;
}

@Override
public void disponibilidad() {
   
    int prob = ClaseApp.generarNumeroAleatorio(0, 100);
    if (prob<20) {

        
    }else {
        super.setAsistencia(true);
    }
}
 
}
