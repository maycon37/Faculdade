import javax.swing.*;
public class EX2 {
    public static void main(String [] args) {
        int q, n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número"));
        q = n*n;
        JOptionPane.showMessageDialog( null, "O quasdrado de " + n + " é " + q);
    }
}
