package Lista02;
import java.util.Scanner;
@SuppressWarnings ("all")
public class Questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor [] = new int[10];
        int i;

        for (i = 0; i<10; i++){
            System.out.print("Digite o "+i+"º número: ");
            vetor [i] = sc.nextInt();
        }
        int valorInverso;
        for(i = 0; i<5;i++){
            /*armazenou o valor do novo vetor em valor inverso
             * deoius cocou o valor do vetor 10, menos a posição do vetor menos 1
             * atribiu o valor inverso para o valor do vetor10I-1
             */
            
            valorInverso = vetor[i];
            vetor[i] = vetor [10 - i - 1];
            vetor [10 - i - 1] = valorInverso;
        }
        for (i = 0; i<10;i++){
            System.err.print(vetor[i]+" ");
        }
     sc.close();}
}
/*15)Escrever um algoritmo que lê um vetor N[10] e o escreve. Troque, a seguir, o 1° elemento 
com o último, o 2° com o penúltimo, etc até o 5° com o 6° e escreva o vetor N assim 
modificado.  */