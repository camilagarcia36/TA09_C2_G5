package ej1;

enum Color {
	BLANCO, NEGRO, ROJO, AZUL, GRIS
}

enum Consumo {
	A, B, C, D, E, F
}

public class Electrodomestico {
	protected double precioBase = 100;
	
	protected Color color = Color.BLANCO;
	protected Consumo consumo_energetico = Consumo.F;
	protected double peso = 5;

	Electrodomestico() {
	}

	Electrodomestico(double precio, double peso) {
		this.precioBase = precio;
		this.peso = peso;
	}

	Electrodomestico(double precio, double peso, Color color, Consumo consumo) {
		this.precioBase = precio;
		this.peso = peso;
		this.color = color;
		this.consumo_energetico = consumo;
	}

	// private void comprobarConsumoEnergetico(Consumo consumo) {}

	// public void comprobarColor(Color color) {}

	public double precioFinal() {

		double precio = this.precioBase; 
		
		switch (consumo_energetico) {
		case A:
			precio += 100;
			break;
		case B:
			precio+=80; 
			break;
		case C:
			precio+=60; 
			break;
		case D:
			precio+=50;

			break;
		case E:
			precio+=30; 
			break;

		case F:
			precio+=10; 
			break;
		}
		
		if(peso<=19) {
			precio+=10; 
		}else if(peso>=20 && peso<=49) {
			precio+=50;
		}else if(peso>=50 && peso<=79) {
			precio+=80;
		}else if(peso>=80) {
			precio+=100;
		}
		
		return precio; 

	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setConsumo_energetico(Consumo consumo_energetico) {
		this.consumo_energetico = consumo_energetico;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setPrecioBase(double precio) {
		this.precioBase = precio;
	}

	public Color getColor() {
		return color;
	}

	public Consumo getConsumo_energetico() {
		return consumo_energetico;
	}

	public double getPeso() {
		return peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

}
