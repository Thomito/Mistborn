package Model;

import java.util.HashMap;

public class Character {

	private String name;
	private int age;
	private boolean gender;
	private int health;
	private Weapon weapon;
	private Armor armor;
	private HashMap<Character, Integer> reputation;
	private HashMap<MetalType, Boolean> allomancy;
	private HashMap<MetalType, Boolean> feruchemy;
	private HashMap<MetalType, Boolean> hemalurgy;
	private Location location;
	private Container inventory;
	private Container coinage;
	
	public Character(String name, int age, boolean gender, int health, Weapon weapon, Armor armor,
			HashMap<Character, Integer> reputation, HashMap<MetalType, Boolean> allomancy,
			HashMap<MetalType, Boolean> feruchemy, HashMap<MetalType, Boolean> hemalurgy, Location location, Container inventory, Container coinage) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.health = health;
		this.weapon = weapon;
		this.armor = armor;
		this.reputation = reputation;
		this.allomancy = allomancy;
		this.feruchemy = feruchemy;
		this.hemalurgy = hemalurgy;
		this.location = location;
		this.inventory = inventory;
		this.coinage = coinage;
	}
	

	public Character(String name, int age, boolean gender, int health, Weapon weapon, Armor armor, 
			HashMap<Character, Integer> reputation, Location location, Container inventory, Container coinage) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.health = health;
		this.weapon = weapon;
		this.armor = armor;
		this.reputation = reputation;
		this.allomancy = new HashMap();
		this.feruchemy = new HashMap();
		this.hemalurgy = new HashMap();
		this.location = location;
		this.inventory = inventory;
		this.coinage = coinage;
	}

	public Character(String name, int age, boolean gender, int health, Weapon weapon, Armor armor, Location location, Container inventory, Container coinage) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.health = health;
		this.weapon = weapon;
		this.armor = armor;
		this.reputation = new HashMap();
		this.allomancy = new HashMap();
		this.feruchemy = new HashMap();
		this.hemalurgy = new HashMap();
		this.location = location;
		this.inventory = inventory;
		this.coinage = coinage;
	}


	//SETTERS
	
	public void setLocation(Location location){
		this.location = location;
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	public void setWeapon(Weapon weapon){
		this.weapon = weapon;
	}
	
	public void setArmor(Armor armor){
		this.armor = armor;
	}
	
	public void setReputation(HashMap<Character, Integer> reputation){
		this.reputation = reputation;
	}
	
	public void changeReputation(Character c, int rep){
		getReputation().put(c, rep);
	}
	
	//GETTERS
	
	public Location getLocation(){
		return this.location;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public boolean getGender(){
		return this.gender;
	}
	
	public int getHealth(){
		return this.health;
	}
	
	public Weapon getWeapon(){
		return this.weapon;
	}
	
	public Armor getArmor(){
		return this.armor;
	}
	
	
	public HashMap<Character, Integer> getReputation(){
		return this.reputation;
	}
	
	public void Travel(Location l){
		this.location.deleteChar(this);
		this.setLocation(l);
		this.location.addCharacter(this);
	}
	
	public void TakeItem(Item i, Container c){
		c.DeleteItem(i);
		this.AddItem(i);
	}
	
	public boolean AddItem(Item i){
		
		
		
		return true;
	}
	
	public void Move(){
		
	}
	
	public void Attack(){
		
	}
	
	public void Talk(){
		
	}
	
	public void Search(){
		
	}
	
	
}
