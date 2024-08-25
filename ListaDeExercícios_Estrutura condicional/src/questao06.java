import java.util.Scanner;
public class questao06 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
char op;
int valorA, valorB, resultado;

System.out.print ("Digite o valor A: ");
valorA = sc.nextInt();
System.out.print ("Digite o valor B: ");
valorB = sc.nextInt();

        System.out.println ("Digite o caractere da operação: "
        +"\n (+)"
        +"\n (-)"
        +"\n (/)"
        +"\n (*)"
        +"\n ");
        op = sc.next().charAt(0);
    if(op == '+'){
    resultado = valorA + valorB;
    System.out.print (resultado);
    }else if(op=='-'){
        resultado = valorA - valorB;
            System.out.print (resultado);
        }else if(op == '*'){
            resultado = valorA * valorB; 
                System.out.print (resultado);
            }else if(op == '/'){
                resultado = valorA / valorB;
                    System.out.print (resultado);
            }else{
                System.out.print ("A operação é invalida!");
            }
       sc.close(); }
    }


