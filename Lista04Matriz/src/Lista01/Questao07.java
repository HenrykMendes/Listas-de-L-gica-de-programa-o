
/*7) Faça um algoritmo que leia uma matriz M[n][n]
, com o valor de n>4 informado pelo usuário,
troque cada elemento da linha 4 com elemento correspondente da linha 2. 
Escreva a matriz resultante. */

package Lista01;
import java.util.Scanner;
public class Questao07 {
    public static void main(String[] args) {
        int matriz [][];
        int numeroDaMatriz;

        Scanner sc = new Scanner(System.in);
        
        //Definindo o tamanho da matriz
        do {
            System.out.println("Digite o tamanho da matriz: ");
            numeroDaMatriz = sc.nextInt();
            matriz = new int [numeroDaMatriz][numeroDaMatriz];
        } while (numeroDaMatriz<4);


        //percorrer a matriz usando for "contI" e dentro dele o "contJ" para
        //cada valor inserido dentro da matriz
        for(int contI=0; contI<numeroDaMatriz;contI++){
            for (int contJ=0;contJ<numeroDaMatriz;contJ++){
                System.out.println("Digite o "+(contI+1)+"º e "+(contJ+1));
                matriz[contI][contJ] = sc.nextInt();
            }
        }
        //troca de valor entre a segunda e a quarta linha da matriz
        //O contador anda coluna por coluna pegando os valores das linhas 2 e 4 e trocando
        for(int contJ=0;contJ<numeroDaMatriz;contJ++){
            int armazenados = matriz[1][contJ];
            matriz[1][contJ] = matriz [3] [contJ];
            matriz [3] [contJ] = armazenados;
        }
        for(int contI=0; contI<numeroDaMatriz;contI++){
            for (int contJ=0;contJ<numeroDaMatriz;contJ++){
                System.out.println("\n"+matriz[contI][contJ]+" ");
            }
            System.out.println(" ");
        }

    sc.close();}
}
