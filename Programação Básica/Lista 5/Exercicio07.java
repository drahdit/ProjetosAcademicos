/*
 * Crie um programa em Java que leia uma palavra. O programa deverá verificar e 
 * retornar se a palavra forma um anagrama. Uma palavra forma um anagrama quando ela 
 * é igual ao seu inverso. Exemplo: palavra: ARARA   
 * invertida: ARARA - são 
 * anagramas. 
 */

package br.edu.ifgoiano;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Digite uma palavra qualquer");
		StringBuilder a = new StringBuilder(x);
		String y = a.reverse().toString();
		
		if(x.equalsIgnoreCase(y)) {
			System.out.println("É um anagrama");
		}else {
			System.out.println("Não é um anagrama");
		}
	}
}
