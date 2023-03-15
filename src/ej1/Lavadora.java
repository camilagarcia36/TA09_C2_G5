package ej1;

public class Lavadora extends Electrodomestico {

	static final protected double CARGA = 5;
	protected double carga = CARGA;

	public Lavadora() {
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);

	}

	public Lavadora(double precioBase, double peso, Consumo consumo_energetico, Color color, double carga) {
		super(precioBase, peso, color, consumo_energetico);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	public double precioFinal() {
		double precioLavadora = super.precioFinal();

		if (carga > 30) {
			precioLavadora += 50;
		}
		return precioLavadora;
	}

}
