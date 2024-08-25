package Lista01;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in);
        int [][] matriz;
        int soma = 0, numero, contI, contJ;


        System.out.println("Linha e coluna na matriz: ");
        numero = sc.nextInt();
        matriz = new int[numero][numero];


        for(contI = 0;contI<numero;contI++){
            for(contJ = 0;contJ<numero;contJ++){
                System.out.println("Elemento da posição "+(contI+1)+" e "+(contJ+1)+": ");
                matriz [contI][contJ] = sc.nextInt();
            } 
        }
        for (contI = 0, contJ = numero - 1; contI < numero; contI++, contJ--){
            soma += matriz [contI] [contJ];
        }
    System.out.println(soma);
    }
}
/*Faça um algoritmo que leia uma matriz M[n][n], com o valor de n informado pelo usuário, e
calcule e escreva a soma dos elementos da diagonal secundária. */