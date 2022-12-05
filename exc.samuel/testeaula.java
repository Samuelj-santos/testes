import java.util.Scanner;

public class testeaula {

    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int pHsolucao ;

     pHsolucao = s.nextInt();

      if (pHsolucao > 7) {
        System.out.println("sua solucao é ácida = " + pHsolucao);
        
      }    else if (pHsolucao < 7){
           System.out.println("sua solucao é básica = " + pHsolucao);

           }    else {
               System.out.println("sua solucao é neutra = " + pHsolucao);
              }

      } //programa para descobrir o pH da solucao  
    }