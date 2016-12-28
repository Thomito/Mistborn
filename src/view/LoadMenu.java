package view;

import java.util.List;
import java.util.Scanner;

import menucontrollers.MenuController;
import model.Game;

public class LoadMenu implements Menu {

	private MenuController menuController;
	
	public LoadMenu(MenuController menuController) {
		this.menuController = menuController;
	}

	@Override
	public void showMenu() {
		int amountofgames = 1;//Gamecontroller.getSavedGames().size();
		int selection = -1;
		while (selection < 0 || selection > amountofgames)
			selection = askMenu();
		if(selection == 0){
			
		}
		menuController.showStartMenu();
		menuController.getGameController().loadGame(selection);
		
	}

	@Override
	public int askMenu() {
		int selection;
		Scanner input = new Scanner(System.in);

		/***************************************************/

		System.out.println("Welcome Adventurer, which adventure would you like to continue?");
		System.out.println(MenuController.returnOption());
		List<Game> games = menuController.getGameController().getSavedGames();
		for(int i = 0; i < games.size(); i++)	
			System.out.println(i + ". " + games.get(i).getName());			 
		selection = input.nextInt();
		return selection;
	}
}
