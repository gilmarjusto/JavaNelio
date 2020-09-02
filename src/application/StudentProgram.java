package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class StudentProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		
		System.out.print("Note1: ");
		student.note1 = sc.nextDouble();
		
		System.out.print("Note2: ");
		student.note2 = sc.nextDouble();

		System.out.print("Note3: ");
		student.note3 = sc.nextDouble();

		System.out.println(student);
		sc.close();

	}

}
