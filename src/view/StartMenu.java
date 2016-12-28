package view;

import java.util.Scanner;

public class StartMenu implements Menu{
	
	
	public StartMenu(){
		
	}
	
	@Override
	public void showMenu(){
		int selection = -1;
		while(selection < 1 || selection > 3)
			selection = askMenu();
		switch(selection){
		case 1: //GameController.startnewgame();
			break;
		case 2: //MenuController.showLoadMenu();
			break;
		case 3: System.exit(0);
			break;
		}
	}
	
	@Override
	public int askMenu() {
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

		System.out.println("Welcome Adventurer, what would you like to do?");
        System.out.println("-------------------------\n");
        System.out.println("1 - Start a new game");
        System.out.println("2 - Load game");
        System.out.println("3 - Quit");

        selection = input.nextInt();
        return selection;    
    }
}
