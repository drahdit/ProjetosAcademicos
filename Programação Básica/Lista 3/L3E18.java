import javax.swing.JOptionPane;

public class L3E18 {
    public static void main(String[] args) {

        int x = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));

        if (x < 18) {
            JOptionPane.showMessageDialog(null, "Menor de idade", "Resultado", 1);
        }else if (x >= 18 && x < 65) {
            JOptionPane.showMessageDialog(null, "Maior de idade", "Resultado", 1);
        }else if (x >= 65) {
            JOptionPane.showMessageDialog(null, "Idoso", "Resultado", 1);
        }
    }
}
