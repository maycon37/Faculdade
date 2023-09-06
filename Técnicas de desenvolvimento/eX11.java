import javax.swing.JOptionPane;

public class eX11 {
    public static void main(String[] args) {
    	
    	double valor_compra,valor_final,valor_parcelado;
    	int qtde_parcelas,juros_comp = 0;
    	
		
    	valor_compra = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da compra: "));
        qtde_parcelas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de parcelas: "));
        /* escolha (qtde_parcelas) */
        switch (qtde_parcelas) {
            // Caso 2: juros = 3
            case 2:
                juros_comp = 3;
                break;
            // Caso 4: juros = 7
            case 4:
                juros_comp = 7;
                break;
            // Caso 6: juros = 9
            case 6:
                juros_comp = 9;
                break;
            // Caso 8: juros = 12
            case 8:
                juros_comp = 12;
                break;
            // fim_escolha
        }
        // padrão juros = -1
        if (juros_comp == -1) {
            // se(juros == -1)
            // escreva “Número de Parcelas incorreto”
            JOptionPane.showMessageDialog(null, "Número de Parcelas incorreto");
        } else {
            valor_final = valor_compra + valor_compra * juros_comp / 100;
            valor_parcelado = valor_final / qtde_parcelas;
            JOptionPane.showMessageDialog(null, "O valor de cada parcela é " + valor_parcelado);
        }
    }
}
