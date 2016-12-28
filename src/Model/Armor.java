package model;

public class Armor extends Item {

	private int durability;
	private int defense;
	
	public Armor(String name, int value, int durability, int defense){
		super(name, value);
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

