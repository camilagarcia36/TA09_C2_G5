package ej2;

public class Videojuego implements Entregable{
	

	    private String titulo;
	    private int horasEstimadas;
	    private boolean entregado;
	    private String genero;
	    private String compañia;

	    // Constructor por defecto
	    public Videojuego() {
	        this.titulo = "";
	        this.horasEstimadas = 10;
	        this.entregado = false;
	        this.genero = "";
	        this.compañia = "";
	    }

	    // Constructor con titulo y horas estimadas
	    public Videojuego(String titulo, int horasEstimadas) {
	        this.titulo = titulo;
	        this.horasEstimadas = horasEstimadas;
	        this.entregado = false;
	        this.genero = "";
	        this.compañia = "";
	    }

	    // Constructor con todos los atributos excepto entregado
	    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
	        this.titulo = titulo;
	        this.horasEstimadas = horasEstimadas;
	        this.entregado = false;
	        this.genero = genero;
	        this.compañia = compañia;
	    }

	    // Métodos get de todos los atributos, excepto entregado
	    public String getTitulo() {
	        return titulo;
	    }

	    public int getHorasEstimadas() {
	        return horasEstimadas;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public String getCompañia() {
	        return compañia;
	    }

	    // Métodos set de todos los atributos, excepto entregado
	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public void setHorasEstimadas(int horasEstimadas) {
	        this.horasEstimadas = horasEstimadas;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }

	    public void setCompañia(String compañia) {
	        this.compañia = compañia;
	    }

	    // Sobrescribe el método toString
	    @Override
	    public String toString() {
	        return "\n"+ titulo +
	                " con " + horasEstimadas + " horas estimadas de juego, "
	                 +
	                " de genero '" + genero +
	                " y de la compañia " + compañia + ", su estado de entrega es "+ entregado;
	    }

	    // Implementación de los métodos de la interfaz Entregable
	    @Override
	    public void entregar() {
	        entregado = true;
	    }

	    @Override
	    public void devolver() {
	        entregado = false;
	    }

	    @Override
	    public boolean isEntregado() {
	        return entregado;
	    }

	    // Implementación del método compareTo para comparar por horas estimadas
	    @Override
	    public int compareTo(Object o) {
	        Videojuego otroVideojuego = (Videojuego) o;
	        if (horasEstimadas > otroVideojuego.horasEstimadas) {
	            return 1;
	        } else if (horasEstimadas < otroVideojuego.horasEstimadas) {
	            return -1;
	        } else {
	            return 0;
	        }
	    }
	}
