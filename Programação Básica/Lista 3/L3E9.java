import javax.swing.JOptionPane;

public class L3E9 {
    public static void main(String[] args) {
        int x, y;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número x:")); 
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite um número y:"));

        if(x > y){
            JOptionPane.showMessageDialog(null, "Menor: " + y + ".\nMaior: " + x, "Resultado", 1);

        }else{
            JOptionPane.showMessageDialog(null, "Menor: " + x + ".\nMaior: " + y, "Resultado", 1);

        }
    }

}
