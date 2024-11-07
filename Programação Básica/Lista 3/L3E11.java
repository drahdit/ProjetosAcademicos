import javax.swing.JOptionPane;

public class L3E11 {
    public static void main(String[] args) {
        Double sb = Double.parseDouble(JOptionPane.showInputDialog("Digite seu sálario bruto:"));
        Double p = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da prestação?"));
        Double sb3 = sb * 0.3;

        if(p > sb3){
            JOptionPane.showMessageDialog(null, "O empréstimo não poderá ser concedido.", "Resultado", 1);
        }else{
            JOptionPane.showMessageDialog(null, "O empréstimo poderá ser concedido.", "Resultado", 1); 
        }
    }

}
