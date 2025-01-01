/*
 * Crie um programa em Java que que receba a altura de 10 atletas. Esse programa 
 * deve imprimir a altura daqueles atletas que tem altura maior que a média. 
 */

package br.edu.ifgoiano;

import java.util.*;

public class Exercicio10 {
	public static void main(String[] args) {
		List<Double> alt = new ArrayList<>();
		List<Double> mm = new ArrayList<>();
		
		double m = 0.0;
		
		for(int x = 0; x <= 9; x++) {
			alt.add(1 + Math.random() * 1.5);
			m += alt.get(x);
		}
		double media = m / 10;
		for(int x = 0; x <= 9; x++) {
			if(alt.get(x) > media) {
				mm.add(alt.get(x));
			}
		}
		System.out.println("A altura dos jogadores é:");
		System.out.println(alt);
		System.out.println("Os jogadores maiores que a média são:");
		System.out.println(mm);
	}

}
