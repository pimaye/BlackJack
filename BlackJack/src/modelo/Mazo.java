package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.Carta.Palo;

public class Mazo {
	
	
	/**Cartas. Contendrá las 52 cartas de la baraja en una estructura de 
		tipo ArrayList<Carta>*/
	
	protected List<Carta> cartas; //List en una interfaz.
	
	public Mazo() {
		
		cartas= new ArrayList<>();//Hay que inicializar
		for (Palo palo : Palo.values()) { //Se elige el foreach
			for(int i=1;i<=13;i++) {
				Carta c = new Carta(palo,i); //Constructor de Carta
				cartas.add(c); //Para que añada un mazo de cartas.
			}
		}
	}
	
	/**
	 *  Método barajar() sin parámetros. Se encargará de barajar el mazo 
		de cartas. Lo único que hace es utilizar el método shuffle de la clase 
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
	 * Método solicitarCarta. Método sin parámetros que devuelve la primera carta 
		del mazo eliminándola de la lista
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
