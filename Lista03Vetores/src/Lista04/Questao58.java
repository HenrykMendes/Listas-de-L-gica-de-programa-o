package Lista04;
import java.util.Scanner;
import java.util.Arrays;
@SuppressWarnings("all")
public class Questao58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[5];
        int i;

    for(i=0; i<5;i++){
        System.out.print("Valor "+(i+1)+" ");
        vetor[i]=sc.nextInt(); 
        }
        //coloquei arrays para ordenar os números, não sei fazer de forma manual
        Arrays.sort(vetor);

        if (vetor[0]==vetor[1]&&vetor[1]==vetor[2]&&vetor[2]==vetor[3]&&vetor[3]==vetor[4]) {
            System.out.print("Parabéns, você possui um Full hand");
        }else{
            System.out.print("Infelizmente, você não possui um FULL hand");
        }
        


    sc.close();}
}
/*58)Faça um algoritmo que leia os 5 números obtidos em um arremesso de 5 dados no jogo 
de General, e verifique se os números contém um full-hand (3 números iguais, e os outros 
dois números iguais entre si, mas diferentes dos 3 primeiros. Ex. 3,3,3,2,2), e escreva: 1 - se 
os números contem um full-hand; 0 - se não contem.  */