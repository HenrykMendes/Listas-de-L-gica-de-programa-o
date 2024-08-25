/*8) Uma matriz identidade é uma matriz que possui 1 em todos os elementos da diagonal
principal, e 0 em todas as outras posições.
Faça um algoritmo que leia uma matriz M[n][n], com o valor de n informado pelo usuário, e verifique
se é uma matriz identidade escrevendo: 1 - Se é uma matriz identidade; ou 0 - Se não é uma matriz
identidade. */

package Lista01;
import java.util.Scanner;
public class Questao08 {
    public static void main (String[]args){
    
    int matriz [][];
    int numero, contI,contJ;
    Scanner sc = new Scanner(System.in);

//entrada de dados
    System.out.print("Digite: ");
    numero = sc.nextInt();
    matriz =  new int [numero][numero];
//criação da matriz
for (contI = 0; contI <numero;contI++){
    for(contJ = 0; contJ<numero;contJ++){
      matriz[contI][contJ] = sc.nextInt();
    }
}
//cria uma variavel boelan para tirar todos os resultados falos e imprimir 
//todos os verdadeiros
 boolean identidade =  true;
 //contagem novamente da matriz
 for (contI = 0; contI <numero;contI++){
    for(contJ = 0; contJ<numero;contJ++){

        if (contI ==  contJ && matriz[contI][contJ]!=1) {
            identidade = false;
            
            }else if (contI !=  contJ && matriz[contI][contJ]!=0) {
                identidade =  false;
                    }
                }
            }
            if (identidade) {
                System.out.print("01");
            }else{
                System.out.print("00");
            }
        }
    }

