package gamecontrollers;

import java.util.ArrayList;
import java.util.List;

import menucontrollers.MenuController;
import model.Game;

public class GameController {
	private MenuController menuController;
	
	private List<Game> savedGames;
	private Game currentGame;
	
	public GameController(MenuController menuController){
		this.menuController = menuController;
		this.savedGames = new ArrayList<>();
		this.currentGame = new Game("test");
		this.menuController.setGameController(this);
	}
	
	public void startNewGame(){
		
	}
	
	public void loadGame(int selection){
		setCurrentGame(getSavedGames().get(selection));
	}
	
	public Game getCurrentGame(){
		return currentGame;
	}
	
	public void setCurrentGame(Game game){
		this.currentGame = game;
	}
	
	public List<Game> getSavedGames(){
		return this.savedGames;
	}
	
	private Game initializeGame(){
		return new Game("test");
	}

}
