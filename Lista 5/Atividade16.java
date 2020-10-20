import java.util.Scanner;  // Import Scanner class

public class Atividade16 {

	public static void main (String arg []){

        double indice;

        Scanner Obj = new Scanner(System.in);

        System.out.print("Informe o índice: ");
        indice = Obj.nextInt();

        System.out.println("Índice: "+indice);
        if(indice >= 0.5){
            System.out.println("todos devem suspender suas atividades!");
        } else if(indice >= 0.4){
            System.out.println("1° e 2° grupo devem suspender suas atividades!");
        } else if(indice >= 0.3){
            System.out.println("1° grupo deve suspender suas atividades!");
        } else {
            System.out.println("Ídice permitido!");

        }

	}
}
