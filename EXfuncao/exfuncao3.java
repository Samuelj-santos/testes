import java.util.Scanner;
public class exfuncao3 {

 public static double soma(double a, double b){
  double c = a + b;
  return c;
 }
 public static double divisao(double a, double b){
 double c = a/b;
 return c;
 }
 public static double subtracao(double  a, double b){
double c = a-b;
return c;
 }
 public static double multiplicacao( double a, double b){
double c = a*b;
return c;
 }

    public static void main(String[] args) {
      int x,y;
      Scanner s = new Scanner(System.in);
      char c = s.next().charAt(0);
      x = s.nextInt();
      y = s.nextInt();
      
      if (c == '+') {
        double a = soma(x, y);
        System.out.println(a);

    }else if (c == '-') {
        double b = subtracao(x, y);
        System.out.println(b);
        
    }else if (c == '/') {
        double c2 = divisao(x, y);
        System.out.println(c2);

    }else if (c == '*') {
        double d = multiplicacao(x, y);
        System.out.println(d);
    }
}}