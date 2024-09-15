

import javax.swing.*;

public class Exercicio16 {

	public static void main(String[] args) {
		
		String Salário = JOptionPane.showInputDialog("Digite seu salário");

		Double slb = Double.parseDouble(Salário);
		Double d1 = slb * 0.10;
		Double d2 = slb * 0.05;
		Double sll = slb - d1 - d2;
		
		System.out.println(sll);
		JOptionPane.showMessageDialog(null, "Seu salário será de:" + sll, "Salário", 1);


	}
}
