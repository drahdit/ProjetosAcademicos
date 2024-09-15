import javax.swing.JOptionPane;

public class L3E12 {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número a:"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite um número b:"));
        int z = Integer.parseInt(JOptionPane.showInputDialog("Digite um número c:"));
        int w = Integer.parseInt(JOptionPane.showInputDialog("Digite um número d:"));

        if (x > y && x > z && x > w) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + x, null, 1);
        }else if (y > x && y > z && y > w) {
            JOptionPane.showMessageDialog(null, "O maior número é: " + y, null, 1);
        }else if (z > x && z > w && z > y){
            JOptionPane.showMessageDialog(null, "O maior número é: " + z, null, 1);
        }else{
            JOptionPane.showMessageDialog(null, "O maior número é: " + w, null, 1);
       }
    }
}
