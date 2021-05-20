
public class Planta extends Carta {

	//construtor- default
	public Planta() {
		
	}
	
	//construtor com argumentos da classe pai
	public Planta(String elementoCarta, int nivel) {
		super(elementoCarta, nivel);
	}
	
	@Override
	public boolean vantagem(Carta carta) {
		//if(carta.elementoCarta == "Agua" || carta.elementoCarta=="Terra")
			//return true;
		//else
			//return false;
		
		if(carta instanceof Agua || carta instanceof Terra)
			return true;
		else
			return false;
		
	}

	@Override
	public boolean desvantagem(Carta carta) {
		//if(carta.elementoCarta == "Fogo" )
			//return true;
		//else
			//return false;
		if(carta instanceof Fogo)
			return true;
		else
			return false;
	}

}
