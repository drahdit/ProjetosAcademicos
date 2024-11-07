/*
 * Faça um programa em Java que determine quantos números maior que 100 há em um 
 * vetor de inteiros com 20 elementos.
 */

package br.edu.ifgoiano;

import java.util.*;

public class Exercicio03 {

	public static void main(String[] args) {
		List<Integer> marcos = new ArrayList<>();
		List<Integer> maior100 = new ArrayList<>();
		
		for(int x = 0; x < 20; x++) {
			marcos.add((int)(Math.random() * 201));
			if(marcos.get(x) > 100) {
				maior100.add(marcos.get(x));
			}
			
		}
		System.out.println("Vetor x: " + marcos);
		System.out.println("Ele possuí " + maior100.size() + " valores maiores que 100");
	}

}

