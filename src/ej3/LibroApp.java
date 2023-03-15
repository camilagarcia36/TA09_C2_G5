package ej3;
import ej3.Libro;
public class LibroApp {
    public static void main(String[] args) {

        Libro libro1 = new Libro("1188923944","Les tres bessones","Arturo",25);
        Libro libro2 = new Libro("11226637394","Harry Potter","JKRowling",230);


        int npl1 = libro1.getNpaginas();
        int npl2 = libro2.getNpaginas();
        if (npl1 > npl2) {
            System.out.println("El primer libro tiene mas paginas que el segundo");    
        }else if (npl1< npl2){
            System.out.println("El segundo libro tiene mas paginas que el prmiero");   
        }else{ System.out.println("El segundo libro tiene la misma cantidad de paginas que el prmiero");   
    }
    }    
}
