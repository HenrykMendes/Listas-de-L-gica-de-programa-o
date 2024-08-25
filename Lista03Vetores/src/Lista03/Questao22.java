package Lista03;

import java.util.Scanner;
@SuppressWarnings("all")
public class Questao22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetorY[] = new int[10];
        int vetorX[] = new int[10];
        int vetorZ[] = new int[20];
        int i,o=0,p=0;
        for (i=0;i<10;i++){ 
            System.out.println("Y termo "+(i+1)+"º número: ");
            vetorY[i] = sc.nextInt();
            }
            for (i=0;i<10;i++){ 
                System.out.println("X termo "+(i+1)+"º número: ");
                vetorX[i] = sc.nextInt();
                }
//VetorZ recebera os valores de X
for (i = 0; i<10;i++){
vetorZ [o++] = vetorZ[i];
}
//VetorZ receberá os valores de Y depois que o valor de p deixar de ser inferior ao valor de o, ou seja, quando valor de p for maior que 10
for (i = 0; i<10;i++){
    boolean armazenados = false;
        for (p = 0; p<o;p++){
            if (vetorX[i] == vetorZ[p]) {
                armazenados = true;
                }
            }
            if (!armazenados) {
                vetorZ[o++] = vetorX[i];
            }
        }
    for (i=0;i<o;i++){
            System.out.println(vetorZ[i]);
        }
   sc.close(); }
}
/*22)Escrever um algoritmo que lê um vetor X[10] e, após, leia um vetor Y[10]. Crie, a seguir, um 
terceiro vetor Z com os elementos que aparecem em X ou em Y (união); elementos que 
aparecem em X e Y simultaneamente devem aparecer apenas uma vez em Z. Os elementos 
devem aparecer no vetor Z na mesma ordem em que aparecem no vetor X e Y. Considere que 
não há repetição de valores dentro do mesmo vetor. Escreva o vetor Z (apenas as posições 
que foram preenchidas). */