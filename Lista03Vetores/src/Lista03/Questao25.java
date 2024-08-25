package Lista03;
import java.util.Scanner;
@SuppressWarnings ("all")//sc.close();
public class Questao25 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        int vetorX [] = new int [10];
        int vetorY [] = new int [10];
        int i, j, m,l;
//Lê vetores de X
        for (i = 0; i < vetorX.length; i++){
        System.out.print((i+1)+"º VetorX: ");
        vetorX[i] = sc.nextInt();
        }
//Lê vetores de Y        
        for (j=0;j<vetorY.length;j++){
        System.out.print((j+1)+"º VetorY: ");
        vetorY[j] = sc.nextInt();
        }

        for (m = 0; m<vetorX.length;m++ ){
            boolean armazenados = false;
            // declara armazenados como falso, para toda vez que VetoX for igual a VetorY, ele considera como verdadeiro
            for (l = 0;l<vetorY.length;l++){
               if (vetorX [m]==vetorY[l]) {
                   armazenados = true;   
               }
            }
            //os valores "falsos", ou seja, diferentes dos vetores serão declarados
            if (!armazenados) {
                System.out.println(vetorX[m]);  
            }
           
        }

        sc.close();
    }
}
/*25)Escrever um algoritmo que lê 2 vetores X[10] e Y[10], e escreva os elementos que 
aparecem no vetor X e não aparecem no vetor Y (diferença de conjuntos). Escreva os valores 
na ordem em que eles aparecem no vetor X. Os dois vetores devem ser lidos separadamente 
(em primeiro lugar, todo o vetor X, após, o vetor Y). */