package model;

public class Armor extends Item {

	private int durability;
	private int defense;
	
	public Armor(String name, Coinage value, double weight, int durability, int defense){
		super(name, value, weight);
		this.durability = durability;
		this.defense = defense;
	}
	
	public int getDurability(){
		return this.durability;
	}
	
	public int getDefense(){
		return this.defense;
	}
	
	public void setDurability(int durability){
		this.durability = durability;
	}
	
}

