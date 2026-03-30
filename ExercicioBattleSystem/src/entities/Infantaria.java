package entities;

public class Infantaria extends Unidade{
	private int soldadosNoPelotao;
	
	public Infantaria() {
		
	}
	public Infantaria(String nome, int vida, int soldadosNoPelotao) {
		super(nome, vida);
		this.soldadosNoPelotao = soldadosNoPelotao;
	}
	public int getSoldadosNoPelotao() {
		return soldadosNoPelotao;
	}
	public void setSoldadosNoPelotao(int soldadosNoPelotao) {
		this.soldadosNoPelotao = soldadosNoPelotao;
	}
	@Override
	public void atacar() {
		super.atacar();
		System.out.println("Fuzilaria iniciada pelo pelotão!");
	}
	public void sofrerFadiga() {
		setVida(getVida() - 10);
	}
}
