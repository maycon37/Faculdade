
import javax.swing.JOptionPane;

public class EX5_Bascara {
    public static void main(String[] args) {
        double a,b,c,x1,x2;

        a=Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de a"));
        b=Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de b"));
        c=Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de c"));

        x1=(-b+Math.sqrt(Math.pow (b,2)-4*a*c))/(2*a);
        x2=(-b-Math.sqrt(Math.pow (b,2)-4*a*c))/(2*a);

        JOptionPane.showMessageDialog(null,"x1 é igual a: "+x1+" e x2 é igual a: "+x2);
    }
}
