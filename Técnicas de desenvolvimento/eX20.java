import javax.swing.JOptionPane;

public class eX20 {
	public static void main(String[] args) {
	
		float[]salario=new float[5];
		// Preenchimento do vetor
		for (int i=0;i<5;i++) {
			salario[i] = Float.parseFloat(JOptionPane.showInputDialog("Entre com o salario"));
		}
		// Mostrando valores armazenados
		for (int i=0;i<5;i++) {
			System.out.println("Funcionário: "+(i + 1)+" Salário: "+salario[i]);
		}
	}
}
