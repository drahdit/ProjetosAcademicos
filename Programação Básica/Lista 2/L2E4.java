import javax.swing.JOptionPane;

public class L2E4 {
    public static void main(String[] args) {
        Double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do círculo:"));
        Double y = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo:"));
        Double z = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo:"));

        Double ac = 3.14 * Math.pow(x, 2);
        Double at = (y * z) / 2.0;
        Double d = at - ac;

        JOptionPane.showMessageDialog(null, "Área do círculo: " + ac + ".\nÁrea do triângulo: " + at + ".\nDiferença de um pelo outro: " + d, "Resposta", 1);
        
    }

}
