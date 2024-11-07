import javax.swing.JOptionPane;

public class L3E21 {
    public static void main(String[] args) {

        Double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));

        if (x <= 1) {
            x = 1.0;
            JOptionPane.showMessageDialog(null, "O resultado de f(x) será de: " + x, "Resultado", 1);
        }else if (x > 1 && x <= 2) {
            x = 2.0;
            JOptionPane.showMessageDialog(null, "O resultado de f(x) será de: " + x, "Resultado", 1);
        }else if (x > 2 && x <= 3) {
            Double y = Math.pow(x, 2);
            JOptionPane.showMessageDialog(null, "O resultado de f(x) será de: " + y, "Resultado", 1);
        }else if (x > 3) {
            Double y = Math.pow(x, 3);
            JOptionPane.showMessageDialog(null, "O resultado de f(x) será de: " + y, "Resultado", 1);
        }
    }
}
