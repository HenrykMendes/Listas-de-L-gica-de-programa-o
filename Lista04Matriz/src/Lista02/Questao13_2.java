

package Lista02;
import java.util.Scanner;
public class Questao13_2 {
    public static void main (String []args){
    int matriz [][];
    int numero, contI, contJ;
    Scanner sc =  new Scanner(System.in);
  
         //definindo o tamanho da matriz
                System.out.print("A: ");
                    numero = sc.nextInt();
                        matriz = new int[numero][numero];
        //criação do vetorSoma com valor de "numero"+1
                int vetorSoma[] = new int[numero+1];


// Lê a matriz   
    for (contI = 0; contI <numero; contI++){
        for (contJ = 0; contJ<numero; contJ++){
            System.out.println("Elemento da posição "+(contI+1)+" e "+(contJ+1)+": ");
                matriz [contI][contJ] = sc.nextInt();
        }
    }
    //faz a contagem das colunas e soma os números de cada coluna
    for (contI = 0; contI <numero; contI++){
        for (contJ = 0; contJ<numero; contJ++){
            vetorSoma [contJ] = vetorSoma[contJ] + matriz[contI][contJ];
        }
    }
    //imprime cada valor do vetor na variavel int "armazenados"
for (int armazenados: vetorSoma){
System.out.print (armazenados+" ");
}
    sc.close();
    }
}