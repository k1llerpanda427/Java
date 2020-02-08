import java.util.Scanner;
import java.io.*;
public class ChizmarJProject1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Personality Test!");
		
		//Initializing variables
		String firstName;
		String menuOption;
		String chosenLetter;
		
		//creates a scanner
		Scanner keyboard = new Scanner(System.in);
		
		do{
		
		//start the menu option
		System.out.println("Please select a menu option: ");
		System.out.println("A. Append a personality test");
		System.out.println("B. Evaluate the unprocessed personality tests");
		System.out.println("C. Count and display how many people tested fell into each personality range");
		System.out.println("D. Quit");
		menuOption = keyboard.nextLine();
		
		//loop for the menu
		while (!menuOption.equalsIgnoreCase("A") && !menuOption.equalsIgnoreCase("B") && !menuOption.equalsIgnoreCase("C") && !menuOption.equalsIgnoreCase("D")) {
			System.out.println("That is not a valid option. Please select a valid option:  ");
			menuOption = keyboard.nextLine();
		}
		
		
			
		
		
		//Menu option A
		
		//Makes it so I can append to the file
		
		
		if (menuOption.equalsIgnoreCase("A"))
		{
			//FileWriter fwriter = new FileWriter("UnprocessedTests.txt", true);
			PrintWriter outputFile = new PrintWriter("UnprocessedTests.txt");
			System.out.println("Please tell me your name: ");
			firstName = keyboard.nextLine();
			outputFile.println(firstName);
			
			//Validation for Name
			while (firstName.equals("")){
				System.out.println("That is not a valid first name. Please input a valid name.");
				firstName = keyboard.nextLine();	}
			
			//Opens the file with the questions in it
			File personalityQuestion = new File("personalityQuestions.txt");
			Scanner questionFile = new Scanner(personalityQuestion);
					
			//Reads the file until there is no more text
			while (questionFile.hasNext()){
				
				System.out.println(questionFile.nextLine());
				System.out.println(questionFile.nextLine());
				System.out.println(questionFile.nextLine());
				System.out.println(questionFile.nextLine());
				System.out.println(questionFile.nextLine());
				
				//asking the user to select an option
				System.out.println("Please select an option: ");
				chosenLetter = keyboard.nextLine();
				
				//Validation for what option the user chooses
				while (!chosenLetter.equalsIgnoreCase("A") && !chosenLetter.equalsIgnoreCase("B") && !chosenLetter.equalsIgnoreCase("C") && !chosenLetter.equalsIgnoreCase("D")) {
					System.out.println("That is not a valid input! Please enter a valid input:  ");
					chosenLetter = keyboard.nextLine();
				}
				//writes the user option to the file	
				outputFile.println(chosenLetter);
				
			}
		//closing the file so the code actually writes to the disk	
		outputFile.close();
			
		}
				
		//Menu option B
		if (menuOption.equalsIgnoreCase("B")) 
		{
			
			int totalScore;
			
			//setting up a print writer to append what personality type a person is
			//FileWriter resultWriter = new FileWriter("resultTests.txt", true);
			PrintWriter resultOutput = new PrintWriter("resultTests.txt");
			
			//opens the file with the appended answers
			File unprocessedTests = new File("UnprocessedTests.txt");
			Scanner answersFile = new Scanner(unprocessedTests);
			
			//Reading the lines of the file 
			while (answersFile.hasNext()) {
				
				
				//setting the total score equal to 0
				totalScore = 0;
				String personalityType = "";
				
					//initializing variables
					String userAnswers;
					resultOutput.println(answersFile.nextLine());
					
					//question1
					userAnswers = answersFile.nextLine();
					if (userAnswers.equalsIgnoreCase ("A")){
						totalScore += 3;
					}
					else if(userAnswers.equalsIgnoreCase ("B")){
						totalScore += 1;
					}
					else if(userAnswers.equalsIgnoreCase ("C")){
						totalScore += 6;
					}
					else if(userAnswers.equalsIgnoreCase ("D")){
						totalScore += 2;
					}
					
					//question 2
					userAnswers = answersFile.nextLine();
					if (userAnswers.equalsIgnoreCase ("A")){
						totalScore += 2;
					}
					else if(userAnswers.equalsIgnoreCase ("B")){
						totalScore += 1;
					}
					else if(userAnswers.equalsIgnoreCase ("C")){
						totalScore += 3;
					}
					else if(userAnswers.equalsIgnoreCase ("D")){
						totalScore += 4;
					}
					
					//question 3
					userAnswers = answersFile.nextLine();
					if (userAnswers.equalsIgnoreCase ("A")){
						totalScore += 2;
					}
					else if(userAnswers.equalsIgnoreCase ("B")){
						totalScore += 1;
					}
					else if(userAnswers.equalsIgnoreCase ("C")){
						totalScore += 3;
					}
					else if(userAnswers.equalsIgnoreCase ("D")){
						totalScore += 4;
					}
					
					//question 4
					userAnswers = answersFile.nextLine();
					if (userAnswers.equalsIgnoreCase ("A")){
						totalScore += 3;
					}
					else if(userAnswers.equalsIgnoreCase ("B")){
						totalScore += 1;
					}
					else if(userAnswers.equalsIgnoreCase ("C")){
						totalScore += 2;
					}
					else if(userAnswers.equalsIgnoreCase ("D")){
						totalScore += 6;
					}
					
					//question 5
					userAnswers = answersFile.nextLine();
					if (userAnswers.equalsIgnoreCase ("A")){
						totalScore += 1;
					}
					else if(userAnswers.equalsIgnoreCase ("B")){
						totalScore += 2;
					}
					else if(userAnswers.equalsIgnoreCase ("C")){
						totalScore += 5;
					}
					else if(userAnswers.equalsIgnoreCase ("D")){
						totalScore += 3;
					}
					
					//question 6
					userAnswers = answersFile.nextLine();
					if (userAnswers.equalsIgnoreCase ("A")){
						totalScore += 3;
					}
					else if(userAnswers.equalsIgnoreCase ("B")){
						totalScore += 1;
					}
					else if(userAnswers.equalsIgnoreCase ("C")){
						totalScore += 4;
					}
					else if(userAnswers.equalsIgnoreCase ("D")){
						totalScore += 2;
					}
					
					//question 7
					userAnswers = answersFile.nextLine();
					if (userAnswers.equalsIgnoreCase ("A")){
						totalScore += 2;
					}
					else if(userAnswers.equalsIgnoreCase ("B")){
						totalScore += 1;
					}
					else if(userAnswers.equalsIgnoreCase ("C")){
						totalScore += 3;
					}
					else if(userAnswers.equalsIgnoreCase ("D")){
						totalScore += 4;
					}
					
					//question 8 
					userAnswers = answersFile.nextLine();
					if (userAnswers.equalsIgnoreCase ("A")){
						totalScore += 4;
					}
					else if(userAnswers.equalsIgnoreCase ("B")){
						totalScore += 3;
					}
					else if(userAnswers.equalsIgnoreCase ("C")){
						totalScore += 2;
					}
					else if(userAnswers.equalsIgnoreCase ("D")){
						totalScore += 5;
					}
					
					//question 9 
					userAnswers = answersFile.nextLine();
					if (userAnswers.equalsIgnoreCase ("A")){
						totalScore += 6;
					}
					else if(userAnswers.equalsIgnoreCase ("B")){
						totalScore += 4;
					}
					else if(userAnswers.equalsIgnoreCase ("C")){
						totalScore += 8;
					}
					else if(userAnswers.equalsIgnoreCase ("D")){
						totalScore += 2;
					}
					
					//question 10
					userAnswers = answersFile.nextLine();
					if (userAnswers.equalsIgnoreCase ("A")){
						totalScore += 7;
					}
					else if(userAnswers.equalsIgnoreCase ("B")){
						totalScore += 5;
					}
					else if(userAnswers.equalsIgnoreCase ("C")){
						totalScore += 1;
					}
					else if(userAnswers.equalsIgnoreCase ("D")){
						totalScore += 3;
					}		
					
					//Deciding a personality type for the user
					if(totalScore >= 12 && totalScore <= 20){
						personalityType = ("Personality Type 1");
					}
					else if(totalScore >= 21 && totalScore <= 30){
						personalityType = ("Personality Type 2");
					}
					else if(totalScore >= 31 && totalScore <= 42){
						personalityType = ("Personality Type 3");
					}
					else if(totalScore >= 34 && totalScore <= 53){
						personalityType = ("Personality Type 4");
					}
					
					resultOutput.println(personalityType);
				
			}
				
			
		resultOutput.close();
		System.out.println("Data has been initialized.");
		
		PrintWriter deleteTests = new PrintWriter("UnprocessedTests.txt");
		deleteTests.close();
		}
		
		//Menu Option C
		if(menuOption.equalsIgnoreCase("C")){
			
			//to read the file 
			File finishedTests = new File("resultTests.txt");
			Scanner finishedFile = new Scanner(finishedTests);
			String finalType;
			int personality1 = 0;
			int personality2 = 0;
			int personality3 = 0;
			int personality4 = 0;
			
			String userName = finishedFile.nextLine();
			
			
			//This accumulates the personality types that were gathered from the last file
			while (finishedFile.hasNextLine()) {
				
				finalType = finishedFile.nextLine();
				
				if (finalType.equalsIgnoreCase("Personality Type 1")){
					personality1 += 1;
				}
				else if (finalType.equalsIgnoreCase("Personality Type 2")) {
					personality2 += 1;
				}
				else if (finalType.equalsIgnoreCase("Personality Type 3")) {
					personality3 += 1;
				}
				else if (finalType.equalsIgnoreCase("Personality Type 4")){
					personality4 += 1;
				}
				
				
			}
			
			//prints out the different types
			System.out.println("Here are the personality types:  ");
			System.out.println("Personality Type 1:  " + personality1);
			System.out.println("Personality Type 2:  " + personality2);
			System.out.println("Personality Type 3:  " + personality3);
			System.out.println("Personality Type 4:  " + personality4);
			
			
			finishedFile.close();
			
			
			
			
		}
		
		
		}
		
		while(!menuOption.equalsIgnoreCase("D"));
			
		
		
		
	}
	

}
