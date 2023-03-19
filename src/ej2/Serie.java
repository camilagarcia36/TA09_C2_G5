package ej2;

public class Serie implements Entregable {
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	// Creacion de constructores
	public Serie() {
		this.numTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	// Métodos get y set

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
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

	// Métodos de la interfaz Entregable

	public void entregar() {
		entregado = true;
	}

	public void devolver() {
		entregado = false;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public int compareTo(Object a) {
		int resultado = -1;
		if (a instanceof Serie) {
			Serie s = (Serie) a;
			if (this.numTemporadas > s.numTemporadas) {
				resultado = 1;
			} else if (this.numTemporadas == s.numTemporadas) {
				resultado = 0;
			}
		}
		return resultado;
	}

	public String toString() {
		return "\n" + titulo + " con un número total de temporadas de " + numTemporadas + ", de genero " + genero
				+ " y cuyo creador es " + creador + ", su estado de entrega es: " + entregado;
	}
}
