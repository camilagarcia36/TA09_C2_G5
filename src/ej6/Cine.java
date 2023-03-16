package ej6;

public class Cine {
    Pelicula pelicula;
    double precio;

    static final int N_FILAS = 8;
    static final int N_COLUMNAS = 9;
    Espectador[][] asientos = new Espectador[N_FILAS][N_COLUMNAS];

    public static void main(String[] args) {
        Cine c = new Cine();
        for (Espectador[] fila : c.asientos) {
            for (Espectador e : fila) {
                System.out.print("'"+(e==null)+"', ");
            }
        }
    }
}
