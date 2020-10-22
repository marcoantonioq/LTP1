package atividade;

import java.util.Scanner;  // Import Scanner class

public class Atividade19 { // class
    public Atividade19(){ // constrututor
        
        Scanner input = new Scanner(System.in);
        
        String jogada1, jogada2;
        
        System.out.print("Jogador 1: (pedra-papel-tesoura)? ");
        jogada1 = input.nextLine();
        
        System.out.print("Jogador 2: (pedra-papel-tesoura)? ");
        jogada2 = input.nextLine();
        
        if(jogada1 == jogada2) {
            System.out.println("\nDe novo!");
        }
        
        if(jogada1 == "tesoura" && jogada2 == "papel") {
            System.out.println("Jogador 1 Bazinga!!!");
        }else if(jogada1 == "papel" && jogada2 == "tesoura") {
            System.out.println("Jogador 2 Raj trapaceou!!!");
        }else if(jogada1 == "papel" && jogada2 == "pedra") {
            System.out.println("Jogador 1 Bazinga!!!");
        }else if(jogada1 == "pedra" && jogada2 == "papel") {
            System.out.println("Jogador 2 Raj trapaceou!!!");
        }else if(jogada1 == "pedra" && jogada2 == "lagarto") {
            System.out.println("Jogador 1 Bazinga!!!");
        }else if(jogada1 == "lagarto" && jogada2 == "pedra") {
            System.out.println("Jogador 2 Raj trapaceou!!!");
        }else if(jogada1 == "lagarto" && jogada2 == "spock") {
            System.out.println("Jogador 1 Bazinga!!!");
        }else if(jogada1 == "spock" && jogada2 == "lagarto") {
            System.out.println("Jogador 2 Raj trapaceou!!!");
        }else if(jogada1 == "spock" && jogada2 == "tesoura") {
            System.out.println("Jogador 1 Bazinga!!!");
        }else if(jogada1 == "tesoura" && jogada2 == "spock") {
            System.out.println("Jogador 2 Raj trapaceou!!!");
        }else if(jogada1 == "tesoura" && jogada2 == "lagarto") {
            System.out.println("Jogador 1 Bazinga!!!");
        }else if(jogada1 == "lagarto" && jogada2 == "tesoura") {
            System.out.println("Jogador 2 Raj trapaceou!!!");
        }else if(jogada1 == "lagarto" && jogada2 == "papel") {
            System.out.println("Jogador 1 Bazinga!!!");
        }else if(jogada1 == "papel" && jogada2 == "lagarto") {
            System.out.println("Jogador 2 Raj trapaceou!!!");
        }else if(jogada1 == "papel" && jogada2 == "spock") {
            System.out.println("Jogador 1 Bazinga!!!");
        }else if(jogada1 == "spock" && jogada2 == "papel") {
            System.out.println("Jogador 2 Raj trapaceou!!!");
        }else if(jogada1 == "spock" && jogada2 == "pedra") {
            System.out.println("Jogador 1 Bazinga!!!");
        }else if(jogada1 == "pedra" && jogada2 == "spock") {
            System.out.println("Jogador 2 Raj trapaceou!!!");
        }else if(jogada1 == "pedra" && jogada2 == "tesoura") {
            System.out.println("Jogador 1 Bazinga!!!");
        }else if(jogada1 == "tesoura" && jogada2 == "pedra") {
            System.out.println("Jogador 2 Raj trapaceou!!!");
        } else {
            System.out.println("Jogada invalida!!!");
        }
        
        
    }
}
