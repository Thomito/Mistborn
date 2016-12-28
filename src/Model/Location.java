package model;

import java.util.ArrayList;

public class Location {

	private String name;
	private ArrayList<Location> sublocations; 
	private ArrayList<Character> locationchars;
	private Container locationitems;
	
	
	
	
	public Location(String name, ArrayList<Location> sublocations, ArrayList<Character> locationchars,
			Container locationitems) {
		super();
		this.name = name;
		this.sublocations = sublocations;
		this.locationchars = locationchars;
		this.locationitems = locationitems;
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<Location> getSublocations() {
		return sublocations;
	}
	public ArrayList<Character> getLocationchars() {
		return locationchars;
	}
	public void setLocationchars(ArrayList<Character> locationchars) {
		this.locationchars = locationchars;
	}
	public Container getLocationitems() {
		return locationitems;
	}
	public void setLocationitems(Container locationitems) {
		this.locationitems = locationitems;
	}
	
	public void DeleteLocationItem(Item i){
		this.locationitems.DeleteItem(i);
	}

	public void AddLocationItem(Item i){
		this.locationitems.AddItem(i);
	}
	
	public void addCharacter(Character c){
		this.locationchars.add(c);
	}
	
	public void deleteChar(Character c){
		this.locationchars.remove(c);
	}
	
}
