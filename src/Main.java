import controllers.MenuController;

public class Main {

	public static void main(String[] args){
		System.out.println("Application running ...");
		
		MenuController menucontroller = new MenuController();
		
		menucontroller.showStartMenu();
		
	}
}
