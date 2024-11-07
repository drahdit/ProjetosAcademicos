/*
 * Escreva um algoritmo que receba 15 números. Calcule e imprima quantos números 
 * maiores que 30 foram digitados. 
 */

package br.edu.ifgoiano;
import java.util.*;
import javax.swing.*;

public class Exercicio11 {

	public static void main(String[] args) {
		
		List<Integer> marcos = new ArrayList<>();
		List<Integer> narcos = new ArrayList<>();
		for(int a = 1; a <= 15; a++) {
			int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número qualquer:"));
			marcos.add(b);
		}
		for(int a = 0; a <= 14; a++) {
			if(marcos.get(a) > 30) {
				narcos.add(a);
			}
		}
		System.out.println("Números maiores que 30: " + narcos.size());

	}

}
