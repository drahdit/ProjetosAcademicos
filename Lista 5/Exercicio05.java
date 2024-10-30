/*
 * Faça um programa em Java que carregue um vetor de 15 posições com valores 
 * aleatórios variando entre 100 e 1000. O programa deverá calcular e mostrar: 
 * a) O maior elemento do vetor e em que posição esse elemento se encontra; 
 * b) O menor elemento do vetor e em que posição esse elemento se encontra. 
 */

package br.edu.ifgoiano;

import java.util.*;

public class Exercicio05 {

	public static void main(String[] args) {
		
		List<Integer> v1 = new ArrayList<>();
		int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, p1 = 0, p2 = 0;
		
		for(int x = 0; x < 15; x++) {
			v1.add((int)(100 + Math.random() * 901));
			if(v1.get(x) > maior) {
				maior = v1.get(x);
				p1 = (x + 1);
			}
			
			if(v1.get(x) < menor) {
				menor = v1.get(x);
				p2 = (x + 1);
			}
		}
		System.out.println("O vetor é: " + v1);
		System.out.println("O maior valor é " + maior + ", e sua posição é " + p1);
		System.out.println("O menor valor é " + menor + ", e sua posição é " + p2);
		
	}

}
