// http://www.softblue.com.br/blog/java-strings-nao-use-operador-de-igualdade/
package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade20 { // class
    public Atividade20(){ // constrututor
        
        Scanner input = new Scanner(System.in);

        String senha="";

        while( ! senha.equals("2020") ) {
            System.out.print("Informe a senha: ");
            senha = input.nextLine();
        }
        System.out.print("Acesso permitido!!!");
    }
}
