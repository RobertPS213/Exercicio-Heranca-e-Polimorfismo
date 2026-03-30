package entities;

public class TarefaCodigo extends Tarefa{
	private String linguagem;
	
	public TarefaCodigo() {
		
	}
	public TarefaCodigo(String descricao, int horasEstimadas, String linguagem) {
		super(descricao, horasEstimadas);
		this.linguagem = linguagem;
	}
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public void rodarTestesUnitarios() {
		System.out.println("\nExecutando testes JUNIT...");
	}
}
