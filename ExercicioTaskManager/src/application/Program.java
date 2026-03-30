package application;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.TarefaDesign;
import entities.TarefaCodigo;
import entities.Tarefa;

public class Program {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<Tarefa> listaTarefas = new ArrayList<>();
		System.out.print("How many tasks: ");
		int x = sc.nextInt();
		for(int i = 0; i < x; i++) {
			System.out.print("\n-- Task #" + (i + 1) + " data ---\n");
			System.out.print("Code or Design (c/d): ");
			char escolha = sc.next().toUpperCase().charAt(0);
			sc.nextLine();
			System.out.print("Description: ");
			String descricao = sc.nextLine();
			System.out.print("Estimated hours: ");
			int horas = sc.nextInt();
			sc.nextLine();
			if(escolha == 'C') {
				System.out.print("Language: ");
				String nomeLinguagem = sc.nextLine();
				Tarefa tarefa = new TarefaCodigo(descricao, horas, nomeLinguagem);
				listaTarefas.add(tarefa);
			} else {
				System.out.print("Tool: ");
				String nomeFerramenta = sc.nextLine();
				Tarefa tarefa = new TarefaDesign(descricao, horas, nomeFerramenta);
				listaTarefas.add(tarefa);
			}
		}
		System.out.print("\n --- EXECUTION LOG --- \n");
		for(Tarefa t: listaTarefas) {
			System.out.print("Tarefa: [" + t.getDescricao() + "] ");
			t.finalizar();
			if(t instanceof TarefaCodigo) {
				TarefaCodigo tc = (TarefaCodigo) t;
				tc.rodarTestesUnitarios();
				System.out.println();
			} else if(t instanceof TarefaDesign) {
				TarefaDesign td = (TarefaDesign) t;
				td.gerarPrototipo();
				System.out.println();
			}
		}
		sc.close();
	}
}
