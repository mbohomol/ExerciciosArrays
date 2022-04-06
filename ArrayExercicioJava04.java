package br.com.generation.array;

import java.util.Scanner;

public class ArrayExercicioJava04 {

	public static void main(String[] args) {
	

		 Scanner leia = new Scanner(System.in);
	        
	        int[][] m3 = new int [3][3];
	        int soma_total = 0;
	        int soma_diagonal = 0;
	        int l = 0;
	        int c = 0;
	        int i = 0;

	for(l = 0; l < m3 .length;l++){
	for(c = 0; c < m3 [l].length;c++){
	System.out.println("Digite os valores da matriz: ");
	  
	   m3[l][c] = leia.nextInt();
	   soma_total = soma_total + m3[l][c]; 
	}
	System.out.println();
	}

	for(i = 0; i < 3; i++) {
	 soma_diagonal = soma_diagonal + m3[i][i];
	}
	 System.out.println("O valor total da matriz é: " + soma_total);
	 System.out.println("O valor da soma da diagonal é: " + soma_diagonal);

	        leia.close();

		

	}

}
