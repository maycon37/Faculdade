import javax.swing.JOptionPane;

public class EX9 {
    public static void main(String[] args) {
        int velo = 55;
    
        if (velo >= 60){
    JOptionPane.showMessageDialog(null, "Velocidade acima do permitido");
    }
    else {
    JOptionPane.showMessageDialog(null, "Velocidade controlada");
    }
}    
}
