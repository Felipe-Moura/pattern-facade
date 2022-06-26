package item;

public class Sword extends Item{
	
	private int durability;
	private int sharpness;

	public Sword(String newName, int valueEffect) {
		super("Sword", newName, valueEffect);
		this.durability = 10;
		this.sharpness = 5;
	}
	
	public void damage() {
		this.durability--;
		this.sharpness--;
	}
	
	public void repair() {
		this.durability++;
	}
	
	public void sharpen() {
		this.sharpness++;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	public int getSharpness() {
		return sharpness;
	}

	public void setSharpness(int sharpness) {
		this.sharpness = sharpness;
	}
	
	

}
