/*
 * Crie um programa em Java que leia a pontuação de 10 provas de um concurso e os 
 * nomes dos respectivos participantes. Grave os dados em um vetor. Apresente um 
 * ranking dos colocados que obtiveram mais de 70 pontos. 
 */

package br.edu.ifgoiano;

import java.util.*;

public class Exercicio08 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		List<Double> notas = new ArrayList<>();
		List<String> nomes7 = new ArrayList<>();
		List<Double> notas7 = new ArrayList<>();
		
		for(int x = 0; x < 10; x++) {
			String na = "";
			for(int y = 0; y < 5; y++) {
				char k = (char)(65 + Math.random() * 26);
				na += k;
			}
			nomes.add(na);
			notas.add(Math.random()* 101.00);
			if(notas.get(x) > 70.0) {
				nomes7.add(nomes.get(x));
				notas7.add(notas.get(x));
			}
			
		}
		
		System.out.println(nomes7);
		System.out.println(notas7);
	}

}
