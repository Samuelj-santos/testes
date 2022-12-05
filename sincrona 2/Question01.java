import java.util.Scanner;
public class Question01 {
   
    public static boolean ehPrimo(int n){
        return (n/1 == n && n/n == 1 && n>1 && n%2 == 0) == true;
          
           
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;
        n= s.nextInt();
        //n = casos de teste
        int contt = 0;

        for(int cont =0 ; cont<n;cont++){
         int a = s.nextInt();
        
            ehPrimo(a);
         
          if (ehPrimo(a)== true) {
            contt++;
         }
        }
        System.out.print(contt);
    }
}