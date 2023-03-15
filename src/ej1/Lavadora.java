package ej1;

public class Lavadora extends Electrodomestico {
	
	
	static final protected double CARGA=5; 
	protected double carga = CARGA; 
	
	
	public Lavadora() {}
	
	
	public Lavadora(double precioBase, double peso) {
		this.precioBase = precioBase; 
		this.peso = peso; 
		
	}
	
	public Lavadora(double precioBase, double peso, Consumo consumo_energetico, Color color, double carga) {
		
	}
	
	public double getCarga() {
		return carga; 
	}
	
	
	
}
