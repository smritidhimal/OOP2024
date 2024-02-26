import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.println("Enter the denominator: ");
        int denominator = scanner.nextInt();

        double decimalEquivalent = (double) numerator / denominator;

        System.out.println("Decimal equivalent of the fraction: " + decimalEquivalent);
    }
}
