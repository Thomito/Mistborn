package view;

import java.util.Scanner;

import gamecontrollers.GameController;
import menucontrollers.MenuController;

public class StartMenu implements Menu{
	
	private MenuController menuController;
	
	public StartMenu(MenuController menuController){
		this.menuController = menuController;
	}
	
	@Override
	public void showMenu(){
		int selection = -1;
		while(selection < 1 || selection > 3)
			selection = askMenu();
		switch(selection){
		case 1: menuController.getGameController().startNewGame();
			break;
		case 2: menuController.showLoadMenu();
			break;
		case 3: System.exit(0);
			break;
		}
	}
	
	@Override
	public int askMenu() {
        int selection;
        Scanner input = new Scanner(System.in);
		System.out.println("Welcome Adventurer, what would you like to do?");
        System.out.println("----------------------------------------------");
        System.out.println("1 - Start a new game");
        System.out.println("2 - Load game");
        System.out.println("3 - Quit");
        System.out.println("--------------------");

        selection = input.nextInt();
        return selection;    
    }
}
