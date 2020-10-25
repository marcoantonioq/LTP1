package atividade;

public class Atividade22 { // class
    public Atividade22(){ // constrututor
        
        // A)
        System.out.println("A)"); 
        for(int a=0; a<3;a++) { // altura
            for(int l=0; l<7;l++) { // largura
                if(a==0 || a == 2 || l == 0 || l == 6){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // B)
        System.out.println("B)"); 
        for(int a=0; a<7;a++) { // altura
            for(int l=0; l<7;l++) { // largura
                if( l==0 || a == l || a == 6 ){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // C)
        System.out.println("C)"); 
        for(int a=0; a<5;a++) { // altura
            for(int l=0; l<9;l++) { // largura
                if( a==4 || ( a - l ) == -4 || ( a + l ) == 4 ){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // E)
        System.out.println("E)"); 
        for(int a=0; a<10;a++) { // altura
            for(int l=0; l<13;l++) { // largura
                if( a % 3 == 0 || l % 2 == 0 ){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}