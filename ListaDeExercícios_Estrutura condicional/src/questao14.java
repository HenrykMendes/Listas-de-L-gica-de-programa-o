import java.util.Scanner;
public class questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1,nota2,nota3;
        
        System.out.println("Nota 01: "); nota1 = sc.nextInt();
        System.out.println("Nota 02: "); nota2 = sc.nextInt();
        System.out.println("Nota 03: "); nota3 = sc.nextInt();

        double resultado;

        resultado = (nota1+nota2+nota3) / 3;
        System.out.println(resultado);
        sc.close();
    }
}
/*. Faça um algoritmo que receba 3 notas de um aluno e seus respectivos pesos, 
calcule e informe a média ponderada */