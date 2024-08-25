import java.util.Scanner;

@SuppressWarnings("all")
public class Questao02 {
    public static void main(String[] args) throws Exception {
        int numeroParImpar;
        double resultadoParImpar;
        int numeroNulo;
        double resultadoParImparNulo;
        double resultadoDeDelta;
        int vetor[] = new int[3], contadorDelta;
        Scanner sc = new Scanner(System.in);

        // referente a questão "a"
        System.out.println("\nA. 0 caso o número não seja positivo e 1 caso ele seja positivo"
                + "(ele deve ser, de preferência, positivo)"
                + "\nDigite um valor: ");
        numeroParImpar = sc.nextInt();

        // referente a questão "b"
        System.out.println("\nB. 0 caso o número não seja nulo e 1 caso ele seja nulo: "
                + "\nDigite o número: ");
        numeroNulo = sc.nextInt();

        // referente a questão "c"
        for (contadorDelta = 0; contadorDelta < 3; contadorDelta++) {
            System.out.println("C. Receba três valores reais como parâmetro, digite o " + (contadorDelta + 1) + ": ");
            vetor[contadorDelta] = sc.nextInt();
        }

        // chamando o método "ParImpar"
        resultadoParImpar = parOuImpar(numeroParImpar);
        System.out.print("\n1. O valor referente a " + numeroParImpar + " é: " + resultadoParImpar);

        // chamando o método "nuloNaoNulo"
        resultadoParImparNulo = nuloNaoNulo(numeroNulo);
        System.out.println("\n2. O valor referente a " + numeroNulo + " é: " + resultadoParImparNulo);

        // chamando o metodo "delta" com vetores.
        resultadoDeDelta = (delta(vetor));
        System.out.println("3. O valor de delta é: " + resultadoDeDelta);

        // Se delta for maior que zero, as "duas raízes" serão calculadas como 𝑥1
        if (resultadoDeDelta > 0) {
            double raiz01 = deltaMaiorQueZero(resultadoParImpar, resultadoParImparNulo, resultadoDeDelta);
            double raiz02 = deltaMaiorQueZero(resultadoParImpar, resultadoParImparNulo, resultadoDeDelta);
            System.out.println("1. Os resultados das raizes são: "
                    + " " + raiz01
                    + " " + raiz02);
            // Se delta for zero, as raízes são iguais e calculadas como
        } else if (resultadoDeDelta == 0) {
            double raizDelta = deltaIgualZero(resultadoParImpar, resultadoParImparNulo);
            System.out.println("2. O resultado é: "+raizDelta);
        } else {
            double velorImaginario = Math.sqrt(-contadorDelta) / 2*resultadoParImpar;
            System.out.println("3. O resultado é: "+velorImaginario);
        }
        sc.close();

    }

    // Função (Ou método) referente a alternativa "a"
    static double parOuImpar(double valorPositivoNegativo) {
        int ret = 0;
        // Não tem necessidade de "if_else" já que o valor da variável de retorno já é
        // 0¯\_(ツ)_/¯
        if (valorPositivoNegativo > 1) {
            ret = 1;
        }
        return ret;
    }

    // Função (Ou método) referente a alternativa "b"
    static int nuloNaoNulo(double valorNulo) {
        int ret2 = 0;
        if (valorNulo < 0) {
            ret2 = 0;
        } else if (valorNulo == 0 || valorNulo > 0) {
            ret2 = 1;
        }
        return ret2;
    }

    // Função (Ou método) referente a alternativa "c"
    // Achei melhor a ultilização de vetores, mais prático. ಠ_ಠ
    static int delta(int[] vetor) {
        int valorA = vetor[0];
        int valorB = vetor[1];
        int valorC = vetor[2];

        return (int) (Math.pow(valorB, 2) - 4 * valorA * valorC);
    }

    // verifica se o resultado é um valor diferente de zero
    static boolean seForZero(int verificar) {
        return verificar != 0;
    }

    static double deltaMaiorQueZero(double valorA1, double valorB1, double delta) {
        return -valorB1 + Math.sqrt(delta) / 2 * valorA1;
    }

    static double deltaIgualZero(double valorA2, double valorB2) {
        return -valorB2 / 2 * valorA2;
    }

    static double deltaMenorQueZero(double valorA3, double valorB3, double delta2) {
        return -valorB3 + Math.sqrt(delta2) / 2 * valorA3;
    }
}
