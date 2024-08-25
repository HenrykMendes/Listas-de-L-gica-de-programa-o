import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);    
        int valor01, valor02, razao;

    System.out.println("Digite o primeiro valor: "); valor01 =sc.nextInt();
    System.out.println("Digite o segundo valor: "); valor02 = sc.nextInt();
    System.out.println("Qual N termo deseja saber:  "); razao = sc.nextInt();

    int resultado = valor01 + (razao - 1)*(valor02-valor01);

    System.out.println(resultado);
    sc.close();
    }



}
/*Faça um algoritmo que receba o primeiro e o segundo termos de uma 
Progressão Aritmética e um número n que represente qual termo da PA o 
usuário deseja saber. O algoritmo deve calcular o termo an solicitado pelo 
usuário e mostrar na tela. 

Para obter o n-ésimo termo de uma PA, faz-se an = a1 + (n-1).r  */