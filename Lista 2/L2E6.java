import javax.swing.JOptionPane;

public class L2E6 {
    public static void main(String[] args) {
        String xs = JOptionPane.showInputDialog("Digite um número de quatro algarismos:");

        int x = Integer.parseInt(xs.substring(0, 1));
        int y = Integer.parseInt(xs.substring(1, 2));
        int z = Integer.parseInt(xs.substring(2, 3));
        int w = Integer.parseInt(xs.substring(3, 4));
        int f = (x * y) / (z * w);

        System.out.println(f);
    }

}
