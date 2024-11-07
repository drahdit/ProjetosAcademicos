/*Faça um algoritmo que leia uma temperatura em graus Celsius e apresente-a 
convertida em graus Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5, na 
qual F é a temperatura em Fahrenheit C é a temperatura em Celsius.*/
	
import javax.swing.JOptionPane;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Double a = Double.parseDouble(JOptionPane.showInputDialog("Qual a temperatura em °C?"));
		Double f = (9 * a + 160) / 5;
		
		System.out.println(f);
		
	}

}
