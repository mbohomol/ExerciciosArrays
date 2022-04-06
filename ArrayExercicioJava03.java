package br.com.generation.array;

import java.util.Scanner;

public class ArrayExercicioJava03 {

	public static void main(String[] args) {

		int l =0;
		int c = 0;
		
    Scanner leia = new Scanner (System.in);
	
	int[][] n1 = new int [2][3];
	int[][] n2 = new int [2][3];
	int[][] m1 = new int [2][3];
	int[][] m2 = new int [2][3];

	System.out.println("Digite os valores da matriz n1 ");
	for (l = 0; l < n1 .length; l++) {
		for (c = 0; c<n1 [l].length; c++) {

	System.out.printf("Digite os valores na posição %d %d: " , l,c); 
			n1[l][c] = leia.nextInt();
			
		}
		System.out.println();
	}
	System.out.println("Digite os valores da matriz n2 ");
	for (l = 0; l < n2 .length; l++) {
		for (c = 0; c < n2 [l].length; c++) {
			
	System.out.printf("Digite os valores na posição %d %d: " , l,c); 
			n2[l][c] = leia.nextInt();
			
		}
		System.out.println();
	}
	leia.close();
	System.out.print("Matriz m1: \n");
	
	for (l = 0; l< m1 .length; l++) {
		for (c = 0; c < m1 [l].length; c++) {
			m1[l][c] = n1[l][c] + n2[l][c];
		
	System.out.print( m1[l][c] + "|");
		}
	System.out.println();
	}
	
	System.out.print("\nMatriz m2: \n");
	for (l = 0; l < m2 .length; l++) {
		for (c = 0; c < m2 [l].length; c++) {
			m2[l][c] = n1[l][c] - n2[l][c];
			System.out.print(m2[l][c] + "|");
		}
	System.out.println();
	}
	}

}
