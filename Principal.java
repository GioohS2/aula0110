package aula0110;

public class Principal {

	public static void main(String[] args) {
		Lobo lobo = new Lobo();
		Gato gato = new Gato();
		
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();
		
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();

	}

}
