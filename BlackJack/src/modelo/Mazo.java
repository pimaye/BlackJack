package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.Carta.Palo;

public class Mazo {
	
	
	/**Cartas. Contendr� las 52 cartas de la baraja en una estructura de 
		tipo ArrayList<Carta>*/
	
	protected List<Carta> cartas; //List en una interfaz.
	
	public Mazo() {
		
		cartas= new ArrayList<>();//Hay que inicializar
		for (Palo palo : Palo.values()) { //Se elige el foreach
			for(int i=1;i<=13;i++) {
				Carta c = new Carta(palo,i); //Constructor de Carta
				cartas.add(c); //Para que a�ada un mazo de cartas.
			}
		}
	}
	
	/**
	 *  M�todo barajar() sin par�metros. Se encargar� de barajar el mazo 
		de cartas. Lo �nico que hace es utilizar el m�todo shuffle de la clase 
		Collecction:
		Collections.shuffle(cartas);
	 */
	
	public void barajar() {
		Collections.shuffle(cartas);
	}
	
	@Override
	public String toString() {
		String texto = "";
		for (Carta carta : cartas) {
			texto = texto + carta + "\n";
		}
		return texto;
	}
	
	
	

	
	/**
	 * M�todo solicitarCarta. M�todo sin par�metros que devuelve la primera carta 
		del mazo elimin�ndola de la lista
	 */
	
	public Carta solicitarCarta() {
		Carta c = cartas.get(0); //Sacar elementos de la Lista
		cartas.remove(0);
		return c;
	}
	
	
	
	public static void main(String[]args) {
		Mazo m = new Mazo();
		System.out.println(m);
		
		
		
		m.barajar();			
		System.out.println(m);
		
		Carta c = m.solicitarCarta();
		System.out.println("La carta es "+c);
		System.out.println(m);
	}
	
	
	
	
	
	
	

}
