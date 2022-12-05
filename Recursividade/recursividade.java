import java.util.Scanner;

public class recursividade {

  public static int soma(int n){
    if (n == 1) {
        return 1;
    }else
     {
        return (2*n-1)+soma(n-1);
    }
}


    public static int main(int n){
    
    Scanner y =new Scanner(System.in);   
     int a,s;
    System.out.print("n = ");
    a = n;
    s = soma(a);
    return s;
    }

  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

       int e = main(x);

       System.out.println(e);  
       
    }
}//errado tava em c e tinha que transformar em java 
// agr deu certo kkkkkk