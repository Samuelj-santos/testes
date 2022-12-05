import java.util.Scanner;
public class whiledesafio2 {

    public static void main(String[] args) {
        int x, soma,cont, somax;
        Scanner s = new Scanner(System.in);
         x = s.nextInt();
         cont = 0;
         soma = x;
          somax = x + soma;
          
        while(cont < 15){
         x = s.nextInt();
          cont++;
          if (cont==15) {
            System.out.println(somax);
          }
        }
    }
}