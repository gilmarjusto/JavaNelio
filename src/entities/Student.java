package entities;

public class Student {
	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double sumNotes() {
		return note1 + 
			   note2 + 
			   note3;
	}
	
	public String toString() {
		double notes = sumNotes();
		return notes > 60 ? "FINAL GRADE = " + String.format("%.2f", notes) + "\nPASS"
		                  : "FINAL GRADE = " + String.format("%.2f", notes) + "\nFAILED\nMISSING " + String.format("%.2f", 60 - notes) + " POINTS"; 
	}
	
}
