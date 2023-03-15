package ej1;

public class ElectrodomesticosMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico lista[] = new Electrodomestico[10];
		lista[0] = new Television(25.0, false, 45.0, 28.0, Consumo.A, Color.BLANCO);

		lista[1] = new Television(25.0, false, 45.0, 28.0, Consumo.A, Color.BLANCO);

		lista[2] = new Lavadora(25.0, 45.0, Consumo.A, Color.BLANCO, 40.0);

		lista[3] = new Television(25.0, false, 45.0, 28.0, Consumo.A, Color.BLANCO);
		lista[4] = new Lavadora(25.0, 45.0, Consumo.A, Color.BLANCO, 40.0);

		lista[5] = new Television(25.0, false, 60.0, 28.0, Consumo.A, Color.BLANCO);

		lista[6] = new Electrodomestico(24.5, 34.0, Color.NEGRO, Consumo.A);

		lista[7] = new Electrodomestico(20.6, 47.0, Color.NEGRO, Consumo.A);

		lista[8] = new Lavadora(25.0, 45.0, Consumo.A, Color.BLANCO, 40.0);

		lista[9] = new Lavadora(30.0, 58.0, Consumo.A, Color.BLANCO, 67.0);

	
		double sumaTV = 0; 
		double sumaLavadora = 0; 
		double sumaElectrodomestico = 0; 
		
		for(int i=0; i<lista.length; i++) {
			
			if (lista[i] instanceof Television) {
				sumaTV += lista[i].precioFinal(); 
			}
			if (lista[i] instanceof Lavadora) {
				sumaLavadora += lista[i].precioFinal(); 
			}
			if (lista[i] instanceof Electrodomestico) {
				sumaElectrodomestico += lista[i].precioFinal(); 
			}
		}
		
		System.out.println("La suma total de tv es " + sumaTV);
		System.out.println("La suma total de lavadora es " + sumaLavadora);
		System.out.println("La suma total de electrodomestico es " + sumaElectrodomestico);

	}
	
	
	
	

}
