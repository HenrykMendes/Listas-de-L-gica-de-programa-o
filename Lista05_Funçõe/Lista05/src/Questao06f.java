import java.util.Scanner;
@SuppressWarnings("all")
public class Questao06f {

   static int vetorAoQuadrado (int vetorA){
    int vetorB;
    return vetorB = vetorA * vetorA;
   }

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int vetorTamanho; 


//1. Definindo o número do tamanho do vetor
    System.out.println("Digite o tamanho do vetor: ");
    vetorTamanho =  sc.nextInt();
//2. Definindo o tamanho do vetor pelop número informado
    int vetorUm[] = new int[vetorTamanho];


for (int contadorA = 0;contadorA<vetorTamanho;contadorA++){
    System.out.println("Digite o "+(contadorA+1)+" número que serão elevados ao quadrado: ");
    vetorUm[contadorA] = sc.nextInt();
}

int resultadoAoQuadrado = vetorUm[0];
for(int contadorB = 0;contadorB<vetorTamanho;contadorB++){
resultadoAoQuadrado = vetorAoQuadrado(vetorUm[contadorB]);
System.out.println("\nO valor ao quadrado dos números são: "+resultadoAoQuadrado);

}
   sc.close();}
   
}

/*
1. Crie uma função que receba dois vetores de inteiros
2. preencha cada elemento do segundo vetor com o quadrado do elemento correspondente no primeiro vetor.
3. O primeiro vetor deve ser lido no programa principal
4. segundo vetor deve ser exibido no programa principal. */