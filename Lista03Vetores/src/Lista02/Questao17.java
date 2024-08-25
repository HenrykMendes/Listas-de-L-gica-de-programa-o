package Lista02;
import java.util.Scanner;
@SuppressWarnings ("all")
public class Questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor [] = new int [20];
        int i=0;
        int valor, valoremovido;
    while (i<20) {
        //primeiro ele vai contar todos os números
        //antes ele vai checar se o algum número informado é zero
        //enquanto for maior que zero, vai adicionar ao vetor
        System.out.print("Digite o "+i+" valor: ");
        valor = sc.nextInt();
        //vetor [i] = sc.nextInt();
            if (valor ==0) {
                break;
            }else if (valor>0) {
                vetor[i] = valor;
                i++;
                }
            }
        
            System.out.print("Valores dentro do vetor: ");
    for (int j = 0; j < i; j++) {
            System.out.print(vetor[j] + " ");
            }
            System.out.print("\n");
            System.out.print("Digite o valor a ser removido: ");
                valoremovido = sc.nextInt();
                int j = 0;
                while (j < i) {
                    if (vetor[j] == valoremovido) {
                        vetor[j] = vetor[i - 1];
                        i--;
                    } else {
                        j++;
                    }
                }
                System.out.println("Vetor modificado:");
                for (int k = 0; k < i; k++) {
                    System.out.print(vetor[k] + " ");
                }
                System.out.println();
            }
        }

/*)Escreva um algoritmo que lê em um vetor de 20 posições de números positivos, até que o 
vetor esteja completo ou que tenha sido fornecido o valor 0 (zero). Após, escreva o vetor. A 
seguir, o algoritmo deve ler um número positivo qualquer e, caso ele se encontre no vetor, 
deve remover todas suas ocorrências, através de um deslocamento para a esquerda dos 
elementos que encontram-se à direita daquele a ser removido. Escreve o vetor modificado. */