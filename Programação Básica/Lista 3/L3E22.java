import javax.swing.JOptionPane;

public class L3E22 {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7:"));

        if (x == 1) {
            JOptionPane.showMessageDialog(null, "O dia correspondente é domingo.", "Resultado", 1);
        }else if (x == 2) {
            JOptionPane.showMessageDialog(null, "O dia correspondente é segunda.", "Resultado", 1);
        }else if (x == 3) {
            JOptionPane.showMessageDialog(null, "O dia correspondente é terça.", "Resultado", 1);
        }else if (x == 4) {
            JOptionPane.showMessageDialog(null, "O dia correspondente é quarta.", "Resultado", 1);
        }else if (x == 5) {
            JOptionPane.showMessageDialog(null, "O dia correspondente é quinta.", "Resultado", 1);
        }else if (x == 6) {
            JOptionPane.showMessageDialog(null, "O dia correspondente é sexta.", "Resultado", 1);
        }else if (x == 7) {
            JOptionPane.showMessageDialog(null, "O dia correspondente é sábado.", "Resultado", 1);
        }
    }
}
