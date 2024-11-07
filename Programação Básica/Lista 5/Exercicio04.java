/*
 * Faça um programa em Java que preencha um vetor de 500 posições com números 
 * aleatórios variando entre 1 e 20000. Imprima o vetor gerado. Use o método 
 * Math.random() para gerar um número aleatório. Exemplo:  
 * 1 + (int) (Math.random() * 100)  gera um número entre 1 e 100.
 */

package br.edu.ifgoiano;

import java.util.*;

public class Exercicio04 {

	public static void main(String[] args) {
		List<Integer> marcos = new ArrayList<>();
		
		for(int x = 0; x < 500; x++) 
			marcos.add((int)(Math.random() * 200001));
		
		System.out.println("Vetor x: " + marcos);	

	}

}
