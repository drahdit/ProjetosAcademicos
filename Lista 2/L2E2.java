import javax.swing.JOptionPane;

public class L2E2 {
    public static void main(String[] args) {
        Double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de votos dos docentes ao candidato:"));
        Double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o número total de votos dos doscentes:"));
        Double z = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de votos dos discentes ao candidato:"));
        Double w = Double.parseDouble(JOptionPane.showInputDialog("Digite o número total de votos dos disscentes:"));

        Double Vt = (2.0 / 3.0) * (x / y) + (1.0 / 3.0) * (z / w);
        JOptionPane.showMessageDialog(null, Vt, "Resposta", 1);
    }

}
