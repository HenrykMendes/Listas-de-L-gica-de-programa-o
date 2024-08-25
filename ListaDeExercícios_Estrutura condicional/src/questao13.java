import java.util.Scanner;

public class questao13 {
    public static void main (String [] args){
    int SalarioFixo = 1000, salarioUser;
    int resultado;
    Scanner sc =new Scanner(System.in);
    
System.out.println("Digite o valor do seu salario: ");
salarioUser = sc.nextInt();

    resultado = salarioUser / SalarioFixo;

System.out.print(resultado+" Salarios minimos");
  sc.close();  }
}
/*13. Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de 
uma pessoa. Calcular e imprimir quantos salários mínimos ela ganha */