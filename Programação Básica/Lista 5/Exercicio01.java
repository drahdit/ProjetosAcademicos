/*
 * Crie um programa em Java que leia um vetor de 40 posições. Contar e escrever 
 * quantos valores pares ele possui.
 */

package br.edu.ifgoiano;

import java.util.*;

public class Exercicio01 {

	public static void main(String[] args) {
		List<Integer> marcos = new ArrayList<>();
		List<Integer> pares = new ArrayList<>();
		
		for(int x = 0; x < 40; x++) {
			marcos.add((int)(Math.random() * 41));
			if(marcos.get(x) % 2 == 0) {
				pares.add(marcos.get(x));
			}
			
		}
		System.out.println("Vetor x: " + marcos);
		System.out.println("Ele possuí " + pares.size() + " valores pares");
	}

}
