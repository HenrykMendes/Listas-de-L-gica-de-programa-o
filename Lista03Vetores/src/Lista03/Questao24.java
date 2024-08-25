package Lista03;

import java.util.Scanner;

public class Questao24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  valorN;
        int contador = 0;
do{ //1. primeiro, checar se o valorN<=0 e ValorN>100
        System.out.print("\nDigite o valor N: ");
        valorN = sc.nextInt();
     if (valorN <=0 || valorN>100) {
        System.out.print("O valor está fora da faixa permitida");
} }while (valorN <=0 || valorN>100);

//atribuir valor ao vetor baseado no valorN
  int vetor [] = new int[valorN];
    for(int numero = 2; numero<=valorN;numero++){
        boolean primo = true;
        for(int divisao = 2;divisao<=Math.sqrt(numero);divisao++ ){
            if (numero %divisao == 0) {
                primo = false;
                break;
            }   
        }
       
    if (primo) {
        vetor[contador++] = numero;
    }
    }
for (int i = contador -1; i>=0; i--){
    System.out.println(vetor[i]);
}
sc.close();
    }
}
/*Faça um algoritmo que leia um número N e escreva os N primeiros números primos em 
ordem decrescente.Considere que N é no máximo igual a 100. Ex: Se N=5, escreva 11,7,5,3,2.*/