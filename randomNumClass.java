package randomNum;

import java.util.Random;
import java.util.Scanner;

public class randomNumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer, guess, attemptsNum = 0;
        final int maxAttempts = 5;
        String str, another = "y";

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        answer = generator.nextInt(101) + 1;

        while (another.equals("y") || another.equals("Y")) {
            System.out.println("Guess a number between 1 and 100");

            System.out.println("Enter your guess (0 to quit):");

            guess = scan.nextInt();
            attemptsNum = 0;
            while (guess != 0)

            {
                attemptsNum++;
                if (guess == answer) {
                    System.out.println("Right!");
                    break;
                } else if (guess < answer)
                    System.out.println("Your guess was too LOW.");
                else if (guess > answer)
                    System.out.println("Your guess was too HIGH.");

                if (attemptsNum == maxAttempts) {
                    System.out.println("The number was " + answer);
                    break;

                }

                System.out.println("Enter your guess (0 to quit):");
                guess = scan.nextInt();
            }

            System.out.println("Want to Play again?(y/n)");
            another = scan.next();
        }
        System.out.println("Thanks for playing");
		     }	
	}


