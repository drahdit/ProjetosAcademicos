import javax.swing.JOptionPane;

public class L3E23 {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite seu destino: \n1) Região Norte \n2) Região Norte \n3) Região Centro-Oeste \n4) Região Sul"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("A viagem é de ida e volta? \n1) Sim \n2) Não"));

        if (x == 1) {
            int n = 500;
            if (y == 1) {
                int v = n + 400;
                JOptionPane.showMessageDialog(null, "Região: Norte \nIda e volta: Sim \nValor: R$" + v, "Resultado", 1);
            }else if (y == 2) {
                JOptionPane.showMessageDialog(null, "Região: Norte \nIda e volta: Não\nValor: R$" + n, "Resultado", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione uma opção válida!", "Resultado", 1);
            }
        }else if (x == 2) {
            int ne = 350;
            if (y == 1) {
                int v = ne + 300;
                JOptionPane.showMessageDialog(null, "Região: Nordeste \nIda e volta: Sim\nValor: R$" + v, "Resultado", 1);
            }else if (y == 2) {
                JOptionPane.showMessageDialog(null, "Região: Nordeste \nIda e volta: Não\nValor: R$" + ne, "Resultado", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione uma opção válida!", "Resultado", 1);
            }
        }else if (x == 3) {
            int co = 350;
            if (y == 1) {
                int v = co + 250;
                JOptionPane.showMessageDialog(null, "Região: Centro-Oeste \nIda e volta: Sim\nValor: R$" + v, "Resultado", 1);
            }else if (y == 2) {
                JOptionPane.showMessageDialog(null, "Região: Centro-Oeste \nIda e volta: Não\nValor: R$" + co, "Resultado", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione uma opção válida!", "Resultado", 1);
            }
        }else if (x == 4) {
            int  s = 300;
            if (y == 1) {
                int v = s + 250;
                JOptionPane.showMessageDialog(null, "Região: Sul \nIda e volta: Sim\nValor: R$" + v, "Resultado", 1);
            }else if (y == 2) {
                JOptionPane.showMessageDialog(null, "Região: Sul \nIda e volta: Não\nValor: R$" + s, "Resultado", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Selecione uma opção válida!", "Resultado", 1);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma opção válida!", "Resultado", 1);
        }
    }

}
