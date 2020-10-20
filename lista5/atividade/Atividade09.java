
package atividade;
import java.util.Scanner;

public class Atividade09 {
    
    public Atividade09(){

        // Primeiros valores
        System.out.println("100   0   100");
        double salario = 100;
        double ir = 0;
        double salliq = 100;

        System.out.print("(salliq >= 100): ");
        if(salliq >= 100){
            System.out.println("é V ");
        } else {
            System.out.println("é F ");
        }

        // Segundo valor
        System.out.println("\n200   10   190");
        salario = 200;
        ir = 10;
        salliq = 190;

        System.out.print("(salliq < 190): ");
        if(salliq < 190){
            System.out.println("é V ");
        } else {
            System.out.println("é F ");
        }

        // Terceiro valor
        System.out.println("\n200   10   190");
        salario = 300;
        ir = 15;
        salliq = 285;
        
        System.out.print("(salliq == (salario - ir)): ");
        if(salliq == (salario - ir) ){
            System.out.println("é V ");
        } else {
            System.out.println("é F ");
        }
	}
}
