import javax.swing.*;

public class Exercicio19 {
    public static void main(String[] args) {

        String produto = JOptionPane.showInputDialog("Digite o valor do produto:");
        Double x = Double.parseDouble(produto);
        Double y = x / 5;

        JOptionPane.showMessageDialog(null, "Valor das prestações: " + y, produto, 1);

    }
}
