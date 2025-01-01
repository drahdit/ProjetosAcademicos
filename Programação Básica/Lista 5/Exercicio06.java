/*
 * Faça um programa em Java que crie um vetor de 26 elementos do tipo String. Cada 
 * elemento do vetor deve conter uma letra do alfabeto, onde o seu índice é dado pela 
 * ordem da letra no alfabeto (exemplo: ‘A’ = 1, ‘B’ = 2, ‘C’ = 3, ...). Imprima os índices: 
 * 18; 7; 0; 17; 8; 13; 6; 0; 13. 
 */

package br.edu.ifgoiano;

import java.util.*;

public class Exercicio06 {

	public static void main(String[] args) {
		List<Integer> kk = new ArrayList<>(Arrays.asList(18, 7, 0, 17, 8, 13, 6, 0, 13));
		List<Character> mm = new ArrayList<>();
		for(int n = 0; n < 9; n++) {
			char a = (char)(65 + kk.get(n));
			mm.add(a);
		}
		System.out.println(mm);
	}

}
