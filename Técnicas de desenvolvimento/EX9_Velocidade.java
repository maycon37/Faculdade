/*
 se(velocidade>60)
 inicio
 escreva(“Velocidade acima do permitido”)
 fim
 senão
 inicio
 escreva(“Velocidade controlada”)
 fim
fim se
*/
import javax.swing.JOptionPane;

public class EX9_Velocidade {
    public static void main(String[] args) {
        int velocidade;
    if (velocidade >= 60){
    JOptionPane.showMessageDialog(null, "Velocidade acima do permitido");
    }
    else {
    JOptionPane.showMessageDialog(null, "Velocidade controlada");
    }
}    
}
