import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
double valorDigitado;
double nota50=0,nota10=0,nota05=0,nota01=0;

System.out.print("Digite um valor: "); valorDigitado = sc.nextDouble();
double valorOriginal = valorDigitado;

if (valorDigitado >=50) {
    nota50 = valorDigitado / 50;
    valorDigitado = valorDigitado %50;
}
    if (valorDigitado >=10) {
        nota10 = valorDigitado/10;
        valorDigitado =  valorDigitado%10;
    }
        if (valorDigitado >=5) {
            nota10 = valorDigitado/5;
            valorDigitado =  valorDigitado%5;
        }
            if (valorDigitado >=1) {
                nota10 = valorDigitado/1;
                valorDigitado =  valorDigitado%1;
            }
System.out.print("As notas para o valor "+valorOriginal+" Foram:"
+"\n"+nota50+" Cédulas de 50"
+"\n"+nota10+" Cédulas de 10"
+"\n"+nota05+" Cédulas de 05"
+"\n"+nota01+" Cédulas de 01");
sc.close();

    }
}
/*Faça um algoritmo que simule um caixa eletrônico para saque. O algoritmo 
deve receber um valor monetário (o valor deve ser recebido como um valor 
inteiro) e informar quantas notas de R$50,00, R$10,00, R$5,00 e R$1,00 
devem ser entregues ao usuário usando o mínimo de notas possível.  */