import java.util.Scanner;
public class Question02 {

    public static void main(String[] args) {
        int n,c,ac,contt;
        Scanner s = new Scanner(System.in);
        ac=0;
        contt=0;
        boolean a ;
        n=s.nextInt();
        c=s.nextInt();

        for(int con = 0;con<n;con++){
         int sa,e;
          sa = s.nextInt();
          e= s.nextInt();

           ac = ac+e;
           ac= ac-sa;
          
            if (ac>c ) {
            a = true;
           }
           

        } if (contt ==0 || ac==c) {
            System.out.print("N");
        }
        else {
            contt++;
            System.out.print("S");
            }
       
    }
}