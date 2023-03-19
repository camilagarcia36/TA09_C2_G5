package ej2;

public class MainApp {

		    public static void main(String[] args) {
		        // Crear array de Series
		        Serie[] series = new Serie[5];
		        series[0] = new Serie("Castle", 8, "Accion","Andrew W. Marlowe");
		        series[1] = new Serie("Friends", 10, "Comedia","James Burrows" );
		        series[2] = new Serie("Game of Thrones", 8, "Fantasía", "David Benioff");
		        series[3] = new Serie("Stranger Things", 3, "Ciencia ficción", "Los hermanos Duffer");
		        series[4] = new Serie("The Crown",10,"Historia", "Peter Morgan");

		        Videojuego[] videojuegos = new Videojuego[5];
		        videojuegos[0] = new Videojuego("Call of Duty", 15, "Acción", "Activision");
		        videojuegos[1] = new Videojuego("FIFA 22", 10, "Deportes", "EA Sports");
		        videojuegos[2] = new Videojuego("Minecraft", 30, "Aventura", "Mojang");
		        videojuegos[3] = new Videojuego("Assassin's Creed", 20, "Acción-Aventura", "Ubisoft");
		        videojuegos[4] = new Videojuego("The Legend of Zelda", 25, "Aventura", "Nintendo");


		        // Entregar algunas series
		        series[1].entregar();
		        series[3].entregar();
		        videojuegos[4].entregar();
		        videojuegos[2].entregar(); 
		      
		        // Cuenta cuantas series y videojuegos hay entregados y devuelve el numero de entregados. 
		        int entregados = 0;
				for (int i = 0; i < series.length; i++) {
					if (series[i].isEntregado()) {
						entregados += 1;
						series[i].devolver();

					}
					if (videojuegos[i].isEntregado()) {
						entregados += 1;
						videojuegos[i].devolver();
					}
				}
				System.out.println("El numero de articulos entregados es: " + entregados);
				
				
		        // Encontrar la serie con más temporadas y el videojuego con más horas estimadas
		        Serie serieMasTemporadas = series[0];
		        Videojuego videojuegoMasHoras = videojuegos[0];

		        for (int i = 1; i < series.length; i++) {
		            if (series[i].getNumTemporadas() > serieMasTemporadas.getNumTemporadas()) {
		                serieMasTemporadas = series[i];
		            }
		        }

		        for (int i = 1; i < videojuegos.length; i++) {
		            if (videojuegos[i].getHorasEstimadas() > videojuegoMasHoras.getHorasEstimadas()) {
		                videojuegoMasHoras = videojuegos[i];
		            }
		        }

		        // Mostrar la serie con más temporadas y el videojuego con más horas estimadas
		        System.out.println("\nLa serie con más temporadas es: " + serieMasTemporadas.toString());
		        System.out.println("\nEl videojuego con más horas estimadas es: " + videojuegoMasHoras.toString());
		        
		        //El estado de entrega se convierte a false porque previamente hemos devuelto la serie o videojuego al contarlos. 
		    }
		    
		    
		}
