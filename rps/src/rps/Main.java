package rps;
import java.util.Scanner;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String computer = "";
		String user = "";
		
		int computerRandom = 0;
		int userInput = 0;
		
		boolean playAgain = false;
		boolean userWin = false;
		boolean isTie = false;
		
		//1 = rock, 2 = paper, 3 = scissors
		do {
			userWin = false;
			isTie = false;
			computerRandom = random.nextInt(1, 3+1);
			if(computerRandom == 1) {
				computer = "rock";
			}
			else if(computerRandom == 2) {
				computer = "paper";
			}
			else if(computerRandom == 3) {
				computer = "scissors";
			}
			
			System.out.println("Welcome to Tony's RPS program!!! ");
			System.out.print("Please enter 'Rock, Paper, or Scissors': ");
			user = scanner.nextLine();
			user = user.toLowerCase();
			if(!user.contains("rock") && !user.contains("paper") && !user.contains("scissors")) {
				do {
					System.out.print("Please enter a valid user input: ");
					user = scanner.nextLine();
					
				} while(!user.contains("rock") && !user.contains("paper") && !user.contains("scissors"));
			}
			else if(user.contains("rock")){
				userInput = 1;
			}
			else if(user.contains("paper")) {
				userInput = 2;
			}
			else if(user.contains("scissors")) {
				userInput = 3;
			}
//WIN CONDITIONS
			if(computerRandom == userInput) {
				isTie = true;
				userWin = false;
			}
			else if(computerRandom == 1 && userInput == 2) {
				userWin = true;
			}
			else if(computerRandom == 2 && userInput == 3)	{
				userWin = true;
			}
			else if(computerRandom == 3 && userInput == 1) {
				userWin = true;
			}
//LOSE CONDITIONS
			if(userInput == 1 && computerRandom == 2) {
				userWin = false;
			}
			else if(userInput == 2 && computerRandom == 3) {
				userWin = false;
			}
			else if(userInput == 3 && computerRandom == 1) {
				userWin = false;
			}
			
			System.out.println("Computer chose " + computer + " and you chose " + user + ".");
			
			
			if(isTie == true) {
				System.out.println("It's a tie! ");
			}
			else if(isTie == false && userWin == true) {
				System.out.println("You Win! ");
			}
			else if(isTie == false && userWin == false) {
				System.out.println("You Lose! Haha you suck!!! ");
			}
			
			System.out.println("Do you want to play again?: (Y/N): ");
			user = scanner.nextLine();
			user = user.toLowerCase();
			
			if(!user.contains("y") && !user.contains("n")){
				do {
					System.out.print("Please enter a valid user input: ");
					user = scanner.nextLine();
					user = user.toLowerCase();
					
				}while(!user.contains("y") && !user.contains("n"));
			}
			else if (user.contains("y")) {
				playAgain = true;
			}
			else if(user.contains("n")) {
				playAgain = false;
				System.out.println("Exiting... ");
				System.exit(0);
			}
			
			
			
		}while(playAgain);
		
		
	}
	

}
