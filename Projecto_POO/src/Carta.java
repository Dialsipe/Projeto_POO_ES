
public abstract class Carta {
	
	//atributos
	protected String elementoCarta; //O elemento da carta não poderá ser mudado
	protected int nivel = 1;
	
	
	//metodos abstratos
	public abstract boolean vantagem(Carta carta);
	public abstract boolean desvantagem(Carta carta);
	
	//contrutores
	public Carta() {
		
	}
	
	public Carta(String elementoCarta, int nivel) {
		super();
		this.elementoCarta = elementoCarta;
		this.nivel = nivel;
	}
	
	//acessores
	
	public int getNivel() {
		return nivel;
	}
	
	public String getElementoCarta() {
		return elementoCarta;
	}
	
	//comportamento
	
	
	
}
