package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

import entities.Employee;

public class EmployeeProgram {

	public static void main(String[] args) {
		
		Integer id=0;
		String name=" ";
		Double salary=0.00;
		
		List<Employee> list = new ArrayList<>();
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("How many employees will be registered?");
		int q = sc.nextInt();
		sc.nextLine();		
		
		for(int i=0 ; i<q; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1));
			System.out.print("Id: " );
			id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			name = sc.nextLine();
			
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
			}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idTmp = sc.nextInt();
		sc.nextLine();
		int pos = position(list, idTmp);
		if(pos == -1) {
			System.out.println("This id does not exist!!!");			
		}
		else
		{
			System.out.print("Enter the percentage : ");
			double pIncrease = sc.nextDouble();
			list.get(pos).setIncreaseSalary(pIncrease);
		}
		System.out.println();
		System.out.println("List of Employees: ");
		for(Employee emp : list) {
			System.out.println(emp);
		}		
		
		sc.close();
	}
		
	public static int position(List<Employee> list, int id) {
		for(int i=0  ; i < list.size() ; i++) {
			if(list.get(i).getId() == id) {
				return i;
			}		
		}
		return -1;
	}



}
