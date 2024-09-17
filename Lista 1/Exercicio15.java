/*Faça um algoritmo que leia uma temperatura em Fahrenheit a apresente convertida 
em graus Celsius. A fórmula de conversão é C = (F – 32) * (5 / 9), na qual F é a 
temperatura em Fahrenheit C é a temperatura em Celsius. */

import javax.swing.JOptionPane;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Double a = Double.parseDouble(JOptionPane.showInputDialog("Qual a temperatura em Fahrenheit?"));
		Double b = a - 32;
		Double ba = 5.0 / 9.0;
		Double c = b * ba;
		
		System.out.println(ba);
		System.out.println(c);

	}

}
