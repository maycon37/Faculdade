import java.util.Scanner;

/*
 * EX6_Bascara_Diferente
 */
public class EX6_Bascara_Diferente {

    public static void main(String[] args) {
        float a, b, c,
        delta,
        sqrtdelta,
        raiz1 , raiz2;

        try (Scanner entrada = new Scanner(System.in)) {
            //Passo um: recebendo os coeficientes
                System.out.println("Equação de 2º grau : ax² + bx + cx = 0");
                System.out.print("Entre com o valor de a: ");
                a = entrada.nextFloat();
                System.out.print("Entre com o valor de b: ");
                b = entrada.nextFloat();
                System.out.print("Entre com o valor de c: ");
                c = entrada.nextFloat();
        }

    //Check: verificando se a equação é valida
        if (a != 0){
            //Recebendo o valod de Delta e calculando sua raiz quadrada 
            delta = (b*b)-(4*a*c);
            sqrtdelta=(float)Math.sqrt(delta);
            //Passo 4: se a raiz de delta for maior que 0, as raízes são reais
            if(delta >=0){
                raiz1 = ((-1)*b + sqrtdelta)/(2*a);
                raiz2 = ((-1)*b - sqrtdelta)/(2*a);
                System.out.printf("Raízes: %.2f e %.2f", raiz1, raiz2);
            }
            //Passo 5: se delta for menor que 0, as raízes serão complexas
            else{
                delta = -delta;
                sqrtdelta = (float)Math.sqrt(delta);
                System.out.printf("Raíz 1: %.2f + i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
                System.out.printf("Raíz 2: %.2f - i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
                }
            }
            
        else{
            System.out.println("Coeficiente 'a' inválido. Não é uma equação do 2o grau");
            }
    }
}