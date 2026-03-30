package entities;

public class Unidade {
	private String nome;
	private int vida;
	
	public Unidade(){
		
	}
	public Unidade(String nome, int vida) {
		this.nome = nome;
		this.vida = vida;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public void atacar() {
		System.out.println("Unidade avançando para a linha de frente!");
	}
}
