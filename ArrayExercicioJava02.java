package br.com.generation.array;

import java.util.Scanner;

public class ArrayExercicioJava02 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int[] lancamentos = new int[10];
		
		int i = 0;
		int media = 0;
		int soma = 0;
		
		
		System.out.println("Digite os valores dos lan�amentos do dado: ");
		for(i = 0; i < 10; i++) {
		lancamentos[i] = leia.nextInt();
		
		System.out.println("Lan�amento: "+ (i + 1) + "|"+ lancamentos[i]);
		lancamentos[i] = leia.nextInt();
		
		soma = soma + lancamentos[i];
		media = soma / 10;	
		
	}
		System.out.println("A m�dia dos lan�amentos: " + media);
		

        leia.close();
	}

}
