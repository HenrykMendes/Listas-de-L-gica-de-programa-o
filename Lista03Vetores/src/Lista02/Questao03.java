package Lista02;
import java.util.Scanner;
@SuppressWarnings ("all")
public class Questao03 {
public static void main (String []args){

        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        byte contador;

//a mensagem vai se repetir até 20 vezes
    for (contador = 0; contador<20; contador++)
            System.out.println("Digite os valores (conceitos) dos alunos: ");
                vetor [contador] = sc.nextInt();

int vetor02 [] = new int[5];
for (int valor : vetor){
    vetor02[valor-1]++;
}
for (int i = 0; i < 5;i++){

}
    }
}
/*3) Faça um algoritmo que leia os conceitos (1, 2, 3, 4 ou 5) dos alunos de uma turma de 20
alunos. Após, o algoritmo desenha um histograma com os conceitos na forma
111
2222
3333333333
44
5
por exemplo, se houveram três alunos com conceito 1, quatro com conceito 2, dez com
conceito 3, dois com conceito 4 e um com conceito 5. Estes números citados aqui são apenas
exemplos, seu algoritmo deve exibir os números de acordo com a entrada de dados recebida. */