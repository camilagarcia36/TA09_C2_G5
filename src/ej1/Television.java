package ej1;

public class Television extends Electrodomestico {

	double resolucion = 20;
	boolean sintonizador = false;

	public Television() {

	}
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}
	
	public Television(double resolucion, boolean sintonizador,double precioBase, double peso, Consumo consumo_energetico, Color color) {
		super(precioBase,peso, color, consumo_energetico);
		this.resolucion =resolucion ;
		this.sintonizador = sintonizador; 
	}
	
	public double getResolucion() {
		return resolucion; 
	}
	
	public boolean getSintonizador() {
		return sintonizador;
	}
	
	public double precioFinal() {
		double precioTelevision = super.precioFinal();

		if (resolucion > 40) {
			precioTelevision*=1.3; 
		}
		if(sintonizador) {
			precioTelevision+=50; 
		}
		return precioTelevision;
	}
	
	

}
