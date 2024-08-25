package Lista04;
import java.util.Scanner;
@SuppressWarnings("all")
public class Questao55_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cartas [][] = new int[10][2];
        int i;
        int naipe, valor;
        for (i = 0;i<10;i++){
            //matriz para inserir 10 valores em 2 colunas (para valores e nipe)
            System.out.print("DIGITE O VALOR DA CARTA "+(i+1)+" entre 1 e 13: ");
            cartas [i][0] = sc.nextInt();
            System.out.print("DIGITE O VALOR DO NIPE "+(i+1)+" "
            +"\n1 - ouros"
            +"\n2 - copas"
            +"\n3 - paus"
            +"\n4 - espadas"
            +"\n: ");
            cartas [i][1]=sc.nextInt();
        }
        //para contar o nippe que possui 4 valores
        for (naipe=1;naipe<=4;naipe++){
            //para contar o valor que possui até 14 valores
            for (valor=1;valor<=13;valor++){
                //contar os 10 valores declarados no primeiro "for"
                for (i=0;i<10;i++){
                    // colocar os valores em ordem, comparar o valor do contador nipe com cartas[i][1]
                    // e com os "valores" com o contador cartas[i][1]
                    if (cartas[i][1] == naipe && cartas[i][0] == valor) {
                        System.out.println("Carta "+(i+1)+": Número "+cartas[i][0]+" Naipe "+cartas[i][1]);
                    }
                }
            }
        }
    sc.close();}
}