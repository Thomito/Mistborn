package model;

public class Coinage extends Item{

	
	private int bronze;
	private int silver;
	private int gold;
	
	public Coinage(int bronze, int silver, int gold){
		super("coins", null, 0);
		this.bronze = bronze;
		this.silver = silver;
		this.gold = gold;
		super.setValue(this);
	}

	public int getBronze() {
		return bronze;
	}

	public void setBronze(int bronze) {
		this.bronze = bronze;
	}

	public int getSilver() {
		return silver;
	}

	public void setSilver(int silver) {
		this.silver = silver;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	
}
