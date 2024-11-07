/*Faça um algoritmo que: 
• Obtenha o valor para a variável HT (horas trabalhadas no mês) digitado pelo 
usuário; 
• Obtenha o valor para a variável VH (valor hora trabalhada) digitado pelo 
usuário; 
• Obtenha o valor para a variável PD (percentual de desconto) digitado pelo 
usuário; 
• Calcule o salário bruto => SB = HT * VH; 
• Calcule o total de desconto => TD = (PD/100)*SB; 
• Calcule o salário líquido => SL = SB – TD; 
• Exiba na tela os valores de: Horas trabalhadas, Salário Bruto, Desconto, Salário 
Liquido.*/
	
import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Double a = Double.parseDouble(JOptionPane.showInputDialog("Quantas horas você trabalhou no mês?"));
		Double b = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da hora trabalhada?"));
		Double c = Double.parseDouble(JOptionPane.showInputDialog("Qual o percentual de desconto?"));
		
		int teste = 1;
		
		Double sb = a * b;
		Double td = (c / 100)*sb;
		Double sl = sb - td;
		
		System.out.println("O salário bruto é de " + sb);
		System.out.println("O total de desconto é de " + td);
		System.out.println("O salário líquido é de " + sl);
		

	}

}
