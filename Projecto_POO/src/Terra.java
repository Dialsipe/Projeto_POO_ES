
public class Terra extends Carta {

	//construtor- default
	public Terra() {
		
	}
	
	//construtor com argumentos da classe pai
	public Terra(String elementoCarta, int nivel) {
		super(elementoCarta, nivel);
		this.elementoCarta = elementoCarta;
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


}
