//https://www.devmedia.com.br/estatistica-descritiva-em-java/6160
package atividade;

import java.util.Scanner;  // Import Scanner class
import java.lang.Character;

public class Atividade12 { // class
    public Atividade12(){ // constrututor
        
        Scanner input = new Scanner(System.in);

        String musica;

        System.out.print("Informe a letra da musica: ");
        musica = input.nextLine();

        System.out.println("Está é a musica dançante: ");
        for(int i=0; i < musica.length(); i++ ){
            Character str = musica.charAt(i);
            if(i % 2 == 0){
                System.out.print(Character.toUpperCase(str));
            } else {
                System.out.print(Character.toLowerCase(str));
            }
        }
    }
}