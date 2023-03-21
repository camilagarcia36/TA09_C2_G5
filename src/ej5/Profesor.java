package ej5;

import java.util.Random;

public class Profesor extends Persona{
    

    Random rnd = new Random();
    private String materia = "";

public Profesor( String nombre,String sexo,int edad, String materia){
  super();
    this.materia = materia;
}


public void setMateria(String materia) {
    this.materia = materia;
}

public String getMateria() {
    return materia;
}

public boolean hacerNovillosProf(){
   boolean disponibilidad = true;
    if ( rnd.nextInt() *5 >= 4 ){
    return disponibilidad = false;
    }else 
    return disponibilidad;
 }
 
}
