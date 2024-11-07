import javax.swing.*;

public class Exercicio17 {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o nome do vendedor");
        String vendas = JOptionPane.showInputDialog("Digite o número de vendas esse mês (Em R$)");

        Double vendasd = Double.parseDouble(vendas);
        Double comissão = vendasd * 0.15;
        Double sll = vendasd + comissão;

        JOptionPane.showMessageDialog(null, "Nome do vendedor: " + nome + ".\nSalário fixo: " + vendasd + ".\nSalário com comissão: " + sll, vendas, 1);

    }

}
