/*
 * Criar um algoritmo que leia dez números inteiros. Calcule e imprima o maior e o 
 * segundo maior número da lista. Suponha que todos os números lidos sejam positivos 
 * maiores que zero. 
 */

package br.edu.ifgoiano;

import java.util.*;

public class Exercicio9 {

	public static void main(String[] args) {

		List<Integer> Kasino = new ArrayList<>();
		int maxvalor = Integer.MIN_VALUE;
		int mmaxvalor = Integer.MIN_VALUE;

		for(int n = 0; n <= 9; n++) {
			
			int a = (int)(Math.random() * 100);
			Kasino.add(a);
			
            if(Kasino.get(n) > maxvalor) {
				maxvalor = Kasino.get(n);
			}
		}
		for(int n = 0; n <= 9; n++) {
            if(Kasino.get(n) > mmaxvalor && Kasino.get(n) < maxvalor) {
				mmaxvalor = Kasino.get(n);
			}
		}
		System.out.println("O números sorteados foram " + Kasino + "\nO maior deles é: " + maxvalor + "\nE o segundo maior é: " + mmaxvalor);
	}
}
