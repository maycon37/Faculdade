import javax.swing.JOptionPane;

public class eX13 {
    public static void main(String[] args) {
        // Tabuada
        // inteiro numero, i
        int numero, i;
        // escreva (“Entre com o número:”)
        numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero inteiro"));
        // leia (numero)

        for (i = 0; i <= 10; i++) {
            System.out.println("2x" + i + ": " + numero * i);
        }
    }
}
