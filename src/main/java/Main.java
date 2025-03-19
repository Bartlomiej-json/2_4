
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz długość boku trójkąta:");
        
        System.out.print("Bok A: ");
        double a = scanner.nextDouble();

        System.out.print("Bok B: ");
        double b = scanner.nextDouble();
        
        System.out.print("Bok C: ");
        double c = scanner.nextDouble();

        // Obliczanie pola trójkąta
        double s = (a + b + c) / 2; 
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
        System.out.printf("Pole trójkąta wynosi: %.2f\n", area);

        // Sprawdzanie czy trójkąt jest prostokątny
        double[] sides = {a, b, c};
        java.util.Arrays.sort(sides);  // Sortowanie boków
        if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) {
            System.out.println("Trójkąt jest prostokątny.");
        } else {
            System.out.println("To nie jest trójkąt prostokątny.");
        }
        scanner.close();
    }
}
