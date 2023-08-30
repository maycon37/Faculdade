import javax.swing.JOptionPane;
/**
 * EX7
 */
public class EX7 {
    public static void main(String[] args) {
    double altura;
    altura=Double.parseDouble(JOptionPane.showInputDialog("Escreva a sua altura"));
    
        if (altura >= 1.80) {
            System.out.println("Você é alto!");
            }
            else {
            System.out.println("Você é baixo");
            }
    }
}