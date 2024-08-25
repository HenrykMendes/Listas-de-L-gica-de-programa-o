import java.util.Scanner;
public class questao04 {

public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    int valor01, valor02,valor03;

        System.out.println("Digite valor de A: ");
        valor01 = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        valor02 = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        valor03 = sc.nextInt();

    if (valor01 >=10 && valor01 <=150){ System.out.println("O valor "+valor01+" está presente entre 10 e 150");
        }else{System.out.println("O valor "+valor01+" não está no intervalor de 10 e 150");
            }
        if (valor02 >=10 && valor02 <=150){ System.out.println("O valor "+valor02+" está presente entre 10 e 150");
            }else{System.out.println("O valor "+valor02+" não está no intervalor de 10 e 150");
                 }
                if (valor03>=10 && valor03<=150){ System.out.println("O valor "+valor03+" está presente entre 10 e 150");
                     }else{System.out.println("O valor "+valor03+" não está no intervalor de 10 e 150");
                        }
sc.close();
    }

    }

/*Faça um algoritmo que leia 3 números e ao final informe quantos dentre os 3 
números estão no intervalo entre 10 (inclusive) e 150 (inclusive) */