import java.util.Scanner;

public class questao12 {
    public static void main (String[]args){
Scanner sc = new Scanner(System.in);
float  suco = 2.00f,  salgado = 6.50f, resultado=0, resultado2=0;
int fim = 0;

    do{
    System.out.print("Máquina de lanches UCSAL"
    +"\n1. R$2,00 - Suco"
    +"\n2. R$6,50 - Salgado"
    +"\n3. Sair"
    +"\nNúmero do pedido: ");
    fim = sc.nextInt();

                        if (fim == 1) {
                            resultado = resultado + suco;
                            }
                            if (fim == 2) {
                                resultado2 = resultado2 + salgado;
                                }
    }while (fim != 3);
    float resultado3 = resultado + resultado2;

System.out.println("\nR$"+resultado3);
double gorjeta;
gorjeta = (resultado3 % 10);

System.out.println("\nGorjeta para o garçom: "+gorjeta);
System.out.println("Valor final: "+(resultado3 + gorjeta));
    sc.close();}
}
/*2. Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 
10% de gorjeta para o garçom. Faça um algoritmo que leia o valor gasto com 
despesas realizadas em um restaurante e mostre o valor total com a gorjeta.  */