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
