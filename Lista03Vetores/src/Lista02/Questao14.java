package Lista02;
import java.util.Scanner;
@SuppressWarnings ("all")
public class Questao14 {
    public static void main (String[]args){
Scanner sc = new Scanner (System.in);
int vetor [] = new int[10];
int i = 0;

//O usuario vai colocar 10 valores no vetor
for (i = 0; i<10;i++){
 System.out.print("\nDigite o "+(i)+" termo");
    vetor [i] = sc.nextInt();
        }

        System.out.print("Valor que deseja procurar: ");
        int valorN = sc.nextInt();

/*a variavel vai pegar todos os números no vetor [i],
contar todos os números armazenados nos vetores
e comparar com ValorN*/
for (i = 0; i<10; i++){
    if (vetor[i]==valorN) {
        System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
    }
}
/*14)Faça um algoritmo que leia um vetor de 10 elementos. Leia, a seguir, um valor N e verifique 
se o valor aparece no vetor escrevendo: 0 - se o valor N não aparece no vetor; 1 - se o valor N 
aparece no vetor. */