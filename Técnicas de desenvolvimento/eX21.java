import java.util.*;

public class eX21 {
	public static void main(String[] args) {
		float soma, media;
		float a[]=new float[8];
		int i;
		
		Scanner leia = new Scanner(System.in);
		soma=0;
		
		for (i=0;i<8;i++) {
			System.out.println("Digite um número: ");
			a[i]=leia.nextFloat();
		}
		for (i=0;i<8;i++) {
			soma+=a[i];
		}
		media=soma /8;
			System.out.println("A Média é: "+media);
	}
}
