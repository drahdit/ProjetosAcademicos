import javax.swing.JOptionPane;

public class L3E16 {
    public static void main(String[] args) {
        Double x = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:"));
        Double y = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
        Double imc = x / Math.pow(y, 2.0);

        if(imc < 20.0){
            JOptionPane.showMessageDialog(null, "Seu IMC é de: " + imc + ".\nEstá abaixo do peso.", "Resultado", 1);
        }else if(imc >= 20.0 && imc < 25.0){
            JOptionPane.showMessageDialog(null, "Seu IMC é de: " + imc + ".\nEstá com o peso normal.", "Resultado", 1);
        }else if(imc >= 25.0 && imc < 30.0){
            JOptionPane.showMessageDialog(null, "Seu IMC é de: " + imc + ".\nEstá sobre peso.", "Resultado", 1);
        }else if(imc >= 30.0 && imc < 40.0){
            JOptionPane.showMessageDialog(null, "Seu IMC é de: " + imc + ".\nEstá obeso.", "Resultado", 1);
        }else{
            JOptionPane.showMessageDialog(null, "Não se enquadra", "Resultado", 1);
        }
    }
}
