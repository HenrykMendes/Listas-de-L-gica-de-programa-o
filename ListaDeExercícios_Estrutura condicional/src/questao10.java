import java.util.Scanner;
public class questao10 {
    
    public static void main(String[] args) {
        float fahrenheit, centígrados;
        Scanner sc = new Scanner(System.in);
do {
        System.out.print("\nDigite um valor em graus centígrados"
        +"\ne 0 pra parar o loop: ");
        centígrados = sc.nextFloat();
//O valor será mulplicado por 09, após somado a 160 será dividido por 05
fahrenheit = ((9*centígrados)+160)/5;


System.out.print(fahrenheit+"F°");
} while (centígrados != 0);
sc.close();
        }
}
/*10. Faça um algoritmo que receba uma temperatura em centígrados e transforme 
para fahrenheit. Sabe-se que a fórmula para conversão é F=((9.C)+160)/5.  */