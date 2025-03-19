import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner Scanner = new Scanner(System.in);
    System.out.println("wpisz dlugość boku trójkąta:");
    
    System.out.print("bok A:");
    double a = scanner.nextDouble();

    System.out.print("bok B:");
    double b = scanner.nextDouble();
    
    System.out.print("bok C:");
    double c = scanner.nextDouble();

    //obliczanie pota trójkąta
    double s = (a + b + c) / 2; 
    double area = Math.sqrt(s * (s - a)* (s - b) * (s - c)); 
  }
}