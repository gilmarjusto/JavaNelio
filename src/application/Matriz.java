package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		int lin;
		int col;
		int[][] mat ;
		Scanner sc = new Scanner(System.in);
		lin = sc.nextInt();
		col = sc.nextInt();
		
		if(col < 0 || lin < 0){
			System.out.println("\nInforme valores maior que zeros: linha=" + lin + " x coluna=" + col);		
			return;
		}
		else
		{
			mat = new int[lin][col];
		}
		
		
		for(int l=0;l<lin;l++) {
			for(int c=0;c<col;c++) {
				mat[l][c] = sc.nextInt();
			}
		}
		int qualNum = sc.nextInt();
		System.out.println();

		for(int l=0;l<lin;l++) {
			for(int c=0;c<col;c++) {
				getPosition(l,c,qualNum,mat);				
			}
		}
		

		
		//getUp
		
		

	}
	public static String getPosition(int linha, int coluna, int qualNum, int[][] mat) {
		int l;
		int c;
		for(l=linha ; l<mat[l].length;l++) {
			for(c=coluna ; c<mat.length; c++) {
				if(mat[l][c] == qualNum) {
					System.out.println("Position: " + l + "," + c);
				}
			}
				
		}
	}
	public static String getUp(int linha, int coluna, int[][] mat) {
		
		if (linha == 0) {
			return " " ;
		}
		linha -= 1;
		System.out.println("UP: " + mat[linha][coluna]);
	}	

	public static String getDown(int linha, int coluna, int[][] mat) {
		String retorno;
		if (linha == mat.length) {
			retorno = " ";
		}
		linha += 1; teste1
		retorno = "DOWN: " + mat[linha][coluna];
		
	    return retorno;
	}	

}
