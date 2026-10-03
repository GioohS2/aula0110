package aula0110;

public class Ferrari implements Veiculo {

	@Override 
	public void ligar() {
		System.out.println(" A Ferrari está ligando ");
	}
	
	@Override 
	public void desligar() {
		System.out.println(" A Ferrari está desligando ");
	}
	
	@Override 
	public void manobrar() {
		System.out.println(" A Ferrari está manobrando ");
	}
	
	@Override
	public void engatar() {
		System.out.println(" A Ferrari está engatando ");
	}
	
	@Override 
	public void acelerar() {
		System.out.println(" A Ferrari está acelerando ");
	}
	
	@Override
	public void frear() {
		System.out.println(" A Ferrari está freando ");
	}
}
