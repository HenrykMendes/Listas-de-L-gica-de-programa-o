package Lista02;
import java.util.Scanner;
@SuppressWarnings ("all")
public class Questao12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int media [] = new int[10];
    byte i;

//pega os valores digitados pelo usuário
for (i = 0; i<10; i++){
        System.out.println("Digite 10 números: ");           
                            media [i] = sc.nextInt();

            }int soma = 0; //Media dos números
                for (int valor : media){
                soma += valor;
        
                  
} double media_valores = (double)soma/10;

                System.out.println("Números acima da média: ");
                for (int valor :media){
                    if (valor > media_valores) {
                        System.out.println("Os numeros acima da média foram: "+valor);
                sc.close();         
            }
        }        
    }    
}