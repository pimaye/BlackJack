package modelo;

import java.util.ArrayList;




//Mano: son las cartas que tiene cada jugador.


public class Mano extends Mazo {

	public Mano() {  //Botón derecho, código fuente,generar constructores de la superclase.
			this.cartas = new ArrayList<>();	
	}
	
	/**
	 * Método valorMano sin parámetros. Calcula cual es valor que 
	tenemos en la mano de cartas. Para hacerlo recorreremos la lista de 
	cartas sumando los puntos de cada una.
	 */
	
	public int valorMano() {
		int suma=0;
		for (Carta carta : cartas) {
			suma=suma+carta.getValor();
		}
		return suma;
	}
	
	/**
	 * • Método finDeJuego que devuelve un boolean, indicando true si la 
mano tiene más de 21 puntos, significando que el jugador se ha 
pasado
	 */
	
	public boolean finDeJuego() {
		if (valorMano()>21) {   //Se reutiliza el método/código de valorMano
			return true;
		}
		return false;
		
		//return valorMano()>=21;
	}

	@Override
	public String toString() {
		return "Valor de la Mano:" + valorMano() + "\n" + super.toString();
	}
	
	/**
	 * Método pedirCarta(Mazo m) al que se le pasa un mazo de cartas, 
		deberá solicitar una carta al mazo e incluirla en la mano.
	 */
	
	public void pedirCarta(Mazo m) {
		if (!finDeJuego()) {
		Carta c = m.solicitarCarta();
		this.cartas.add(c);
		}
		
	}
	
	
	
	
	
	
	
	

}
