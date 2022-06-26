package item;

public abstract class Item {
	
	private String type;
	private String name;
	private int effect;
	
	public Item(String newType, String newName, int valueEffect) {
		this.type = newType;
		this.name = newName;
		this.effect = valueEffect;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEffect() {
		return effect;
	}

	public void setEffect(int effect) {
		this.effect = effect;
	}
	
	

}
