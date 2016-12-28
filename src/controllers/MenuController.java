package controllers;

import view.LoadMenu;
import view.StartMenu;

public class MenuController {
	
	StartMenu startmenu;
	LoadMenu loadmenu;
	
	public MenuController(){
		startmenu = new StartMenu();
		loadmenu = new LoadMenu();
		
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
