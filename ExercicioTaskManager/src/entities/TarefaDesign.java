package entities;

public class TarefaDesign extends Tarefa{
	private String ferramenta;
	
	public TarefaDesign() {
		
	}
	public TarefaDesign(String descricao, int horasEstimadas, String ferramenta) {
		super(descricao, horasEstimadas);
		this.ferramenta = ferramenta;
	}
	public String getFerramenta() {
		return ferramenta;
	}
	public void setFerramenta(String ferramenta) {
		this.ferramenta = ferramenta;
	}
	public void gerarPrototipo() {
		System.out.print("\nExportando protótipo no Figma...");
	}
}
