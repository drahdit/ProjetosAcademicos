import javax.swing.JOptionPane;

public class Exercicio22 {
    public static void main(String[] args) {

        String comps = JOptionPane.showInputDialog("Digite o comprimento do paralelepípedo aqui:");
        String largs = JOptionPane.showInputDialog("Digite a largura do paralelepípedo aqui:");
        String autus = JOptionPane.showInputDialog("Digite a altura do paralelepípedo aqui:");

        Double comp = Double.parseDouble(comps);
        Double larg = Double.parseDouble(largs);
        Double autu = Double.parseDouble(autus);
        Double volume = comp * larg * autu;

        JOptionPane.showMessageDialog(null, "o volume do paralelepípedo é: " + volume + " u.m.", "Paralelepípedo", 1);

    }

}
