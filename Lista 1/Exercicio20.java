import javax.swing.*;

public class Exercicio20 {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Digite o custo do produto:");
        String acrescimo = JOptionPane.showInputDialog("Digite o percentual de acréscimo de venda:");

        Double v = Double.parseDouble(valor);
        Double a = Double.parseDouble(acrescimo) * 0.01;
        Double p = v * a;
        Double vf = v + p;

        JOptionPane.showMessageDialog(null, "O preço de venda do produto será de: R$" + vf, "Venda", 1);
    }
}
