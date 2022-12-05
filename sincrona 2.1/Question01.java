import java.util.Scanner;

public class Question01 {

    public static  int soma (int n){
        int sooma = 0;
        while (n>0) {
        int mod = n%10;
         sooma = sooma+mod;
        n = n/10;
       }
        return sooma; 

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int b = 0;
        int c = 0;
        int d  = 0;
        int e = 0;
      
         for(int cont = 0 ; cont<N ; cont ++){
             int a = s.nextInt();
             
             b = soma(a);
              
             if (b>c) {
            c=b;
            e = a;

         } 
        
          }
          System.out.print(e);
        
         
         
         
       

    }
}