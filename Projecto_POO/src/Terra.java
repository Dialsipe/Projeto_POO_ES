
public class Terra extends Carta {

	//construtor- default
	public Terra() {
		
	}
	
	//construtor com argumentos da classe pai
	public Terra(String elementoCarta, int poderCarta, int nivel) {
		super(elementoCarta, poderCarta, nivel);
		this.elementoCarta = elementoCarta;
		this.poderCarta = poderCarta;
		this.nivel = nivel;
	}
	
	@Override
	public boolean vantagem(Carta carta) {
		if(carta.elementoCarta == "Fogo" || carta.elementoCarta=="Eletrico")
			return true;
		else
			return false;
	}

	@Override
	public boolean desvantagem(Carta carta) {
		if(carta.elementoCarta == "Agua" || carta.elementoCarta=="Planta")
			return true;
		else
			return false;
	}

	@Override
	public boolean neutro(Carta carta) {
		if(carta.elementoCarta == "Terra")
			return true;
		else
			return false;
	}
}
