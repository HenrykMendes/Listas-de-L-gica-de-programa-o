package Lista02;
import java.util.Scanner;
public class Questao16 {

    public static void main(String[] args) {
    int folhinha[][] = new int[6][7];
    int contI, contJ;
    int numeroD, numeroDS;
    Scanner sc = new Scanner(System.in);

//entrada do dia do mês
    do{
        System.out.print("ValorA: ");
            numeroD =  sc.nextInt();
                    }while (numeroD > 31||numeroD<1);

//entrada do dia da semana
    do {
        System.out.print("Valor B: ");
            numeroDS =  sc.nextInt();
                    }while (numeroDS>7 || numeroDS<1);
                    
    int dia = 1;
        //variavel "dia" representa o valor do dia em questão.
    int linha = 0;
        //seguindo a regra das matrizes, atribuindo o valor 0, ao jogar na matriz ela ocupará a posição 1 da linha
    int coluna = numeroDS - 1;
        /*a coluna vai receber numeroDS-1 por que pela regra das folhinhaes
        o número das colunas começa em 0, logo, se não ouvesse esse numeroDS-1
        o dia 7 corresponderia a oitava coluna na folhinha*/
    
    
    // para cada espaço nas linhas e colunas, o valor de dia recebe mais um dia. 
while (dia < 31) {
    folhinha[linha][coluna] =  dia;
        dia++;   
}
coluna = (coluna + 1) % 7; 
    if (coluna == 0) {
        linha++;
        }

        for (contI = 0; contI <6; contI++){
            for (contJ = 0; contJ<7; contJ++){
                System.out.print(folhinha[contI][contJ] + " ");
                }
            System.out.println();
        }
    }
}
/*16) Faça um algoritmo que leia dois valores D e DS, correspondendo a um dia do mês e um dia da
semana (1-domingo, 2-segunda,... 7-sábado) e preencha uma matriz Folhinha[6][7] com o calendário
correspondente ao mês do dia digitado. 
A primeira coluna da matriz contém os domingos, a segunda
coluna contém as segundas e assim por diante. 
O algoritmo deve escrever a matriz gerada. As posições
não utilizadas da matriz devem conter 0's. Por exemplo, se as entradas forem D= 10 e DS=7, a matriz
Folhinha exibida ao final do algoritmo deve ser:

0 0 0 0 1 2 3
4 5 6 7 8 9 10
11 12 13 14 15 16 17
18 19 20 21 22 23 24
25 26 27 28 29 30 31
0 0 0 0 0 0 0 */