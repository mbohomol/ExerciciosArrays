package br.com.generation.array;

public class ArrayExercicioJava01 {

	public static void main(String[] args) {
		

		int i;
		double maior = 0;
		
		double[] pontuacao = new double[5];

		pontuacao[0] = 5.0;
		pontuacao[1] = 7.5;
		pontuacao[2] = 8.0;
		pontuacao[3] = 9.0;
		pontuacao[4] = 7.5;
		
		
		for(i=0; i<= 4; i ++) {
			System.out.println("Pontuação: " + (i + 1) + " |" + pontuacao[i]);
		
		if( i == 0) {
            maior = pontuacao[0];
		
		}
		if(pontuacao[i] > maior) {
			maior = pontuacao[i];
		}
	}
	
		System.out.println("A maior pontuação é: "  + maior);
		

	}

}
