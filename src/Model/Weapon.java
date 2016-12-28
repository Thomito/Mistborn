package model;

public class Weapon extends Item {

	private int attack;
	private int durability;
	private int speed;
	public Weapon (String name, int value, int attack, int durability, int speed){
		super(name, value);
		this.attack = attack;
		this.durability = durability;
		this.speed = speed;
	}
	
	public int getAttack(){
		return this.attack;
	}
	
	public int getDurability(){
		return this.durability;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public void setDurability(){
		this.durability = durability;
	}
}
