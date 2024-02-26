import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in);

        // Prompt for three values
        System.out.println("Please enter three integers and I will compute their average.");
        
        // Enter the first value
        System.out.print("Enter the first value: ");
        val1 = scan.nextInt();
        
        // Enter the second value
        System.out.print("Enter the second value: ");
        val2 = scan.nextInt();
        
        // Enter the third value
        System.out.print("Enter the third value: ");
        val3 = scan.nextInt();

        //compute the average
        average = (val1 + val2 + val3) / 3.0;

        //print the average
        System.out.println("The average is " + average);
    }
}

