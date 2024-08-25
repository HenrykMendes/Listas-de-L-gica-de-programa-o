/*2) Faça um algoritmo que leia 10 valores e os escreva na ordem contrária à que foram 
digitados. */
/*package Lista02;
import java.util.Scanner;
public class Questao02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[11];
        int contador;
        //Vai ler os 10 valores do usuario enquanto contador for menor que o vetor 10
        
            for (contador = 0; contador < 11; contador++){
                System.out.println("Digite o valor "+contador+": ");
                    vetor [contador] = sc.nextInt();
                    sc.close();   
            }
                for(contador = 10; contador >=0; contador--){
                        System.out.println(vetor [contador]);
   
            }
       
    }
}
*/
/*2) Faça um algoritmo que leia 10 valores e os escreva na ordem contrária à que foram 
digitados. */
package Lista02;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        EntradaDeDados(vetor);
        OrdemContraria(vetor);

    }

    public static void EntradaDeDados(int[] vetor) {
        Scanner sc = new Scanner(System.in);
        for (int cont = 0; cont <= vetor.length-1; cont++) {
            System.out.println("Digite o "+cont+" valor");
            vetor[cont] = sc.nextInt();
        }
    }


    public static void OrdemContraria (int []vetor){
        for (int cont = vetor.length-1; cont >=0;cont--){
        System.out.println(vetor[cont]+" ");    
        }
    }
}