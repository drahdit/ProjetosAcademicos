/*
 * Escreva um algoritmo que realize a potência de A (número real) por B (número 
 * inteiro e positivo), ou seja, AB, 
 * através de multiplicações sucessivas. Esses dois valores 
 * são passados pelo usuário através do teclado. 
 */

package br.edu.ifgoiano;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
		int z = 1;
		
		for(int a = 1; a <= y; a++) {
			z *= x;
		}
		System.out.println(z);

	}

}
