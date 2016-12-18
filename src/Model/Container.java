package Model;

import java.util.ArrayList;

public class Container extends Item {

	private ArrayList<Item> inventory;
	private int capacity;
	
	public Container(String name, int value) {
		super(name, value);
		inventory = new ArrayList();
	}

	public Container(String name, int value, ArrayList<Item> inventory){
		super(name, value);
		this.inventory = inventory;
	}
	
	public void DeleteItem(Item i){
		this.inventory.remove(i);
	}
	
	public void AddItem(Item i){
		this.inventory.add(i);
	}

	public ArrayList<Item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}
	
}
