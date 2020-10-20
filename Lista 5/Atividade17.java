import java.util.Scanner;  // Import Scanner class

public class Atividade17 {

	public static void main (String arg []){

        int idade;

        Scanner Obj = new Scanner(System.in);

        System.out.print("Informe a idade do nadador: ");
        idade = Obj.nextInt();

        if(idade >=5 && idade <= 7 ){
            System.out.println("Infantil A");
        } else if(idade >=8 && idade <= 11){
            System.out.println("Infantil B");
        } else if(idade >=12 && idade <= 13){
            System.out.println("Juvenul A");
        } else if(idade >=14 && idade <= 17){
            System.out.println("Juvenul B");
        } else if(idade >=18 ){
            System.out.println("Adultos");
        } else {
            System.out.println("Idade minima de 5 anos!");
        }
	}
}
