import javax.swing.JOptionPane;

public class Exercicio24 {
    public static void main(String[] args) {
        String as = JOptionPane.showInputDialog("Digite um valor a:");
        String bs = JOptionPane.showInputDialog("Digite um valor b:");

        Double a = Double.parseDouble(as);
        Double b = Double.parseDouble(bs);
        Double c = Math.pow((a + b), 2);

        JOptionPane.showMessageDialog(null, "O quadrado da soma desses números é: " + c, "Resultado", 1);

    }

}
