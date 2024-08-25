package Lista04;
import java.util.Scanner;
public class Questao62 {
    public static void main (String[]args){
        Scanner sc =  new Scanner(System.in);
        int vetorA[] = new int [30];
        int vetorB[] = new int[10];
        int  contA, contB, vetor10;


        for (contA = 0;contA<vetorA.length;contA++){
            System.out.println("Digite "+(contA+1)+"º número: ");
            vetorA[contA] = sc.nextInt();
        }
            for (contB = 0; contB<vetorB.length;contB++){
                System.out.println("Digite até dez o "+(contA+1)+" númeors: ");
                vetorB[contB] = sc.nextInt();
            }
   
for (int contC=0; contC<vetorA.length;contC++){
boolean armazenados = false;
for (vetor10 = 0;vetor10<vetorB.length;vetor10++){
    if (vetorA[contC]!=vetorB[vetor10]) {
        armazenados = true;
        break;
    }
    if (!armazenados) {
        System.out.println(vetorA[contC]);
        
    }    
            }
        }
    }
}
/*62)Faça um algoritmo que leia um vetor de inteiros W[30]. 
Leia a seguir um vetor V[10] e 
verifique se a sequência de 10 números no vetor V ocorre no vetor W,
escrevendo a posição do vetor W onde inicia a sequencia, 
caso ela exista, ou 0, caso a sequência em V não exista 
em W. */