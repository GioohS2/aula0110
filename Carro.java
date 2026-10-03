package aula0110;

public class Carro extends VeicuLos{
	public Carro(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
	}

	@Override
	public void acelerar() {
		System.out.println(" O Carro está acelerando ");
	}
	
	@Override
	public void frear() {
		System.out.println(" O Carro está freando ");
	}
	
	@Override
	public void virar() {
		System.out.println(" O Carro está virando ");
	}
	
	@Override
	public void ligar() {
		System.out.println(" O Carro está ligando ");
	}

}
