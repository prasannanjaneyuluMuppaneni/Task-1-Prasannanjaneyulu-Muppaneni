import java.util.*;
class DecodeLabs_Java_P1{
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int maxAttempts = 7;
        char choice;
        do{
            int random = r.nextInt(100)+1;
            int guess = 0;
            int attempts = 0;
            int score = 70;
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have only 7 attempts.");
            while (attempts<maxAttempts) {
                try {
                    System.out.print("\nEnter a number in range between 1 to 100: ");
                    guess=sc.nextInt();
                    if (guess > random) {
                        System.out.println("Number is Higher than Expected");
                        attempts++;
                        score -= 10;
                    }
                    else if (guess<random) {
                        System.out.println("Number is Lower than Expected");
                        attempts++;
                        score -= 10;
                    }
                    else {
                        System.out.println("\nYou Have Won!");
                        System.out.println("Attempts Taken : " + (attempts + 1));
                        System.out.println("Final Score : " + score + "/70");
                        break;
                    }
                    System.out.println("Remaining Attempts : "
                            + (maxAttempts - attempts));
                    System.out.println("Current Score : "
                            + score + "/70");
                }
                catch (Exception e) {
                    System.out.println("Expected Input Numbers Only");
                    sc.nextLine();
                }
            }
            if (attempts == maxAttempts && guess != random) {
                System.out.println("\nMaximum Number of Attempts Completed!");
                System.out.println("The Correct Number Was: " + random);
                System.out.println("Final Score: 0/70");
                System.out.println("Better Luck Next Time!!");
            }
            System.out.print("\nDo You Want To Play Again (Y/N): ");
            choice = sc.next().charAt(0);
        } while (choice=='Y'||choice=='y');
        System.out.println("\nThank You For Playing!");
        sc.close();
    }
}