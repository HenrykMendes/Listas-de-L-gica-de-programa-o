import java.util.Scanner;

@SuppressWarnings("all")
public class Questao08f {

    public static void main(String[] args) {
        int numeroDoUsuario, numeroPrimoA, numeroPrimoB;
        int resultadoPrimo, resultadoSoma = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("A: ");
        numeroDoUsuario = sc.nextInt();
        System.out.println("B1: ");
        numeroPrimoA = sc.nextInt();
        System.out.println("B2: ");
        numeroPrimoB =sc.nextInt();

        resultadoPrimo = determinarPrimo(numeroDoUsuario);
        resultadoSoma = somaDePrimos(resultadoPrimo, numeroPrimoA);

        System.out.println(resultadoPrimo);
        System.out.println(resultadoSoma);

        sc.close();
    }

    public static int somaDePrimos(int valorA, int valorB) {
        int vetor[] = new int[valorB];
        int armazenarSoma = 0;
        int contA;
        for (contA = 1; contA < valorB; contA++) {
            if (contA % 2 == 0 && contA == 1) {
                armazenarSoma = vetor[contA];

            }
        }
        return armazenarSoma;
    }

    public static int determinarPrimo(int numeroDoUsuario2) {
        /*
         * Lembre-se, sempre que existir uma variavel que sirva para
         * contagem de um laço e repetição, ela deve ser inicializada
         */
        int numeroDivisor = 0;
        for (int contA = 1; contA < numeroDoUsuario2; contA++) {
            /*
             * A variavel "ContA" vai ser contada até que seja igual ao número digitado
             * Se o resto da divisão do número informado for "0", ele sera add ao contador.
             */
            if (numeroDoUsuario2 % contA == 0) {
                numeroDivisor = numeroDivisor + 1;
            }
        }
        // Havendo só uma contagem na variavel "Numero divisor", ele vai para o laço de
        // repetição
        if (numeroDivisor == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
/*
 * 8. Crie uma função que recebe um número inteiro como parâmetro e retorna 1 se
 * este
 * número é primo e zero caso não seja. Crie uma outra função que receba dois
 * números
 * inteiros – A e B – como parâmetros e retorne um vetor de inteiros contendo
 * todos os
 * números primos entre A e B. O programa principal deve ler os números A e B e
 * depois de
 * chamar a segunda função, imprimir o vetor retornado pela mesma.
 */