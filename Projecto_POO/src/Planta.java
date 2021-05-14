
public class Planta extends Carta {

	//construtor- default
	public Planta() {
		
	}
	
	//construtor com argumentos da classe pai
	public Planta(String elementoCarta, int poderCarta, int nivel) {
		super(elementoCarta, poderCarta, nivel);
		this.elementoCarta = elementoCarta;
		this.poderCarta = poderCarta;
		this.nivel = nivel;
	}
	
	@Override
	public boolean vantagem(Carta carta) {
		if(carta.elementoCarta == "Agua" || carta.elementoCarta=="Terra")
			
			return true;
		else
			return false;
	}

	@Override
	public boolean desvantagem(Carta carta) {
		if(carta.elementoCarta == "Fogo" )
			return true;
		else
			return false;
	}

	@Override
	public boolean neutro(Carta carta) {
		if(carta.elementoCarta == "Planta" || carta.elementoCarta=="Eletrico")
			return true;
		else
			return false;
	}

}
