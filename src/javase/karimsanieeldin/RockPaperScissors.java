/*
 * Name: Karim Sanieeldin
 * Date: 28/11/16
 * Version: 1.0
 * Description: This program will ask the user for the amount of games of rock paper 
 * scissors they want to play and generates rock, paper, or scissors. The user then
 * enteres their choice between the three weapons and the results of the game are 
 * recorded (classic game of rock paper scissors).
 */
package javase.karimsanieeldin;

import java.util.Scanner;

/**
 *
 * @author Karim S
 */
public class RockPaperScissors {

    //EXPLANATION OF PROGRAM OUTPUT METHOD
    public static void displayGreeting() {
        System.out.println("Rock Paper Scissors \n\nThis program is a game of Rock, Paper, Scissors\n"
                + "and it is the user against the computer. Rock beats scissors, Paper\n"
                + "beats rock, and scissors beats paper. Good luck!\n");
    }

    //METHOD TO GENERATE RANDOM NUMBER (CPU'S WEAPON CHOICE)
    public static String generateComputersChoice() {

        //RANDOM INT GENERATOR
        int randomNumber = (int) (Math.random() * 3) + 1;

        //SWITCH ASSIGNS NUMBER GENERATED TO A WEAPON
        String weapon = "";
        switch (randomNumber) {
            case 1:
                weapon = "rock";
                break;
            case 2:
                weapon = "paper";
                break;
            case 3:
                weapon = "scissors";
                break;
        }
        //RETURNS "COMPUTERS" CHOICE
        return weapon;
    }

    //METHOD FOR USER INPUT
    public static String enterPlayersChoice() {

        //OBJECT
        Scanner input = new Scanner(System.in);

        //OPTIONS EXPLANATION AND USER INPUT
        System.out.println("You have a choice of picking rock, paper, or scissors.\nChoose your weapon:");
        String userInput = input.nextLine();

        //MAKES USER INPUT LOWER CASE AND RETURNS IT
        String inputLower = userInput.toLowerCase();
        return inputLower;
    }

    //MAIN METHOD
    public static void main(String[] args) {

        //CALLS DISPLAY GREETING METHOD
        displayGreeting();

        //OBJECT
        Scanner input = new Scanner(System.in);

        //VARIABLES
        String player;
        String comp;
        int ties = 0;
        int playerWins = 0;
        int compWins = 0;
        int games = -1;

        //LOOP ASKS USER FOR NUMBER OF GAMES THEY WANT TO PLAY AND SETS MAIN LOOP TO THAT AMOUNT
        while (games < 0) {
            System.out.println("How many games would you like to play up to?");
            games = input.nextInt();
        }

        //LOOP THAT GOES UP TO AS MANY GAMES AS USER ENETERED
        for (int i = 0; i < games; i++) {

            //CALLS USER INPUT METHOD
            player = enterPlayersChoice();

            //CALLS COMPUTERS CHOICE METHOD
            comp = generateComputersChoice();

            //IF STATEMENT CHECKS RESULTS OF THE GAME AND ASSIGNS RESULTS TO VARIABLES ACCORDINGLY
            if (player.equals(comp)) {
                System.out.println("It's a tie!\n");
                ties++;
            } else if (player.equals("rock") && comp.equals("scissors")) {
                System.out.println("You win!\n");
                playerWins++;
            } else if (comp.equals("rock") && player.equals("scissors")) {
                System.out.println("You lose!\n");
                compWins++;
            } else if (player.equals("scissors") && comp.equals("paper")) {
                System.out.println("You win!\n");
                playerWins++;
            } else if (comp.equals("scissors") && player.equals("paper")) {
                System.out.println("You lose!\n");
                compWins++;
            } else if (player.equals("paper") && comp.equals("rock")) {
                System.out.println("You Win!\n");
                playerWins++;
            } else if (comp.equals("paper") && player.equals("rock")) {
                System.out.println("You lose!\n");
                compWins++;
            } else {
                System.out.println("Invalid user input!\n");
                i--;
            }
        }
        //RESULTS OF THE ENTIRE GAME
        System.out.println("Here are the results:\nTies: " + ties + "\nComputer Wins: "
                + compWins + "\nPlayer Wins: " + playerWins);
    }
}
