
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carta carta1 = new Fogo("Fogo", 1);
		Carta carta2 = new Agua("Agua", 1);
		
		carta1.desvantagem(carta2);
		System.out.println(carta1.desvantagem(carta2));
		System.out.println(carta1.getNivel());
		
		
	}

}
