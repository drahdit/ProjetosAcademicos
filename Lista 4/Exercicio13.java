/*
 * Escreva um algoritmo que calcule o fatorial do número N, cujo valor é obtido 
 * através do usuário pelo teclado. Exemplo: fatorial de 5 
 * 5! = 5 x 4 x 3 x 2 x 1 = 120 
 */

package br.edu.ifgoiano;

import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		int fat = 1;
		
		for(int a = 1; a <= x; a++) {
			fat *= a;
		}
		
		System.out.println(fat);

	}

}