import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) throws Exception {
        int valorB, valorA,valorDeTroca;
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o valor a: ");
            valorA =sc.nextInt();
        System.out.print("Digite o valor b: ");
            valorB = sc.nextInt();

        valorDeTroca = valorA;
        valorA = valorB;
        valorB = valorDeTroca;

System.out.println("O valor de A é igual a "+valorA);
System.out.println("O valor de B é igual a "+valorB);
sc.close();


    }
}
/*Ler dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma 
que a variável A passe a possuir o valor da variável B e a variável B passe a 
possuir o valor da variável A. Apresentar os valores trocados */