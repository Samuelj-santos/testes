import java.util.Scanner;
 
public class testesS {

    public static void main(String[] args) {
        double Anos, meses, dias;

        Scanner s = new Scanner(System.in);

       System.out.println("quantos anos vc tem?");
       Anos= s.nextDouble();
       System.out.println(" E quantos meses vc tem?");
       meses= s.nextDouble();
       System.out.println(" E quantos dias vc tem?");
       dias= s.nextDouble();
       meses= Anos * 12;
       dias= meses*30; 
       System.out.println("sua  idade em dias é: "+ dias);
    
       

     

    }
}