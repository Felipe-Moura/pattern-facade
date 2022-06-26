package player;

import java.util.ArrayList;

public class Player {
	
	private ArrayList<Integer> position = new ArrayList();
	public Inventory playerInventory = new Inventory();
	private int baseMove;
	private int baseDamage;
	
	public Player(int baseMoveValue, int baseDamageValue) {
		this.baseMove = baseMoveValue;
		this.baseDamage = baseDamageValue;
		this.initialPosition();
	}
	
	public void initialPosition() {
		if(this.position.isEmpty()) {
			for(int i = 0; i < 2; i++) {
				this.position.add(0);
			}
		}
		else {
			for(int i = 0; i < 2; i++) {
				this.position.set(i, 0);
			}
		}
	}

	public ArrayList<Integer> getPosition() {
		return position;
	}

	public void setPosition(ArrayList<Integer> position) {
		this.position = position;
	}

	public int getBaseMove() {
		return baseMove;
	}

	public void setBaseMove(int baseMove) {
		this.baseMove = baseMove;
	}

	public int getBaseDamage() {
		return baseDamage;
	}

	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
	
	

}
