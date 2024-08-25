package Lista03;
import java.util.Scanner;
@SuppressWarnings ("all")//sc.close();
public class Questao23 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int vetor [] = new int[5];
    int aposta [] = new int[5];
    int i, acerto=0;


    for (i = 0;i<5;i++){
    System.out.print("Digite o "+(i)+"º a ser sorteado");vetor[i] = sc.nextInt();
        }
        for (int jogador = 1;jogador<5;jogador++){
            for (i=0;i<5;i++){
                System.out.print("Jogador "+jogador+", faça sua aposta: ");
                aposta [i] = sc.nextInt();
                if (aposta[i]==vetor[i]) {
                    acerto = acerto +1;
                }
            }
            System.out.println("O apostador " + jogador + " acertou " + acerto + " números.");
        }
   sc.close(); }
}
/* 23)Faça um algoritmo que leia um vetor V[5], com os valores sorteados em um sorteio de 
Loto. Leia, a seguir,para um conjunto de 5 apostadores, seus 5 palpites e escreva, para cada 
um, o número de acertos que teve. */
