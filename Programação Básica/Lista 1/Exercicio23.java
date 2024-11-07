import javax.swing.JOptionPane;

public class Exercicio23 {
    public static void main(String[] args) {
        
        String x = JOptionPane.showInputDialog("Digite um valor inteiro:");

        Double y = Double.parseDouble(x);
        Double z = Math.pow(y, 2.0);
        Double w = Math.pow(y, 3.0);

        JOptionPane.showMessageDialog(null, "O quadrado deste valor é:" + z, "Valor", 1);
        JOptionPane.showMessageDialog(null, "O cubo deste valor é:" + w, "Valor", 1);
    }

}
