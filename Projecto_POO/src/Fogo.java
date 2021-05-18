
public class Fogo extends Carta {
	
	//construtor- default
	public Fogo() {
		
	}
	
	//construtor com argumentos
	public Fogo(String elementoCarta, int nivel) {
		super(elementoCarta, nivel);
		this.elementoCarta = elementoCarta;
		this.nivel = nivel;
	}

	@Override
	public boolean vantagem(Carta carta) {
		if(carta.elementoCarta == "Planta")
			return true;
		else
			return false;
	}
	
	@Override
	public boolean desvantagem(Carta carta) {
		if(carta.elementoCarta == "Agua" || carta.elementoCarta=="Terra")
			return true;
		else
			return false;
	}

}
