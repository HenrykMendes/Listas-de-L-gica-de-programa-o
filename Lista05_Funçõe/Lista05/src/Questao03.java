import java.util.Scanner;

public class Questao03 {

    static int calcularMaiorNumero(int valorA, int valorB) {
        if (valorA > valorB) {
            return valorA;
        } else {
            return valorB;
        }
    }

    public static void main(String[] args) throws Exception {

        int numeroUm, numeroDois, numeroTres;
        int resultadoMaiorValor;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor um: ");
        numeroUm = sc.nextInt();
        System.out.print("Digite o valor dois: ");
        numeroDois = sc.nextInt();
        System.out.print("Digite um três: ");
        numeroTres = sc.nextInt();

        /*
         * Primeiro armazena o valor da comparação do numeroUm e numeroDois na variavel
         * "resultadoMaiorValor"
         * em seguida compara a variavel "resultadoMaiorValor" com o número três
         */
        resultadoMaiorValor = calcularMaiorNumero(numeroUm, numeroDois);
        resultadoMaiorValor = calcularMaiorNumero(resultadoMaiorValor, numeroTres);

        System.out.print("O maior valor entre: " + numeroUm + ", " + numeroDois + ", " + numeroTres + " é "
                + resultadoMaiorValor);

        sc.close();
    }
}
