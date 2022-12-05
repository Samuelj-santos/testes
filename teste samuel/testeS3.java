import java.util.Scanner;
 
   public class testeS3 {

      public static void main(String[] args) {

        double salario, reajustado;

        Scanner s = new Scanner(System.in);
        System.out.println("qual o seu salario");
 


       salario= s.nextDouble()* (1/100);

       reajustado= salario - (salario/100); 

       System.out.println(reajustado);   
       //nao consegui saber oq deu errado

    }
}

    
