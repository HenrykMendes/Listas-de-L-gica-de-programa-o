import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        int numeroQuadrado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        numeroQuadrado = sc.nextInt();

        int resultadoQuadrado = numeroMetodoQuadrado(numeroQuadrado);

        System.out.println("A somatória de i^2 de 1 até " + numeroQuadrado + " é: " + resultadoQuadrado);
        sc.close();

    }

    public static int numeroMetodoQuadrado(int num2) {
        if (num2 == 1) {
            return 1;
        } else {
            return num2 * num2 + numeroMetodoQuadrado(num2 - 1);
        }
    }
}