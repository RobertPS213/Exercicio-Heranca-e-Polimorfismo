package entities;

public class Tanque extends Unidade{
	private double combustivel;
	
	public Tanque() {
		
	}
	public Tanque(String nome, int vida, double combustivel) {
		super(nome, vida);
		this.combustivel = combustivel;
	}
	public double getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}
	@Override
	public void atacar() {
		super.atacar();
		combustivel -= 15.00;
		System.out.println("Disparando canhão pesado!");
	}
}
