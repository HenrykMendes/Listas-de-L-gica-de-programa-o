import java.util.Scanner;
public class Questao04f {

    static int calcularMaiorNumero (int valorA, int valorB ){        
            return valorA > valorB ? valorA : valorB;  
     }
     //É a mesma coisa disso:
     /*if (valorA >valorB){
            return valorA;
            }else{ 
                return valorB;
            } */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int resultadoVetor;
    int definirN;
do {
    System.out.println("Digite a quantidade de valores para N: ");
    definirN = sc.nextInt();
} while (definirN<2);
        
        //definir o tamanho do vetor pelo valor dado pelo usuário
        int vetor [] = new int[definirN];
            //laço para contar igual ao valor de N        
            for (int contador = 0; contador < definirN; contador++){
                System.out.print("Digite o "+(contador+1)+" número: ");
                vetor[contador] = sc.nextInt();
            }
            //fazer a comparação de todos os valores do vetor, do valor 
            //já armazenado do vetor com o resultado do maior número na variavel
            //"resultadoVetor".
            resultadoVetor = vetor[0];
            for (int contador2 = 0; contador2 <definirN;contador2++){
                resultadoVetor = calcularMaiorNumero(resultadoVetor, vetor[contador2]);
            }
            System.out.println("Maior número dentro do vetor é: "+resultadoVetor);
  sc.close();  }
}