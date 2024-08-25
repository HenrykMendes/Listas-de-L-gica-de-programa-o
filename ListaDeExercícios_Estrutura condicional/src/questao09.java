import java.util.Scanner;

public class questao09 {
  public static void main(String[] args) {
    int lado01,lado02,lado03;
        Scanner triangulo = new Scanner(System.in);
do{
    System.out.print("Lado 01: ");
    lado01 = triangulo.nextInt();
    System.out.print("Lado 02: ");
    lado02 = triangulo.nextInt();
    System.out.print("Lado 03: ");
    lado03 = triangulo.nextInt();

        if (lado01 <= 0 || lado02 <= 0 || lado03 <= 0) {
            System.out.println("Nenhum dos valores pode ser igual a zero, por favor, refaça");
    }
    
}while (lado01 <= 0 || lado02 <= 0 || lado03 <= 0);
    

    if (lado01 == lado02 && lado02 == lado03) {
        System.out.print("Classificação: Triangulo Equilátero");
            }else if (lado01 == lado02 || lado02 == lado03 || lado03 == lado01) {
                System.out.print("Classificação: Triângulo Isóceles");
                }else {
                    System.out.print("Classificação: Triângulo Escaleno");
        }
        triangulo.close();
    }
}

/*Escrever um algoritmo que leia três valores inteiros e verifique se eles podem 
ser os lados de um triângulo. Se for possível, o algoritmo deve  também qual o 
tipo de triângulo que eles formam: equilátero, isósceles ou escaleno. 

Propriedade: o comprimento de cada lado de um triângulo é menor do que a 
soma dos comprimentos dos outros dois lados. 

Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais; 
Triângulo Isósceles: aquele que tem os comprimentos de dois lados iguais. 
Portanto, todo triângulo equilátero é também isósceles; 
Triângulo Escaleno: aquele que tem os comprimentos de seus três lados 
diferentes.  */