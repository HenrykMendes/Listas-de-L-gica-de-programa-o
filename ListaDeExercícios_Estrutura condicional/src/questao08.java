import java.util.Scanner;
public class questao08 {
    public static void main(String[] args) {
        Scanner relogio = new Scanner(System.in);
        int hora1, hora2;
        int minuto1,minuto2;
        int segundo1, segundo2;
        
        
//definir a hora, minuto e segundo
        System.out.println("Primeira hora: ");
        hora1 = relogio.nextInt();

            System.out.println("Primeiro minuto: ");
            minuto1 = relogio.nextInt();

                System.out.println("Primeiro segundo: ");
                segundo1 = relogio.nextInt();

// definir a segunda hora, minuto e segundo
        System.out.println("Segundaa hora: ");
        hora2 = relogio.nextInt();

            System.out.println("Segundo minuto: ");
            minuto2 = relogio.nextInt();
            
                System.out.println("Segundo segundo: ");
                segundo2 = relogio.nextInt();
//calcular a diferença de tempo
int diferençaDeSegundos = (hora1 * 60 * 60 + minuto1*60 + segundo1) - (hora2 *60*60+minuto2*60+segundo2);
//horas são segundo multiplicados por 60 multiplicados por 60
//minutos são segundos multiplicados por 60
//segundos... São apenas segundos

// Valor armazenado na variavel vai ser dividido por 3600 (Segundos de uma hora)
// Os minutos serão calculados com o resto da divisão de 3600 e dividos por 60
int horas = (diferençaDeSegundos / 3600); 
int minutos = (diferençaDeSegundos %3600)/60;
int segundos = (diferençaDeSegundos%60);

System.out.println("A diferença de tempo é de: "+horas+" horas, "+minutos+" minutos, "+segundos+" segundos.");
relogio.close();
    }
    
}
/*Escreva um algoritmo que, dadas duas horas (escritas através de três números 
inteiros positivos: hora, minuto e segundo), retorne a diferença de tempo entre 
elas. Exemplo: 2 hs 4 min 30 s e 3 hs 5 min 40 s. A diferença é 1 h 1 min e 10 
s. */