/*9) Faça um algoritmo que leia uma matriz M[n][n], com o valor de n informado pelo usuário, e escreva
o número da linha que contenha a maior soma de seus elementos. Considere que a matriz só contém
valores positivos. */
package Lista01;
import java.util.Scanner;
public class Questao09 {

    public static void main(String[] args) {
        int matriz[][];
        int contI, contJ;
        int numero;
        Scanner sc = new Scanner(System.in);

        // Inserir dados
        System.out.print("Digite \"n\" valor: ");
        numero = sc.nextInt();

        //matriz com tamanho de "numero"
        matriz = new int[numero][numero];

        for (contI = 0; contI < numero; contI++) {
            for (contJ = 0; contJ < numero; contJ++) {
                matriz[contI][contJ] = sc.nextInt();

            }
        }
        // criar um vetor para armazenar todos os valores
        // do tamanho do número informado pelo usuario
        // Depois de fazer a soma de todas as linhas
        int soma[] = new int[numero];

        for (contI = 0; contI < numero; contI++) {
            for (contJ = 0; contJ < numero; contJ++) {
                soma[contI] = soma[contI] + matriz[contI][contJ];
            }
        }
        // escolher o resultado com maior valor
        int resultado = 0;
        // checar todas as linhas (contI)
        int linhaDeMaiorSoma = 0;
        for (contI = 0; contI < numero; contI++) {
            if (soma[contI] > resultado) {
                resultado = soma[contI];
                linhaDeMaiorSoma = contI + 1;
            }
        }
        System.out.println("A linha com a maior soma é: "+linhaDeMaiorSoma);
    }
}