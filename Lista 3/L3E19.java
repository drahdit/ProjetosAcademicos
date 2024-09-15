import javax.swing.JOptionPane;

public class L3E19 {
    public static void main(String[] args) {
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));

        if (x >= 5 && x <= 7) {
            JOptionPane.showMessageDialog(null, "Idade: " + x + ".\nCategoria: Infantil A", "Resultado", 1);
        }else if (x >= 8 && x <= 10) {
            JOptionPane.showMessageDialog(null, "Idade: " + x + ".\nCategoria: Infantil B", "Resultado", 1);
        }else if (x >= 11 && x <= 13) {
            JOptionPane.showMessageDialog(null, "Idade: " + x + ".\nCategoria: Juvenil A", "Resultado", 1);
        }else if (x >= 14 && x <= 17) {
            JOptionPane.showMessageDialog(null, "Idade: " + x + ".\nCategoria: Juvenil B", "Resultado", 1);
        }else if (x >= 18) {
            JOptionPane.showMessageDialog(null, "Idade: " + x + ".\nCategoria: Sênior", "Resultado", 1);
        }
    }

}
