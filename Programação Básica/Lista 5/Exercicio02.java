/*
 * Crie um programa em Java que leia dois vetores de 20 posições e calcule um outro 
 * vetor contendo, nas posições pares os valores do primeiro e nas posições impares os 
 * valores do segundo. 
 */

package br.edu.ifgoiano;

import java.util.*;

public class Exercicio02 {

	public static void main(String[] args) {
		List<Integer> v1 = new ArrayList<>();
		List<Integer> v2 = new ArrayList<>();
		List<Integer> v3 = new ArrayList<>();
		
		for(int x = 0; x < 20; x++) {
			v1.add((int)(Math.random() * 21));
			v2.add((int)(Math.random() * 21));
		}

		for(int x = 0; x < 20; x++) {
			if((x + 1) % 2 == 0) {
				v3.add(v2.get(x));
			}else {
				v3.add(v1.get(x));
			}
		}
		System.out.println(v3);
	}

}
