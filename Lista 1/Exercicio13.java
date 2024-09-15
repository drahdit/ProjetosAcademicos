import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Double a = Double.parseDouble(JOptionPane.showInputDialog("Quantas horas você trabalhou no mês?"));
		Double b = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da hora trabalhada?"));
		Double c = Double.parseDouble(JOptionPane.showInputDialog("Qual o percentual de desconto?"));
		
		Double sb = a * b;
		Double td = (c / 100)*sb;
		Double sl = sb - td;
		
		System.out.println("O salário bruto é de " + sb);
		System.out.println("O total de desconto é de " + td);
		System.out.println("O salário líquido é de " + sl);
		

	}

}
