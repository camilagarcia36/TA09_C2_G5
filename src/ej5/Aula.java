package ej5;
public class Aula {

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
}