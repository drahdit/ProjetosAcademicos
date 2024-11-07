import javax.swing.JOptionPane;

public class Exercicio21 {
    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Digite um número");
        String n2 = JOptionPane.showInputDialog("Digite outro número");
        String n3 = JOptionPane.showInputDialog("Digite outro número");
        String n4 = JOptionPane.showInputDialog("Digite outro número");

        int nn1 = Integer.parseInt(n1);  
        int nn2 = Integer.parseInt(n2);  
        int nn3 = Integer.parseInt(n3);  
        int nn4 = Integer.parseInt(n4);  
        int soma = nn1 + nn2 + nn3 + nn4;
        int multiplicação = nn1 * nn2 * nn3 * nn4;

        JOptionPane.showMessageDialog(null, "A soma desses números será de: " + soma + ".\nA multiplicação desses números será de: " + multiplicação, "Resultados", 1);

    }
}
