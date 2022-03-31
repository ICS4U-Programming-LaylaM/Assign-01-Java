import java.util.Scanner;

/**
* This program allows users to play a game of
* rock, paper, scissors.
*
* @author Layla Michel
* @version 1.0
* @since 2022-03-21
*/

class RockPaperScissors {
    /**
    * Declaring variables.
    */
    static Scanner myObj;
    static String userInput;
    static String computerString;
    static String output;
    static String outputString;

    /**
    * Creating private constructor due to
    * public/default constructor error.
    *
    * @throws IllegalStateException if there is an issue
    */
    private RockPaperScissors() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Creating function to see if user wins rock paper scissors
    * against the computer.
    *
    * @param user as string
    *
    * @return outputString as string
    */
    public static String rps(String user) {
        // Generates random number from 1 to 3 for computer
        final int computerInt = (int) Math.floor(Math.random()
            * (3 - 1 + 1) + 1);

        // Assigns each number with either rock, paper or scissors
        if (computerInt == 1) {
            computerString = "rock";
            // Checks and displays if user tied, won or lost
            if ("rock".equals(user)) {
                outputString = "You both drew rock, it's a tie.";
            } else if ("paper".equals(user)) {
                outputString = "The computer drew rock, you won!";
            } else if ("scissors".equals(user)) {
                outputString = "The computer drew rock, you lose...";
            }
        } else if (computerInt == 2) {
            computerString = "paper";
            // Checks and displays if user tied, won or lost
            if ("paper".equals(user)) {
                outputString = "You both drew paper, it's a tie.";
            } else if ("scissors".equals(user)) {
                outputString = "The computer drew paper, you won!";
            } else if ("rock".equals(user)) {
                outputString = "The computer drew paper, you lose...";
            }
        } else {
            computerString = "scissors";
            // Checks and displays if user tied, won or lost
            if ("scissors".equals(user)) {
                outputString = "You both drew scissors, it's a tie.";
            } else if ("rock".equals(user)) {
                outputString = "The computer drew scissors, you won!";
            } else if ("paper".equals(user)) {
                outputString = "The computer drew scissors, you lose...";
            }
        }

        return outputString;
    }

    /**
    * Creating main function.
    *
    * @param args nothing passed in
    */
    public static void main(String[] args) {
        myObj = new Scanner(System.in);
        System.out.print("Welcome to Rock, Paper, Scissors!\n");

        while (true) {
            System.out.print("Enter either rock, paper or scissors: ");
            userInput = myObj.nextLine();
            // Converts user input into all lowercase
            userInput = userInput.toLowerCase();

            // Checks if user inputed one of three options
            if ("rock".equals(userInput) || "paper".equals(userInput)
                    || "scissors".equals(userInput)) {
                break;
            } else {
                // Error message if it's none of the three options
                System.out.print("Please enter one of the three choices.\n\n");
            }
        }

        output = rps(userInput);
        System.out.print(output);

        System.out.print("\n");
        myObj.close();
    }
}
