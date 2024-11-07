/*
 * Escreva um algoritmo que determine se um dado número N (digitado pelo usuário) 
 * é primo ou não. Um número é PRIMO se ele for divisível apenas por 1 e por ele 
 * mesmo
 */


package br.edu.ifgoiano;

import javax.swing.JOptionPane;

public class Exercicio14 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número qualquer:"));
		int n = 1;
		int a = 1;
		
		do {
			a++;
			n++;
			if(x % n == 0 && x != 2) {
				System.out.println("Este número não é primo");
				break;
			}else if(a >= x - 2) {
				System.out.println("Este número é primo");
				break;
			}
		}while(a < x - 1);
	}
}
