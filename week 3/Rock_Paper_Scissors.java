import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        String personPlay;    
        String computerPlay = "";  
        int computerInt;  
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        System.out.print("Enter your play (R, P, or S): ");
        personPlay = scan.next().toUpperCase();
        computerInt = generator.nextInt(3);
        switch (computerInt) {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
                break;
        }

        System.out.println("Computer's play: " + computerPlay);
        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors. You win!!");
            else if (computerPlay.equals("P"))
                System.out.println("Paper covers rock. You lose!!");
            else
                System.out.println("Invalid play by computer");
        else if (personPlay.equals("P"))
            if (computerPlay.equals("R"))
                System.out.println("Paper covers rock. You win!!");
            else if (computerPlay.equals("S"))
                System.out.println("Scissors cuts paper. You lose!!");
            else
                System.out.println("Invalid play by computer");
        else if (personPlay.equals("S"))
            if (computerPlay.equals("P"))
                System.out.println("Scissors cuts paper. You win!!");
            else if (computerPlay.equals("R"))
                System.out.println("Rock breaks scissors. You lose!!");
            else
                System.out.println("Invalid play by computer");
        else
            System.out.println("Invalid play by you");
    }
}
