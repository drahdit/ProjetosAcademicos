/*
 * Criar um algoritmo que leia os limites inferior e superior de um intervalo. Calcule e 
 * imprima todos os números pares no intervalo e seu somatório.
 */

package br.edu.ifgoiano;

import javax.swing.JOptionPane;
import java.util.*;

public class Exercicio10 {

	public static void main(String[] args) {
		int x;
		int marcos = 0;
		int y = Integer.parseInt(JOptionPane.showInputDialog("Limite Superior:"));
		
		List<Integer> Kasino = new ArrayList<>();
		for(x = Integer.parseInt(JOptionPane.showInputDialog("Limite Inferior:")); x <= y; x++) {
			if(x % 2 == 0) {
				Kasino.add(x);
			}
		}
		int n = Kasino.size();
		for(int c = 1; c < n; c++) {
			marcos += Kasino.get(c);
		}
		System.out.println("Os números são: " + Kasino);
		System.out.println("A soma deles é: " + marcos);
	}

}
