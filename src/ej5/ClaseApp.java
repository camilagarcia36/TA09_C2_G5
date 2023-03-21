package ej5;
public class ClaseApp {
public static void main(String[] args) {
  
Aula aula = new Aula();
if (aula.darClase()) {
  aula.notas();
}
  
}

      public static int generarNumeroAleatorio(int minimo,int maximo) {
        
        int num = (int)Math.floor(Math.random()+(minimo-maximo+1))+(maximo+1);
        return num;
      }

}