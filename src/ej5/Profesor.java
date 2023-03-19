package ej5;

import java.util.Random;

public class Profesor {
    Random rnd = new Random();

    private String nombre = "";
    private String sexo = "";
    private int edad = 0;
    private String materia = "";

public Profesor( String nombre,String sexo,int edad, String materia){
    this.nombre=nombre;
    this.edad=edad;
    this.sexo=sexo;
    this.materia = materia;
}

public void setEdad(int edad) {
    this.edad = edad;
}
public void setMateria(String materia) {
    this.materia = materia;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setSexo(String sexo) {
    this.sexo = sexo;
}

public int getEdad() {
    return edad;
}
public String getMateria() {
    return materia;
}
public String getNombre() {
    return nombre;
}
public String getSexo() {
    return sexo;
}
public boolean hacerNovillosProf(){
   boolean disponibilidad = true;
    if ( rnd.nextInt() *5 >= 4 ){
    return disponibilidad = false;
    }else 
    return disponibilidad;
 }
 
}
