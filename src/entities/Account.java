package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	public final double TAXA = 5.00;
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;		
		deposit(initialDeposit);		
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;		
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double depositValue) {
		this.balance += depositValue;
	}

	public void withDraw(double withDrawValue) {
		this.balance -= withDrawValue + TAXA;
	}
	
	public String toString() {
		return "Account " +
	            getNumber() +
	            ", Holder: " +
	            getHolder() +
	            ", Balance: $ " +
	            getBalance();
	            
	}

	
}

