package aula19_Arrays;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a
		 * tabuada de cada um dos elementos do vetor A.
		 */
		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[5];
		for (int x = 0; x < vetorA.length; x++) {
			System.out.println("Entre com o valor da posicao " + (x + 1));
			vetorA[x] = ler.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("A tabuada de :" + vetorA[i] + ":");
			for (int j = 1; j <= vetorA.length*2; j++) {
				System.out.println(vetorA[i] + " X " + j + " = " + (vetorA[i] * j));
			}
		}
	}
}
