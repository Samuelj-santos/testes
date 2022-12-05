import java.util.Scanner;
public class modiwhiledesafio {

    public static void main(String[] args) {
        int x, cont;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        cont = 10;
        while (x >= 10 && x<=100) {
          if ( x%2 == 0) {
            System.out.println( "seu numero e par");
          } else {
            System.out.println( "seu numero e impar");
          } 
          x = s.nextInt();
        }
        
            System.out.println("o numero tem que ser maior que 10 e menor que 100");
            
        
    }
}