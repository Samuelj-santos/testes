import java.util.Scanner;

public class ForQuestao {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n,maior;
        maior=0;

        for(int i=0;i<=9;i++){
            n = s.nextInt();
         if (n>=maior) {
            maior=n;
         }   
        }
        System.out.println(maior);
    }
}