import javax.swing.JOptionPane;

public class L2E1 {
    public static void main(String[] args) {
        String xs = JOptionPane.showInputDialog("Digite um número de 5 algarismos:");
        
        int x = Integer.parseInt(xs.substring(0, 1));
        int y = Integer.parseInt(xs.substring(1, 2));
        int z = Integer.parseInt(xs.substring(2, 3));
        int e = Integer.parseInt(xs.substring(3, 4));
        int f = Integer.parseInt(xs.substring(4, 5));
        int s = 6 * x + 5 * y + 4 * z + 3 * e + 2 * f;

        JOptionPane.showMessageDialog(null, s, "Resultado", 1);
    }
}
