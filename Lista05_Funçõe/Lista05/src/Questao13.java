import java.util.Scanner;
public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado, valorCalculo, valorCalculo2;

        System.out.print("Digite o valor de n: ");
        valorCalculo = scanner.nextInt();
        
        System.out.print("Digite o valor de k: ");
        valorCalculo2 = scanner.nextInt();
        
        resultado = grupos(valorCalculo, valorCalculo2);
        System.out.println("O número de grupos distintos é: " + resultado);

        scanner.close();
    }
    public static int grupos(int valorMetodo, int valorComb) {
        if (valorComb == 1 || valorComb == valorMetodo) {
            return valorMetodo;
        } else {
            return grupos(valorMetodo - 1, valorComb - 1) + grupos(valorMetodo - 1, valorComb);
        }
    }
}