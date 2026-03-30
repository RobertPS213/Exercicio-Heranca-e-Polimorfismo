package application;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import entities.*;

public class Program {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> listaEmployee = new ArrayList<>();
		System.out.print("Enter the number of employees: ");
		int x = sc.nextInt();
		for(int i = 0; i < x; i++) {
			sc.nextLine();
			System.out.print("--- Employee #" + (i + 1) + " data ---");
			System.out.print("\noutsourced (y/n): ");
			char outSource  = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			if(Character.toUpperCase(outSource) == 'Y') {
				sc.nextLine();
				System.out.print("Additional charge: ");
				Double adCharge = sc.nextDouble();
				Employee employee = new outsourceEmployee(name, hours, valuePerHour, adCharge);
				listaEmployee.add(employee);
			} else {
				Employee employee = new Employee(name, hours, valuePerHour);
				listaEmployee.add(employee);
			}
		}
		System.out.println("\nPAYMENTS: ");
		for(Employee em: listaEmployee) {
			System.out.print(em.getName() + " - " + " $ " + em.payment() + "\n");
		}
		sc.close();
	}
}
