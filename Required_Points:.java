import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input
        int A = scanner.nextInt(); // Cost of one special attack
        int B = scanner.nextInt(); // Available points
        
        // Output
        System.out.println(maxSpecialAttacks(A, B));
    }

    public static int maxSpecialAttacks(int A, int B) {
        return B / A;
    }
}
