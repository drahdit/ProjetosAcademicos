/*
 * Criar um algoritmo que leia um número (N), e depois leia N números inteiros. 
 * Imprima o maior deles. Suponha que todos os números lidos sejam positivos maiores 
 * que zero. 
 */

package br.edu.ifgoiano;

import java.util.*;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {
        int j = Integer.parseInt(JOptionPane.showInputDialog("Digite qualquer número:"));

		List<Integer> Kasino = new ArrayList<>();
		int maxvalor = Integer.MIN_VALUE;

		for(int n = 0; n <= j; n++) {
			int a = (int)(Math.random() * 100);
			Kasino.add(a);
            if(Kasino.get(n) > maxvalor) {
				maxvalor = Kasino.get(n);
			}
		}
		
		System.out.println("O números sorteados foram " + Kasino + "\nO maior deles é " + maxvalor);
	}

}
