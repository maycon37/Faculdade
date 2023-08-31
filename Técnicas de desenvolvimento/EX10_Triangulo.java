import javax.swing.JOptionPane;

public class EX10_Triangulo {
    public static void main(String[] args) {
        double a,b,c;
    
        a=Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de a: "));
        b=Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de b: "));
        c=Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor de c: "));
    
        if((a<b+c)&&(b<a+c)&&(c<a+b)){
        JOptionPane.showMessageDialog(null,"Estes valores formam um triangulo");
            if ((a==b)&&(b==c)){
                JOptionPane.showMessageDialog(null,"Triangulo Equilátero");
            }
            else { 
                if ((a==b)||(b==c)||(a==c)){
                    JOptionPane.showMessageDialog(null,"Triângulo Isósceles");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Triangulo Escaleno");
                }
            }
        }
        else {
        JOptionPane.showMessageDialog(null,"Estes valores não formam um triângulo");
    }     
}
}