import javax.swing.JOptionPane;

public class L3E15 {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (x == 5) {
            System.out.println("É igual a 5 e não está entre 500 e 1000");
        }else if (x == 200) {
            System.out.println("É igual a 200 e não está entre 500 e 1000");
        }else if (x == 400) {
            System.out.println("É igual a 200 e não está entre 500 e 1000");
        }else if (x >= 500 && x <= 1000) {
            System.out.println("Está entre 500 e 1000");
        }else{
            System.out.println("Não se encaixa em nenhum dos padrões");
        }
    }
}
