import java.util.Scanner;

public class whileaula {

    public static void main(String[] args) {
      int x, cont;
      Scanner s = new Scanner(System.in);
      x = s.nextInt();
      cont = 0;
      while (cont < 31) {
        System.out.println(x);
        x++;
        cont++;
      }
    }
}