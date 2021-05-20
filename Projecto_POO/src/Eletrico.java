
public class Eletrico extends Carta {
	
	
	//construtor- default
	public Eletrico() {
		
	}
	
	//construtor com argumentos da classe pai
	public Eletrico(String elementoCarta, int nivel) {
		super(elementoCarta, nivel);
		this.elementoCarta = elementoCarta;
		this.nivel = nivel;
	}
	
	
	@Override
	public boolean vantagem(Carta carta) {
		//if(carta.elementoCarta == "Agua")
			//return true;
		//else
			//return false;
		
		if(carta instanceof Agua)
			return true;
		else
			return false;
	}

	@Override
	public boolean desvantagem(Carta carta) {
		//if(carta.elementoCarta=="Terra")
			//return true;
		//else
			//return false;
		
		if(carta instanceof Terra)
			return true;
		else
			return false;
	}


}
