import java.util.Scanner;
public class questao11 {

public static void main(String[] args) {
    int hora01;
    int minuto01;
    int segundo01;
Scanner tempo = new Scanner(System.in);
    System.out.print("Digite a hora atual: ");
    hora01 = tempo.nextInt();
        System.out.print("agora os minutos: ");
            minuto01 = tempo.nextInt();
                System.out.print("Por ultimo, os segundos: ");
                    segundo01 = tempo.nextInt();

    int TempoPassado = (hora01 * 60 * 60 + minuto01 * 60 + segundo01);

System.out.println(TempoPassado+" segundos se passaram");
tempo.close();

    }
}
/* Faça um algoritmo que solicite a hora atual (expressa em horas, minutos e 
segundos) ao usuário e informe quantos segundos do dia já passaram.  */