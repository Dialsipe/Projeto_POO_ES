
public abstract class Carta {
	
	//atributos
	protected String elementoCarta; //O elemento da carta não poderá ser mudado
	protected int poderCarta = 5;
	protected int nivel = 1;
	
	
	//metodos abstratos
	public abstract boolean vantagem(Carta carta);
	public abstract boolean desvantagem(Carta carta);
	public abstract boolean neutro(Carta carta);
	
	//contrutores
	public Carta() {
		
	}
	
	public Carta(String elementoCarta  , int poderCarta, int nivel) {
		super();
		this.elementoCarta = elementoCarta;
		this.poderCarta = poderCarta;
		this.nivel = nivel;
	}
	
	//acessores
	
	public double getPoderCarta() {
		return poderCarta;
	}
	
	
	public int getNivel() {
		return nivel;
	}
	
	public String getElementoCarta() {
		return elementoCarta;
	}
	
	//comportamento
	
	public void upgrade() {
		nivel+=1;
		poderCarta = poderCarta + 5;
	}
	
	
}
