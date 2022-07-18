package modelo;


//Proyecto: BlackJack(Juegos de cartas)

public class Carta {
	
	
	/**Contiene los datos correspondientes a una Carta. La clase carta definirá un 
tipo enumerado para los palos de las cartas. Lo puedes definir dentro de la 
clase de la siguiente manera:
enum Palo {
TREBOL, DIAMANTES, CORAZONES, PICAS
};
Una carta tendrá sólo dos tipos de datos:
• Número de la carta. Es un numero del 1 al 13
• Palo. De tipo Palo (el tipo enumerado)
*/
	
	enum Palo{
		TREBOL,DIAMANTE,CORAZONES,PICAS
	};
	
	//Palo sería desde ahora un DATATYPE.
	
	private Palo palo;
	private int num;
	
	/** Constructor parametrizado al que le pases el numero y el palo, y 
		asigne los valores. El número deberá estar entre 1 y 13.*/
	
		
	public Carta(Palo palo, int num) {
		super();
		this.palo = palo;
		if(num>=1 && num<=13) {
			this.num = num;
		}
		
	}
	public Palo getPalo() {
		return palo;
	}
	public int getNum() {
		return num;
	}
	
	
	
	public int getValor() {
		if (this.num==1){
			return 11;
		}else if(this.num >10) {
			return 10;
		}else {
			return this.num;
		}
	}
	
	
	
	/**Sobreescribe el método toString para que muestre la carta de la 
siguiente manera [ numero – Palo]. Por ejemplo, [3 – CORAZONES]*/
	
	public String mostrarNumero() {
		if(this.num==1) {
			return "AS";
		}else if(this.num==11) {
			return "J";
		}else if(this.num==12) {
			return "Q";
		}else if(this.num==13) {
			return "K";
		}else {
			return Integer.toString(num); //return.toString(this.num); ||  return""+this.num; 
		}
	}
	
	
	
	
	@Override
	public String toString() {
		return "[ " +this.mostrarNumero() + " - " + this.palo + "]";
	}
	
	
	
	
	
	
	
	

}
