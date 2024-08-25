
/*Faça um algoritmo que leia uma matriz M[n][n], com o valor de n informado pelo usuário, e
calcule e escreva a soma dos elementos que estão ao mesmo tempo acima da diagonal
principal e da secundária. */
package Lista01;
import java.util.Scanner;
public class Questao05 {
   public static void main(String[] args) {
    int matriz [][];
    int numero, soma = 0, contI, contJ;
    Scanner sc = new Scanner(System.in);


    System.out.print("coloque: ");
    numero = sc.nextInt();
    matriz = new int[numero][numero];

    for (contI = 0;contI <numero; contI++){
        for(contJ=0;contJ<numero;contJ++){
           matriz[contI][contJ] = sc.nextInt();
        }
    }
    for ( contI = 0; contI < numero; contI++) {
        for ( contJ = 0; contJ < numero; contJ++) {
            if (contI < contJ && contI < numero - contJ - 1) {
                soma += matriz[contI][contJ];
            }
        }
    }
System.out.println(soma);

   } 
}
