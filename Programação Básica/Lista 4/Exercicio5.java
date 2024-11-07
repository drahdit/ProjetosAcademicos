/*
 * Escreva um algoritmo que imprima os 100 primeiros números ímpares.
 */

package br.edu.ifgoiano;

public class Exercicio5 {

	public static void main(String[] args) {
		for(int i = 1; i <= 200; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
