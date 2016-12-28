import gamecontrollers.GameController;
import menucontrollers.MenuController;

public class Main {

	public static void main(String[] args){
		System.out.println("Application running ...");
		
		MenuController menuController = new MenuController();
		GameController gameController = new GameController(menuController);
		menuController.showStartMenu();
		
	}
}
