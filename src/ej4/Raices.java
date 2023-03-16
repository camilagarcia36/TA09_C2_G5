package ej4;

public class Raices {

	private double a, b, c;

	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getDiscriminante() {
		return b * b - 4 * a * c;
	}

	// Indica si tiene dos soluciones.
	public boolean tieneRaices() {
		return getDiscriminante() > 0;
	}

	// Indica si tiene una raiz.
	public boolean tieneRaiz() {
		return getDiscriminante() == 0;
	}
	
	public void calcular() {
		double discriminante = getDiscriminante();
		if (discriminante < 0)
			System.out.println("No tiene raíces");
		else if (discriminante == 0)
			obtenerRaiz(); // Raiz unica
		else
			obtenerRaices();
	}

	public void obtenerRaices() { // se asume que discriminante > 0
		double discriminante = getDiscriminante();
		System.out.println("Raíces: " + (-b + Math.sqrt(discriminante)) / (2 * a) + ", "
				+ (-b - Math.sqrt(discriminante)) / (2 * a));
	}

	public void obtenerRaiz() { // se asume que discriminante == 0
		System.out.println("Raíz única: " + -b / (2 * a));
	}
}