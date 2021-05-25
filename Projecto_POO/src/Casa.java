
public abstract class Casa {
	//Atributos
	protected int numero;
	
	//construtor-default
	public Casa() {
		
	}
	
	//construtor com argumentos
	public Casa(int numero) {
		super();
		this.numero = numero;
	}
	
	public abstract int aplicarEfeito();

	//Acessores
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
	
}
