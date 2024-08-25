import java.util.Scanner;

public class questao05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String meseString[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
                int mes;

        System.out.println("Digite um mês em valor inteiro: ");
            mes = sc.nextInt();
            if (mes<1 || mes>12) {
                    System.out.println("Esse valor é inválido, não existe mês "+mes+".");    
                }else{
            //"mes" vai corresponder o posição que está dentro do vetor "mesesString"
                        System.out.println("O mês correspondente é: "+meseString[mes-1]);
            //O primeiro mês corresponde a 0, logo valor digitado do mês -1
            }
sc.close();
    }
}
/*Faça um algoritmo que receba o número do mês e mostre o mês correspondente 
escrito textualmente por extenso. Valide mês inválido. */