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
    system.out.printf(" Pole trójkąta wynosi: %.2f\n", area);

    //sprawdzanie czy trójkąt jest prostokątny
    double[] sides = {a, b, c};
    if (Math.pow(sides[0], 2) + Math.pow(sides[1],2) == Math.pow(sides[2],2)){
      System.out.println("Trójkąt jest prostokątny.");
      
    } else {
      System.out.println("To nie jest trójkąt prostokątny");
    }
    scanner.close();
  }
}