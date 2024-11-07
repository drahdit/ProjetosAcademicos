import javax.swing.*;

public class Exercicio18 {
    public static void main(String[] args) {
        
        String bufunfa = JOptionPane.showInputDialog("Digite uma quantia de dinheiro em R$");
        Double real = Double.parseDouble(bufunfa);
        Double usd = real / 3.81;
        Double eur = real / 4.17;

JOptionPane.showMessageDialog(null, "Em real essa quantia é de: R$" + real + ".\nEm euro essa quantia é de: €" + eur + ".\nEm dólar essa quantia é de: $" + usd, bufunfa, 0);
    }

}
