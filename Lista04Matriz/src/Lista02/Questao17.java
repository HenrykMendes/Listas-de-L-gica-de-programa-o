package Lista02;

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        int[][] matriz = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean simetrica = true;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        
        if (!simetrica) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (matriz[i][j] == 0 && matriz[j][i] == 1) {
                        matriz[i][j] = 1;
                    }
                }
            }
        }

        int c1 = sc.nextInt();
        int c2 = sc.nextInt();


        int caminhos = 0;
        for (int k = 0; k < 5; k++) {
            if (matriz[c1][k] == 1 && matriz[k][c2] == 1) {
                caminhos++;
            }
        }

      
        System.out.println("Quantidade de caminhos: " + caminhos);
  sc.close();  }
}
/*17) Uma matriz de adjacências, para um mapa rodoviário, é composta de elementos 0's e 1's, sendo que
M[i][j] = 1 se existe uma ligação rodoviária da cidade i para a cidade j e M[i][j] = 0 caso não tenha uma
ligação rodoviária entre a cidade i e a cidade j. Essa matriz será simétrica se para todo caminho i,j existir
o caminho j,i (estradas de mão dupla). Uma característica dessa matriz simétrica é que na matriz M2
,
obtida pelo produto matricial de M por M, cada posição M[i][j] contém o número de caminhos entre as
cidades i e j que passam exatamente por 1 outra cidade. E M3

contém a quantidade de caminhos que
passam por 2 outras cidades. E assim por diante. Escreva um algoritmo que leia uma matriz de
adjacências simétrica M para um conjunto de 5 cidades e, após, leia os valores c1 e c2 (ambos menores
que 5) representando duas cidades quaisquer do conjunto. O algoritmo deve verificar se M é simétrica
e, se não for, deve completar os caminhos de retorno entre qualquer par de cidades que esteja impedindo
a simetria da matriz. O algoritmo deve descrever a quantidade de caminhos entre c1 e c2 que passam
exatamente por 1 outra cidade. */