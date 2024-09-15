import javax.swing.JOptionPane;

public class L3E10 {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número qualquer:"));

        if(x % 3 == 0 && x % 7 == 0){
            JOptionPane.showMessageDialog(null, "Ele é divisível por 3 e por 7.", "Resultado", 1);
        }else if(x % 3 == 0 && x % 7 != 0){
            JOptionPane.showMessageDialog(null, "Ele é divisível apenas por 3.", "Resultado", 1);
        }else if(x % 3 != 0 && x % 7 == 0){
            JOptionPane.showMessageDialog(null, "Ele é divisível apenas por 7.", "Resultado", 1);
        }else{
            JOptionPane.showMessageDialog(null, "Ele não é divisível por nenhum dos dois.", "Resultado", 1);
        }
    }
}
