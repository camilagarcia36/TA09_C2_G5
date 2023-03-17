package ej2;

public class Serie implements Entregable {

	// Creamos las constantes por defecto.
	private static int NUM_TEMP_DEF = 3;

	public final static int MAYOR = 1;

	public final static int MENOR = 1;
	public final static int IGUAL = 0;

	// Creamos los atributos.
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	// Constructores
	public Serie() {
        this("",NUM_TEMP_DEF, "", "");
	}

	public Serie(String titulo, String creador) {
        this(titulo,NUM_TEMP_DEF, "", creador);
	}

	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.entregado = false;
	}

	// Creacion de los metodos. Getters y setters.

	public String getTitulo() {
		return titulo;
	}

	public int getnumTemporadas() {
		return numTemporadas;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setnumeroTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public void entregar() {
		entregado = true;
	}

	public void devolver() {
		entregado = false;
	}

	public boolean isEntregado() {
		if (entregado) {
			return true;
		}
		return false;
	}

	// Comparacion segun su numero de temporadas.
	public int compareTo(Object a) {
		int estado = MENOR;

		Serie ref = (Serie) a;
		if (numTemporadas > ref.getnumTemporadas()) {
			estado = MAYOR;
		} else if (numTemporadas == ref.getnumTemporadas()) {
			estado = IGUAL;
		}

		return estado;

	}

	public String toString() {
	
		return "Informacion de la serie con más temporadas : \n" + "El titulo de la serie es " + titulo 
				+ ", tiene " + numTemporadas 
				+ " numero de temporadas, el genero al que pertenece es " + genero 
				+ " y el creador/a es " + creador + ". ";  
	}
	
	
	public boolean equals(Serie a) {
		if(titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getCreador())) {
			return true; 
		}
		return false; 
	}
	
	
}
