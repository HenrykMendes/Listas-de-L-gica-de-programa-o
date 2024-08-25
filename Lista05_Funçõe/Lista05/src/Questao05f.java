import java.util.Scanner;

public class Questao05f {
    public static void main(String[] args) {
        char carectere;
        int valorVetorCaractere;
        Scanner sc = new Scanner(System.in);

        System.err.println("Digite o tamanho do vetor: ");
        valorVetorCaractere = sc.nextInt();

        System.out.print("Digite algum caractere: ");
        carectere = sc.next().charAt(0);
        char vetorCaractere[] = new char[valorVetorCaractere];

        for (int contador = 0; contador < valorVetorCaractere; contador++) {
            System.out.print("Digite o " + (contador + 1) + "° caractere: ");
            vetorCaractere[contador] = sc.next().charAt(0);
        }
        int resultado = quantidadeCaractere(carectere, vetorCaractere);
        System.out.println("O caractere" + carectere + " mais usado foi: " + resultado);
        sc.close();
    }

    static int quantidadeCaractere(char caractere, char vetor[]) {
        int ret = 0;
        for (int contadorMetodo = 0; contadorMetodo < vetor.length; contadorMetodo++) {
            if (vetor[contadorMetodo] == caractere) {
                ret++;
            }
        }
        return ret;
    }

}

/*
 * Crie uma função que receba um caractere e um vetor de caracteres como
 * parâmetros e
 * retorne a quantidade de vezes que o caractere aparece no vetor. Construa um
 * algoritmo
 * principal que leia os dados de entrada, chame a função e exiba o resultado.
 */
