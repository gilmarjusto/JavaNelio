package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class AluguelProgram {

	public static void main(String[] args) {
		
		final int qtdeQuartos;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas Pessoas para Alugar: ");
		qtdeQuartos = sc.nextInt();
		sc.nextLine();
		
		Aluguel[] quarto = new Aluguel[10];
		
		for(int i=0; i<qtdeQuartos ; i++) {
			System.out.println("Aluguel #" + (i+1));
			
			System.out.print("Nome: " );
			String nome = sc.nextLine();
			
			System.out.print("Email: " );
			String email = sc.nextLine();
			
			System.out.print("Quarto: " );
			int nQuarto = sc.nextInt();
			sc.nextLine();
			
			quarto[nQuarto] = new Aluguel(nome,email);
			
		}

		System.out.println("Quartos Ocupados: " );
		for(int i=0 ; i<10;i++) {
			if(quarto[i]!= null) {
				System.out.println(i + ": " + quarto[i]);
			}
		}
		
		sc.close();

	}

}
