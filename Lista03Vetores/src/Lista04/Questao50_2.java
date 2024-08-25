package Lista04;

import java.util.Scanner;
@SuppressWarnings("all")
public class Questao50_2 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int vetor [][] = new int[10][3];
int i;
int Maiorcandidato = 0;
int maiorVoto = 0;

for(i=0;i<20;i++){
    //Definir uma matriz para cada dado do usuário
    // [i] contador + [0] posição 1 na matriz
    // [i] contador + [1] posição 2 na matriz
    // [i] contador + [2] posição 3 na matriz
    System.out.println("Cadastro do candidato "+(i+1)+"º candidato:"
    +"\n Digite o cadastro do candidato: ");
    vetor [i][0]=sc.nextInt();
    System.out.print("Digite o número de partido (entre 1 a 10): ");
    vetor [i][1]=sc.nextInt();
    System.out.print("Digite o número de votos: ");
    vetor [i][2]=sc.nextInt();
        }
        //contar partido
        for (int partido=1;i<10;i++){
            //comparar candidatos
            for(i=0;i<20;i++){
                if (vetor[i][1]==partido&&vetor[i][2]>maiorVoto) {
                    maiorVoto = vetor[i][2];
                    Maiorcandidato = vetor [i][0];
                }
            }
            System.out.print("O candidato nº "+Maiorcandidato+" do partido ("+partido+") teve "+maiorVoto+" ");
        }
  sc.close();  }
}
/*50)Faça um algoritmo que leia, para 20 candidatos a deputado, seu cadastro, partido (inteiro 
entre 1 e 10) e número de votos, e escreva o cadastro, partido e número de votos do 
candidato mais votado de cada partido,em ordem crescente de partido.  */