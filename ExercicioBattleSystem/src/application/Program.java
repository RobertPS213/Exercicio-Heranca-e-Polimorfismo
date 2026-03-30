package application;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import entities.Unidade;
import entities.Tanque;
import entities.Infantaria;

public class Program {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Unidade> listaUnidade = new ArrayList<>();
		System.out.print("Enter the number of units: ");
		int x = sc.nextInt();
		for(int i = 0; i < x; i++) {
			sc.nextLine();
			System.out.print("\n---Unit #" + (i + 1) + " data---\n");
			System.out.print("Tank or Infantry (t/i): ");
			char escolha = sc.next().toUpperCase().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Health: ");
			int vida = sc.nextInt();
			if(escolha == 'T') {
				System.out.print("Fuel level: ");
				double combustivel = sc.nextDouble();
				Unidade unidade = new Tanque(nome, vida, combustivel);
				listaUnidade.add(unidade);
			} else{
				System.out.print("Number of soldiers: ");
				int numeroSoldados = sc.nextInt();
				Unidade unidade = new Infantaria(nome, vida, numeroSoldados);
				listaUnidade.add(unidade);
			}	
		}
		for(Unidade u: listaUnidade) {
			System.out.print("\n\n" + u.getNome() + ": ");
		    u.atacar();
			if(u instanceof Tanque) {
				Tanque t = (Tanque) u;
				System.out.print("(Lógica interna: O Tanque agora tem " + t.getCombustivel() + " de combustível)\n");
			} else if(u instanceof Infantaria) {
				System.out.print("\n\n" + u.getNome() + ": ");
				u.atacar();
			}
		}
		System.out.print("\n--- LOGISTICS CHECK ---\n");
		for(Unidade u: listaUnidade) {
			if(u instanceof Tanque) {
				Tanque t = (Tanque) u;
				if(t.getCombustivel() < 20) {
					System.out.print("ALERTA: Tanque " + t.getNome() + " precisa de reabastecimento!\n");
				}
			} else if(u instanceof Infantaria) {
				Infantaria i = (Infantaria) u;
				i.sofrerFadiga();
				System.out.print("Soldados de " + i.getNome() + " sofreram fadiga. Vida atual: " + i.getVida());
			}
		}
		sc.close();
	}
}
