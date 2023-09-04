import javax.swing.JOptionPane;

public class eX14 {
    public static void main(String[] args) {
        // Algoritmo Somatório
        // real n1, soma
        // inteiro i
        int i;
        double n1, soma = 0;

        for (i = 1; i <= 10; i++) {
            n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero"));
            soma = soma + n1; // Acumulador
        }
        JOptionPane.showMessageDialog(null, "A somatória é:  " + soma);
    }
}
