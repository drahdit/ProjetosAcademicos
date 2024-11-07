import javax.swing.JOptionPane;

public class L3E20 {
    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado A do triângulo:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado B do triângulo:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado C do triângulo:"));

        if (a == b && b == c) {
            JOptionPane.showMessageDialog(null, "Lado A: " + a + ".\nLado B: " + b + ".\nLado C: " + c + ".\nEste triângulo será equilátero.", "Resultado", 1);
        }else if (a != b && b != c && c != a) {
            JOptionPane.showMessageDialog(null, "Lado A: " + a + ".\nLado B: " + b + ".\nLado C: " + c + ".\nEste triângulo será isósceles.", "Resultado", 1);
        }else if (a == b && b != c || b == c && c != a || c == a && a != b) {
            JOptionPane.showMessageDialog(null, "Lado A: " + a + ".\nLado B: " + b + ".\nLado C: " + c + ".\nEste triângulo será escaleno.", "Resultado", 1);
        }
    }

}
