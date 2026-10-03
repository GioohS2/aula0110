package aula0110;
public abstract class VeicuLos {
	
	private String placa;
	private String modelo;
	private String cor;
	private int ano;
	
	public VeicuLos(String placa, String modelo, String cor, int ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}

	public abstract void acelerar();
	public abstract void frear();
	public abstract void virar();
	public abstract void ligar();
}
