/*
 * Crie um programa em Java que leia quinze números do usuário e armazene em um 
 * vetor a raiz quadrada de cada número. Caso o valor digitado seja menor que zero o 
 * número –1 deve ser atribuído ao elemento do vetor. Após isso, o programa deve 
 * imprimir todos os valores armazenados. Use o método Math.sqrt(x) para calcular a raiz 
 * quadrada de um número. 
 */

package br.edu.ifgoiano;

import java.util.*;

public class Exercicio09 {

	public static void main(String[] args) {
		List<Integer> x = new ArrayList<>();
		for(int y = 0; y <= 14; y++) {
			x.add((int)(Math.random() * 100 -50));
			
			if(x.get(y) < 0) {
				x.set(y, -1);
			}else {
				int z = x.get(y);
				x.set(y, (int)(Math.sqrt(z)));
			}
		}
		System.out.println(x);
	}

}
