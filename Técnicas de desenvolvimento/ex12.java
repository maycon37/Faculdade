import javax.swing.JOptionPane;

public class ex12 {

    public static void main(String[] args) {
        // Var X: inteiro, Y:inteiro, Z: inteiro
        int x, y, z;
        // Início - Leia X
        x = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero para X "));
        // Leia Y
        y = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero para Y "));
        // Leia Z
        z = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero para Z "));
        // Se X < Y E Z > Y então
        if ((x < y) && (z > y)) {
            // Escreva "Mensagem 1"
            JOptionPane.showMessageDialog(null, "Mensagem 1");
        }
        // Se X <= Z então
        if (x <= z) {
            // Escreva "Mensagem 2"
            JOptionPane.showMessageDialog(null, "Mensagem 2");
        }
        // Se Z + Y > 110 OU X + Y + Z < 60 então
        if ((z + y > 110) || (x + y + z < 60)) {
            // Escreva "Mensagem 3"
            JOptionPane.showMessageDialog(null, "Mensagem 3");
        }
    }
}