package modelo;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		Mazo mazo = new Mazo();
		Mano jugador = new Mano();
		
		System.out.println("Barajando carta...");
		
		Scanner entrada = new Scanner(System.in);
		int opcion;
		//boolean plantado=false;
		do {
		
		System.out.println("¿Quieres carta ) (1-Si, 0-No)");
		opcion = entrada.nextInt();
		if (opcion ==1) {
			jugador.pedirCarta(mazo);
			System.out.println("Tienes en tu mano \n"+jugador);
		} 
	} while (opcion!=0 && !jugador.finDeJuego());// && !plantado); !jugador=no jugador.
		
		
		//Primero ha jugado el jugador y ahora juega la banca.
		
		Mano banca = new Mano();
		System.out.println("Juega la Banca...");
		if(jugador.valorMano()>21) {
			System.out.println("Gana la Banca");
		}else {
			
		}
		do {
			System.out.println("Pidiendo carta");
		banca.pedirCarta(mazo);
		System.out.println(banca);
			
		}while (banca.valorMano()<=16);
		
		if(jugador.valorMano()>banca.valorMano()) {
			System.out.println("Enhorabuena has ganado jugador "+jugador);
		}else if (jugador.valorMano()==banca.valorMano()) {
			System.out.println("Empate");
			System.out.println("Jugador: "+jugador);
			System.out.println("Banca: "+banca);
		}else {
			System.out.println("Gana la banca: "+banca);
		}
		
		
		
	/**	
		System.out.println("Fin de Juego. Tu mano es\n"+jugador);
		
	if(jugador.valorMano()==21) {
		System.out.println("Campeón has conseguido 21");
	}else if(jugador.valorMano()>21) {
		System.out.println("Te has pasado");
	} else {
		System.out.println("Te has plantado con "+jugador.valorMano());
	}
	System.out.println("Juega Responsablemente");
		
		*/
		
		
		

	}
	
	
	
	
	
}
