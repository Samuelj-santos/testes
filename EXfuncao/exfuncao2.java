import java.util.Scanner;
public class exfuncao2 {
    public static int triplo(int a){
        a = a*3;
        return a;
    }

   public static int dobro(int a ) {
    a = a*2;
    return a;
    
   }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        n =  triplo(dobro(n));
         
        System.out.println(n);
    }
}