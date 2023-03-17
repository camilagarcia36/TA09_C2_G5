package ej2;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos dos arrays de diferente tipo de objeto

		Serie series[] = new Serie[5];
		Videojuego videojuego[] = new Videojuego[5];

		series[0] = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
		series[1] = new Serie("Game of Thrones", 8, "Fantasía", "David Benioff y D. B. Weiss");
		series[2] = new Serie("The Office", 100, "Comedia", "Greg Daniels");
		series[3] = new Serie("Stranger Things", 19, "Ciencia ficción", "The Duffer Brothers");
		series[4] = new Serie("Friends", 1, "Comedia", "David Crane");

		videojuego[0] = new Videojuego("The Legend of Zelda: Breath of the Wild", 400, "Aventura", "Nintendo");
		videojuego[1] = new Videojuego("Grand Theft Auto V", 700, "Acción", "Rockstar Games");
		videojuego[2] = new Videojuego("Minecraft", 100, "Sandbox", "Mojang Studios");
		videojuego[3] = new Videojuego("The Witcher 3: Wild Hunt", 150, "RPG", "CD Projekt RED");
		videojuego[4] = new Videojuego("Fortnite", 2, "Battle Royale", "Epic Games");

		series[3].entregar();
		series[1].entregar();
		videojuego[0].entregar();
		videojuego[1].entregar();

		int entregados = 0;
		for (int i = 0; i < series.length; i++) {
			if (series[i].isEntregado()) {
				entregados += 1;
				series[i].devolver();

			}
			if (videojuego[i].isEntregado()) {
				entregados += 1;
				videojuego[i].devolver();
			}
		}

		System.out.println("El numero de articulos entregados es: " + entregados);

		Serie serieMayor = series[0];
		Videojuego videojuegoMayor = videojuego[0];

		for (int i = 1; i < series.length; i++) {
			if (series[i].compareTo(serieMayor) == Serie.MAYOR) {
				serieMayor = series[i];
			}

			if (videojuego[i].compareTo(videojuegoMayor) == Videojuego.MAYOR) {
				videojuegoMayor = videojuego[i];
			}
		}
		
		System.out.println(videojuegoMayor);
		System.out.println(serieMayor);
	}
}