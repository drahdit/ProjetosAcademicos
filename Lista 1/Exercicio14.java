import javax.swing.JOptionPane;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Double a = Double.parseDouble(JOptionPane.showInputDialog("Qual a temperatura em °C?"));
		Double f = (9 * a + 160) / 5;
		
		System.out.println(f);
		
	}

}
