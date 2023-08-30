import javax.swing.JOptionPane;

public class EX3 {
    public static void main(String[] args) {
        int num1, num2;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        
        JOptionPane.showMessageDialog(null,"Soma de "+num1+" + "+num2+" é "+(num1+num2));
        JOptionPane.showMessageDialog(null,"Subtração de "+num1+" + "+num2+" é "+(num1-num2));
        JOptionPane.showMessageDialog(null,"Multiplicação de "+num1+" + "+num2+" é "+(num1*num2));
        JOptionPane.showMessageDialog(null,"Subtração de "+num1+" + "+num2+" é "+(num1/num2));
        
    }
}
