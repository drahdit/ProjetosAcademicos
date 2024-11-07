import javax.swing.JOptionPane;

public class Exercicio26 {
    public static void main(String[] args) {
        
        String xs = JOptionPane.showInputDialog("Digite um número de 3 caracteres:");

        String p1 = xs.substring(2,3);
        String p2 = xs.substring(1,2);
        String p3 = xs.substring(0, 1);

        System.out.println(p1 + p2 + p3);
    }

}
