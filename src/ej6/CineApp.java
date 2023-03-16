package ej6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CineApp {
    public static void main(String[] args) {

        int num_espectadores = Cine.N_FILAS*Cine.N_COLUMNAS;

        String nombres[] = {"ANTONIO","MANUEL","JOSE","FRANCISCO","DAVID","JUAN","JAVIER","JOSE ANTONIO","DANIEL","FRANCISCO JAVIER",
        "MARIA CARMEN","MARIA","CARMEN","ANA MARIA","MARIA PILAR","LAURA","JOSEFA","ISABEL","MARIA DOLORES","MARIA TERESA","ANA"};
        String apellidos[] = {"Quesada", "Alcala", "Marín", "Suarez", "Cobos","Rios", "Martin", "Lopez", "Salas", "Mateo", "Abas", "De Diego"};
        
        Pelicula pelicula = new Pelicula();
        pelicula.director = "Dan Kwan";
        pelicula.duracion = 120;
        pelicula.edad_minima = 18;
        pelicula.titulo = "Everithing everywhere all at once";
        Cine cine = new Cine();
        cine.pelicula = pelicula;
        cine.precio = 10;

        Random random = new Random();
        Espectador[] espectadores = new Espectador[num_espectadores];
        for (int i = 0; i < num_espectadores; i++) {
            espectadores[i] = new Espectador();
            espectadores[i].nombre = nombres[random.nextInt(nombres.length)] + " " + apellidos[random.nextInt(apellidos.length)];
            espectadores[i].edad = random.nextInt(100);
            espectadores[i].dinero = random.nextDouble()*30;
        }

        ArrayList<Integer> indexs = new ArrayList<Integer>();
        for (int i = 0; i < Cine.N_FILAS*Cine.N_COLUMNAS; i++) indexs.add(i);
        Collections.shuffle(indexs);

        int i = 0;
        for (int j = 0; j < espectadores.length; j++) {
            if (espectadores[j].dinero >= cine.precio && espectadores[j].edad >= cine.pelicula.edad_minima) {
                int index = indexs.get(i);
                int fila = index/Cine.N_COLUMNAS;
                int columna = index%Cine.N_COLUMNAS;
                if (cine.asientos[fila][columna] != null) System.out.println("Error: asiento ocupado");
                cine.asientos[fila][columna] = espectadores[j];
                i++;
            }
        }

        System.out.print("  ");
        for (int columna = 0; columna < Cine.N_COLUMNAS; columna++) 
            System.out.print((char)((int)'A'+columna) + " ");
        System.out.println();
        for (int fila = 0; fila < Cine.N_FILAS; fila++) {
            System.out.print((fila+1)+" ");
            for (int columna = 0; columna < Cine.N_COLUMNAS; columna++) {
                if (cine.asientos[fila][columna] == null) System.out.print("o ");
                else System.out.print("x ");
            }
            System.out.println("");
        }
    }
}
