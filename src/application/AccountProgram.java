package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class AccountProgram {

	public static void main(String[] args) {

		String holder;
		int number = 0;
		char initialDeposit = ' ';
		double value = 0;
		Account account;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter account number: ");
		number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder Name: ");
		holder = sc.nextLine();
		
		while(initialDeposit != 'y' && 
			  initialDeposit != 'Y' &&
			  initialDeposit != 'n' &&
			  initialDeposit != 'N') {
			System.out.print("\nIs there an initial deposit(y/n)? ");
			initialDeposit = sc.next().charAt(0);			

		};
			
		if (initialDeposit == 'y' || initialDeposit == 'Y') {
			System.out.print("\nEnter an initial deposit value: ");
			value = sc.nextDouble();
			account = new Account(number , holder , value);
		}
		else {			
			account = new Account(number , holder);
		}
			
		System.out.println("\nAccount data: ");
		System.out.println(account);
		
		//   ***** DEPÓSITO *****
		System.out.print("\nEnter a deposit value: ");
		value = sc.nextDouble();
		account.deposit(value);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		//   ****  SAQUE  *******
		System.out.print("\nEnter a withdraw value: ");
		value = sc.nextDouble();
		account.withDraw(value);
		System.out.println("Updated account data: ");		
		System.out.println(account);		
		
		sc.close();		

	}

}
