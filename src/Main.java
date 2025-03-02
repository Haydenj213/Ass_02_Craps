import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random randomDice = new Random();
        Scanner in = new Scanner(System.in);

        int dice1;
        int dice2;
        int sum;
        int point = 0;
        String playChoice;

        do {
            dice1 = randomDice.nextInt(6) + 1;
            dice2 = randomDice.nextInt(6) + 1;
            sum = dice1 + dice2;

            System.out.printf("%-10s%-10s%-10s%n", "Die1", "Die2", "Sum");
            System.out.println("----------------------------------------------------------");

            System.out.printf("%-10d%-10d%-10d%n", dice1, dice2, sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Darn! Looks like have Crapped out and lost!");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Nice! Looks like you rolled a Natural. You Win!");
            } else if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
                point = sum;
                System.out.println(sum + " is now the point. Rolling again");
            } else if (sum == point) {
                System.out.println("Nice! Looks like you rolled the point number. You Win!");
            } else if (point == 7)
                System.out.println("Darn! Looks like you rolled a 7 instead of a point number. You lose.");


            System.out.println("Would you like to try playing Craps again?");
            playChoice = in.nextLine();

        } while (!playChoice.equalsIgnoreCase("no"));
        System.out.println("Thank for playing Craps!");


    }
}