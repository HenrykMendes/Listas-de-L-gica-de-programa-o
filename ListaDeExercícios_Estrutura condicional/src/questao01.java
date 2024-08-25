import java.util.Scanner;

public class questao01 {
    public static void main (String[]Args){
        Scanner sc = new Scanner(System.in);
        int ValorX,ValorY, ResultadoX, ResultadoY;

do{
System.out.print("Digite o valor X: ");
ValorX = sc.nextInt();
System.out.print("Digite o valor Y: "); 
ValorY = sc.nextInt();

}while (ValorX == 0 || ValorY == 0);
    
        if (ValorX == 0 || ValorY == 0) {
            System.out.println("Nenhum dos valores informados deve ser 0");       
            }else{
ResultadoX = ValorX + ValorY;
ResultadoY = ValorX * ValorY;
              System.out.println("Soma: "+ResultadoX+
               "\nMultiplicação: "+ResultadoY);
        }
sc.close();


    }
}
/*Faça um algoritmo que receba dois números inteiros, X e Y, como entrada e
retorne a soma e a multiplicação entre eles como saída. Caso um dos valores
seja igual a 0, imprima uma mensagem na saída com essa informação. */