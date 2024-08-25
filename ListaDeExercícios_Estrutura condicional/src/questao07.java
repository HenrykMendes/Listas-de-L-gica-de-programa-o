import java.util.Scanner;
public class questao07 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
int idade;
do{  
System.out.println("Idade: ");
    idade = sc.nextInt();
    if (idade<5 || idade >25) {
        System.err.println("\n!! Você não pode participar.");  }
    }while (idade<5 || idade >25);
    
    
         if (idade>=5 && idade<=7) {
            System.err.println("Categoria: Infantil A.");
            }else if (idade<=8 && idade < 10) {
                System.err.println("Categoria: Infantil B.");
                }else if (idade >=11&&idade<13) {
                    System.err.println("Categoria: Juvenil A.");
                    }else if (idade >=14&&idade<17) {
                        System.err.println("Categoria: Junior B.");
                        }else if (idade >=18&&idade<=25){
                            System.err.println("Categoria: Seniôr.");
                        }
sc.close();
    }
}

/*Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma 
das seguintes categorias: 
• Infantil A = 5 - 7 anos 
• Infantil B = 8 - 10 anos 
• juvenil A = 11- 13 anos 
• juvenil B = 14 - 17 anos 
• Sênior = 18 - 25 anos  */