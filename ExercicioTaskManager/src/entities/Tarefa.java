package entities;

public class Tarefa {
	private String descricao;
	private int horasEstimadas;
	
	public Tarefa() {
		
	}
	public Tarefa(String descricao, int horasEstimadas) {
		this.descricao = descricao;
		this.horasEstimadas = horasEstimadas;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	public void finalizar() {
		System.out.print("Tarefa CONCLUÍDA com sucesso!");
	}
}
