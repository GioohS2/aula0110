package aula0110;

public class principalOnibus {

	public static void main(String[] args) {
		Onibus onibus = new Onibus("11111", "XB1", "Prata", 2020);
		onibus.acelerar();
		onibus.frear();
		onibus.virar();
		onibus.ligar();
		
		System.out.println("-------------------------------------------------");

		Carro carro = new Carro("00000", "F1", "Vermelho", 2023);
		carro.ligar();
		carro.acelerar();
		carro.virar();
		carro.frear();
	}

}
