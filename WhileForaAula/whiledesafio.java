import java.util.Scanner;
public class whiledesafio {

    public static void main(String[] args) {
        int x;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();

        while (x >= 0) {
          if ( x%2 == 0) {
            System.out.println( "seu numero e par");
          } else {
            System.out.println( "seu numero e impar");
          } 
          x = s.nextInt();
        }
        
            System.out.println("o numero tem que ser diferente de zero");
            
        
    }
}