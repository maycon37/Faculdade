import javax.swing.JOptionPane;

class EX1 {
    public static void main(String args[]) {
        float nota;
        nota=Float.parseFloat(
            JOptionPane.showInputDialog("Entre com a nota")); 
        
            System.out.println("Sua nota é "+nota);
    }
}   