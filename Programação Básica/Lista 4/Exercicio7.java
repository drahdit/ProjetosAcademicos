/*
 * Escreva um algoritmo no qual o usuário digitará dez números. Calcule e imprima o 
 * cubo de cada número. 
 */

package br.edu.ifgoiano;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			int a = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número"));
			System.out.println("O cubo de " + a + " é: " + (int)Math.pow(a, 3));
			
		}

	}

}
