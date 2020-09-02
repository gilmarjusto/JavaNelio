package application;

import java.util.Locale;
import java.util.Scanner;

public class VectorProgram {

	public static void main(String[] args) {
		
		int n=0;
		double avg=0.00;		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de Pessoas: ");
		n = sc.nextInt();
		sc.nextLine();
		
		double[] alturas = new double[n];
		
		for(int i=0; i<n ; i++) {
			System.out.print("Altura[" + (i + 1) + "]: " );
			alturas[i] = sc.nextDouble();
			avg += alturas[i];			
		}
		if (n < 1) {
			n = 1;
		}
		avg = avg / n;
		
		System.out.printf("Altura Média: %.2f ", avg);
		
		sc.close();

	}

}
