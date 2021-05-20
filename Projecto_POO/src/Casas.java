import java.util.ArrayList;

public class Casas {

	private ArrayList<Casa> casa = new ArrayList();
	
	//construtor-default
	public Casas() {
		
	}
	
	//construtor com argumentos
	
	public Casas(ArrayList<Casa> casa) {
		super();
		this.casa = casa;
	}

	
	//Acessores
	public ArrayList<Casa> getCasa() {
		return casa;
	}

	public void setCasa(ArrayList<Casa> casa) {
		this.casa = casa;
	}
}
