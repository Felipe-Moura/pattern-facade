package item;

public class Boot extends Item {
	
	private String collor;
	private int durability;

	public Boot(String newName, int valueEffect, String newCollor) {
		super("Boot", newName, valueEffect);
		this.collor = newCollor;
		this.durability = 10;
	}
	
	public void damage() {
		this.durability--;
	}
	
	public void repair() {
		this.durability++;
	}

	public String getCollor() {
		return collor;
	}

	public void setCollor(String collor) {
		this.collor = collor;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}
	
	

}
