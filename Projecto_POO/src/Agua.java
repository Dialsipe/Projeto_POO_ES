
public class Agua extends Carta {

	//construtor- default
	public Agua() {
		
	}
	
	//construtor com argumentos da classe pai
	public Agua(String elementoCarta, int nivel) {
		super(elementoCarta, nivel);
		this.elementoCarta = elementoCarta;
		this.nivel = nivel;
	}


	@Override
	public boolean vantagem(Carta carta) {
		//if(carta.elementoCarta == "Fogo" || carta.elementoCarta=="Terra")
			//return true;
		//else
			//return false;
		
		if(carta instanceof Fogo || carta instanceof Terra)
			return true;
		else
			return false;
	}

	@Override
	public boolean desvantagem(Carta carta) {
		//if(carta.elementoCarta == "Planta" || carta.elementoCarta=="Eletrico")
			//return true;
		//else
			//return false;
		
		if(carta instanceof Planta || carta instanceof Eletrico)
			return true;
		else
			return false;
	}

}
