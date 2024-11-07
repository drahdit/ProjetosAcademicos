import javax.swing.JOptionPane;

public class L3E14 {
    public static void main(String[] args) {

        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        
        if (x >= 20 && x <= 90) {
            System.out.println("Este número está compreendido entre 20 e 90!");      
        }
    }
}
