import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input
        int N = scanner.nextInt(); // Number of 5-seater cars
        int M = scanner.nextInt(); // Number of 7-seater cars

        // Output
        System.out.println(maximumPeople(N, M));
    }

    public static int maximumPeople(int N, int M) {
        return N * 5 + M * 7;
    }
}
