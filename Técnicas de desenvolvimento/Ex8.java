/* Algoritmo par
    inteiro num
    Inicio
    escreva “Entre com um número inteiro”
    leia num
    se (num%2==0)
    escreva “O número: “ + num + “ é par”
    fim-se
fim.
*/
import javax.swing.JOptionPane;

public class Ex8  {
    public static void main(String[] args) {
    
        int num;
    
    num=Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero inteiro"));
    
    if (num%2==0){
        JOptionPane.showMessageDialog(null,"O numero "+num+" é par");
    }
    else {
        JOptionPane.showMessageDialog(null,"O numero "+num+" é impar");
        }
    }
}