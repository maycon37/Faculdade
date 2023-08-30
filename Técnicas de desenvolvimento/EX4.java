import javax.swing.JOptionPane;
/**
 * EX4
 */
public class EX4 {
    public static void main(String[] args) {
    int quant_25, quant_10, quant_5;
    double total;

    quant_25=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moedas de R$ 0,25"));
    quant_10=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moedas de R$ 0,10"));
    quant_5=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moedas de R$ 0,05"));    

    total=quant_10*0.10+quant_25*0.25+quant_5*0.5;

    JOptionPane.showMessageDialog(null,"Soma total de moedas é R$ "+total);

}
}
