import java.util.Scanner;
public class Questao12 {
    public static void main(String[] args) throws Exception {
    int numM, numN;
    Scanner sc = new Scanner(System.in);

    System.out.print("Leia o valor de M: ");
        numM = sc.nextInt();
    System.out.print("Leia o valor de N: ");
        numN =  sc.nextInt();

    int resultado = ackermann(numM, numN);
    System.out.print("O valor é: "+resultado);
    sc.close();
 }
    static int ackermann (int numM , int numN ){
        int ret = 0;
            if (numM == 0){
                ret = numN+1;
                } else if (numM > 0 && numN == 0) {
                    ret = ackermann(numM - 1, 1); 
                    }else if (numM>0 && numN >0) {
                        ret = ackermann(numM - 1, ackermann(numM, numN-1));
                            }return ret;
    }
}