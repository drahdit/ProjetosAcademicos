import javax.swing.JOptionPane;

public class L3E17 {
    public static void main(String[] args) {
        Double x = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário médio do último ano:"));
        
        if (x >= 0 && x <= 500) {
            JOptionPane.showMessageDialog(null, "Salário médio anual: R$" + x + ".\nNão há empréstimo disponível.", "Resultado", 1);
        }else if (x >= 501 && x <= 1000) {
            Double y = x * 0.3;
            JOptionPane.showMessageDialog(null, "Salário médio anual: R$" + x + ".\nEmpréstimo disponível: R$" + y, "Resultado", 1);
        }else if (x >= 1001 && x <= 3000) {
            Double y = x * 0.4;
            JOptionPane.showMessageDialog(null, "Salário médio anual: R$" + x + ".\nEmpréstimo disponível: R$" + y, "Resultado", 1);
        }else if (x >= 3001) {
            Double y = x * 0.5;
            JOptionPane.showMessageDialog(null, "Salário médio anual: R$" + x + ".\nEmpréstimo disponível: R$" + y, "Resultado", 1);
        }
    
    }

}
