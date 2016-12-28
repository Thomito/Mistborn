package model;

public class Item {
	
	private String name;
	private Coinage value;
	private double weight;
	
	public Item(){
		
	}
	
	public Item(String name, Coinage value){
		this.name = name;
		this.value = value;
	}
	
	public Item(String name, Coinage value, double weight){
		this.name = name;
		this.value = value;
		this.weight = weight;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Coinage getValue(){
		return this.value;
	}
	
	public void setValue(Coinage value){
		this.value = value;
	}
	
	public double getWeight(){
		return this.weight;
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
}
