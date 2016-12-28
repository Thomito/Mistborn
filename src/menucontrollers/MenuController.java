package menucontrollers;

import gamecontrollers.GameController;
import view.LoadMenu;
import view.StartMenu;

public class MenuController {
	
	private GameController gameController;
	
	StartMenu startmenu;
	LoadMenu loadmenu;
	
	public MenuController(){
		startmenu = new StartMenu(this);
		loadmenu = new LoadMenu(this);
	}
	
	public void setGameController(GameController gameController){
		this.gameController = gameController;
	}
	
	public GameController getGameController(){
		return this.gameController;
	}
	
	public void showStartMenu(){
		startmenu.showMenu();
	}
	
	public void showLoadMenu(){
		loadmenu.showMenu();
	}
	
	public static String returnOption(){
		return " <0 to go to back>\n----------------";
	}
}
